
public class Personnel {
    // Class in which all the qualifications of the personnel are kept.
    private int id;
    private String ad;
    private String soyad;
    private String email;
    private String password;
    private String departman;
    private int maas;
    private String checkin;
    private String checkout;
    private int lateday;
    private int per;

    public Personnel(int id, int lateday, int per) {
        this.id = id;
        this.lateday = lateday;
        this.per = per;
    }
  
     
    

    public Personnel(int id, String ad, String soyad, String email, String password, String departman, int maas, String checkin, String checkout) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.password = password;
        this.departman = departman;
        this.maas = maas;
        this.checkin = checkin;
        this.checkout = checkout;
        this.lateday = lateday;
        this.per = per;
        
        

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public int getLateday() {
        return lateday;
    }

    public void setLateday(int lateday) {
        this.lateday = lateday;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

}
