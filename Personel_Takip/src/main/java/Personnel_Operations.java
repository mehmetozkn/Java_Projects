
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Personnel_Operations {

    private Connection conn = null;
    private Statement statement = null;
    private ResultSet rs = null;
    private PreparedStatement preparedStatement = null;
    private ArrayList<Personnel> personeller = new ArrayList<>();
    public static String name;
    public static String surname;
    public static int id;

    public void pullData() { // Pull extra information from extra table that id.

        try {
            for (Personnel personel : personeller) {

                String query = "SELECT * FROM EKSTRA where ID = " + personel.getId();
                statement = conn.createStatement();
                rs = statement.executeQuery(query);
                while (rs.next()) {
                    int late = rs.getInt("LATEDAY");
                    int per = rs.getInt("PERMISSIONDAY");
                    personel.setLateday(late);
                    personel.setPer(per);
                    
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Personnel> pullExtra() {
        // Pull extra information from extra table.
        ArrayList<Personnel> cikti = new ArrayList<>();
        try {

            String query = "SELECT * FROM EKSTRA";
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("ID");
                int late = rs.getInt("LATEDAY");
                int per = rs.getInt("PERMISSIONDAY");
                Personnel personel = new Personnel(id, late, per);
                personel.setId(id);
                personel.setLateday(late);
                personel.setPer(per);
                cikti.add(personel);

            }

            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public boolean repeatEmail(String reamil) {
        // In order to prevent this when the staff wants to register with the same mail.
        try {

            String query = "SELECT * FROM PERSONNEL";
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String email = rs.getString("EMAIL");
                if (email.equals(reamil)) {
                    return false;
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);

        }

        return true;

    }

    public void addExtraInformation(int id, int late, int per) {
        // Add staff attributes to the extra table.
        String query;

        try {

            conn = DriverManager.getConnection(Database.url, Database.user_name, Database.password);

            query = "SELECT * FROM EKSTRA where ID = " + id;
            rs = statement.executeQuery(query);
            if (rs.next()) {
                String update_query = String.format("UPDATE EKSTRA SET LATEDAY = %d , PERMISSIONDAY = %d where ID = %d ", late, per, id);
                statement.executeUpdate(update_query);

            } else {

                String insert_query = String.format("INSERT INTO EKSTRA (ID,LATEDAY,PERMISSIONDAY) VALUES (%d,%d,%d)", id, late, per);
                statement.executeUpdate(insert_query);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Personnel_Operations() { 
    // Connection the database. 
        String url = "jdbc:derby://localhost:1527/COMPANY";

        try {

            conn = DriverManager.getConnection(url, Database.user_name, Database.password);
            //  System.out.println("Connection Succesful.");

        } catch (SQLException ex) {

            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection Failed.");

        }

    }

    public boolean staffLogin(String mail, String parola) { 
        // Staff entry.
        String query = "SELECT * FROM PERSONNEL";
        try {
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                if (rs.getString("EMAIL").equals(mail) && rs.getString("PASSWORD").equals(parola)) {
                    // If the mail and password are correct, they will log in. 
                    name = (rs.getString("NAME"));
                    surname = (rs.getString("SURNAME"));
                    id = rs.getInt("ID");
                    return true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);

        }
        return false;
    }

    public boolean adminLogin(String mail, String parola) { // Admin entry.
      
        String query = "SELECT * FROM YONETICILER WHERE EMAIL = ? AND PASSWORD = ?";
        // If the mail and password are correct, they will log in. 
        try {
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, mail);
            preparedStatement.setString(2, parola);

            rs = preparedStatement.executeQuery();
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public void staffUpdate(int id, String name, String surname, String email, String password, String departmant, String salary, String checkin, String chechout) {
        // Update personnel information in the database.
        String query = "Update PERSONNEL set NAME = ? , SURNAME = ? , EMAIL = ? , PASSWORD = ? , DEPARTMANT = ?, SALARY = ? , CHECKIN = ? , CHECKOUT = ? where id = ?";

        try {
            preparedStatement = conn.prepareStatement(query);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, departmant);
            preparedStatement.setString(6, salary);
            preparedStatement.setString(7, checkin);
            preparedStatement.setString(8, chechout);
            preparedStatement.setInt(9, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void staffDelete(int id) {
        // Delete personnel information from database.
        String query = "Delete From PERSONNEL where id = ?";

        try {
            preparedStatement = conn.prepareCall(query);

            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {

            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void staffAdd(String name, String surname, String email, String password, String departman, String salary, String checkin, String chechout) {
        // Add personnel information to database.
        int id = 0;
        String query;
        try {

            conn = DriverManager.getConnection(Database.url, Database.user_name, Database.password);
            statement = conn.createStatement();
            query = "SELECT * FROM PERSONNEL";
            rs = statement.executeQuery(query);

            while (rs.next()) {
                int temp = rs.getInt("ID");
                if (temp > id) {
                    id = temp;
                }
            }
            id++;

            preparedStatement = conn.prepareStatement("INSERT INTO PERSONNEL (ID,NAME,SURNAME,EMAIL,PASSWORD,DEPARTMANT,SALARY,CHECKIN,CHECKOUT) VALUES (?,?,?,?,?,?,?,?,?)");

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surname);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, password);
            preparedStatement.setString(6, departman);
            preparedStatement.setString(7, salary);
            preparedStatement.setString(8, checkin);
            preparedStatement.setString(9, chechout);
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Personnel> pullPersonnel() {
        // Pull personel information from the personnel table.
        ArrayList<Personnel> cikti = new ArrayList<>();
        try {
            statement = conn.createStatement();

            String query = "SELECT * FROM PERSONNEL";

            rs = statement.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("ID");
                String ad = rs.getString("NAME");
                String soyad = rs.getString("SURNAME");
                String email = rs.getString("EMAIL");
                String password = rs.getString("PASSWORD");
                String departman = rs.getString("DEPARTMANT");
                int salary = rs.getInt("SALARY");
                String checkin = rs.getString("CHECKIN");
                String checkout = rs.getString("CHECKOUT");
                Personnel p = new Personnel(id, ad, soyad, email, password, departman, salary, checkin, checkout);
                cikti.add(p);
                personeller.add(p);

            }

            return cikti;

        } catch (SQLException ex) {

            Logger.getLogger(Personnel_Operations.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }

    public void setPersoneller(ArrayList<Personnel> personeller) {
        this.personeller = personeller;
    }

    public ArrayList<Personnel> getPersoneller() {
        return personeller;
    }

}
