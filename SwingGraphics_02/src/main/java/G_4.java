
import java.awt.*;
import javax.swing.*;

public class G_4 {

    public static void main(String args[]) {
        JFrame f = new JFrame();

        f.add(new JComponent() {
            public void paintComponent(Graphics g) {

                // Draw rectganle with Graphics2D
                Graphics2D g2 = (Graphics2D) g;
                int thickness = 4; // thickness.
                Stroke oldStroke = g2.getStroke();
                g2.setStroke(new BasicStroke(thickness)); // Set the square perimeter thickness.
                g2.setColor(Color.BLUE); // Set the color of the square.
                g2.drawRect(100, 100, 80, 80); // Set and Draw the size of the square.

                g2.setStroke(new BasicStroke(thickness));// Set the line perimeter thickness 
                g2.drawLine(90, 100, 90, 180); // Set and Draw the size of the line.
                g2.drawLine(190, 100, 190, 180);// Set and Draw the size of the line.

                g2.drawRect(220, 100, 80, 80); // Set and Draw the size of the rect.
                g2.drawLine(210, 100, 210, 180);// Set and Draw the size of the line.
                g2.drawLine(310, 100, 310, 180);// Set and Draw the size of the line.

            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close the program when pressing the cross 
        f.setSize(400, 370); // Frame size
        f.setLocationRelativeTo(null); // To open the screen in the middle.
        f.setVisible(true);
        f.setResizable(false);

    }
}
