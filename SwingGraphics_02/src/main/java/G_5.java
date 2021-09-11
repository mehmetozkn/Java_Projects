
import java.awt.*;
import javax.swing.*;

public class G_5 {

    public static void main(String args[]) {
        JFrame f = new JFrame();

        f.add(new JComponent() {
            public void paintComponent(Graphics g) {

                // Draw rectganle with Graphics2D
                Graphics2D g2 = (Graphics2D) g;

                g2.setColor(Color.BLACK); // Set the color of the square.
                g2.drawRect(150, 100, 60, 60); // Set and Draw the size of the square.
                g2.fillRect(150, 100, 60, 60); // Fill the square.

                g2.drawRect(70, 160, 220, 60); // Set and Draw the color of the rect.
                g2.fillRect(70, 160, 220, 60); // Fill the rect.

                g2.setStroke(new BasicStroke(5)); // Set the oval perimeter thickness 
                g2.setColor(Color.BLUE); // Set the color of the oval 
                g2.drawOval(154, 105, 50, 50); // Set and Draw  the oval.

            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close the program when pressing the cross 
        f.setSize(400, 370); // Frame size
        f.setLocationRelativeTo(null); // To open the screen in the middle.
        f.setVisible(true);
        f.setResizable(false);

    }
}
