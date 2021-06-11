
import java.awt.*;
import javax.swing.*;

public class G_3 {

    public static void main(String args[]) {
        JFrame f = new JFrame();

        f.add(new JComponent() {
            public void paintComponent(Graphics g) {

                // Basic sizes
                int centerX = 150, centerY = 100;
                int Width = 200, Height = 100;

                // Draw rectganle with Graphics2D
                Graphics2D g2 = (Graphics2D) g;
                int thickness = 4; // thickness.
                Stroke oldStroke = g2.getStroke();
                g2.setStroke(new BasicStroke(thickness)); // Set the rectangular perimeter thickness 
                g2.setColor(Color.GREEN); // Set the color of the rectangular.
                g2.drawRect(centerX - Width / 2, centerY - Height / 2, Width, Height); // Set and Draw the size of the rectangular
                g2.setStroke(oldStroke);

                // Draw oval
                g.setColor(Color.BLACK); // Set the color of the oval.
                g.drawOval(centerX / 2, centerY / 2 + 25, 50, 50); // Set and Draw the size of the oval.
                g.fillOval(centerX / 2, centerY / 2 + 25, 50, 50); // Fill the oval.

                // Draw another oval.
                g.setColor(Color.BLUE); // Set the color of the oval
                g.drawOval(centerX + 10, centerY / 2 + 25, 50, 50); // Set and Draw the size of the oval.
                g.fillOval(centerX + 10, centerY / 2 + 25, 50, 50); // Fill the circle.

            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close the program when pressing the cross 
        f.setSize(300, 300); // Frame size
        f.setLocationRelativeTo(null); // To open the screen in the middle.
        f.setVisible(true);
        f.setResizable(false);

    }
}
