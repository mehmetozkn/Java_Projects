
import java.awt.*;
import javax.swing.*;

public class G_2 {

    public static void main(String args[]) {
        JFrame f = new JFrame();
        f.add(new JComponent() {
            public void paintComponent(Graphics g) {

                String text = "ISTANBUL";
                // Basic sizes
                int centerX = 150, centerY = 100;
                int Width = 200, Height = 100;

                // Draw oval
                g.setColor(Color.BLUE);  // Set the color of the rectangular.
                g.fillOval(centerX - Width / 2, centerY - Height / 2, Width, Height); // Set and Draw the size of the rectangular.

                // Draw centered text
                FontMetrics fm = g.getFontMetrics();
                double textWidth = fm.getStringBounds(text, g).getWidth(); // Set and Draw the size of the text.
                g.setColor(Color.WHITE); // Set the color of the text.
                g.drawString(text, (int) (centerX - textWidth / 2), (int) (centerY + fm.getMaxAscent() / 2)); // Set the size of the text.

            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to close the program when pressing the cross
        f.setSize(300, 300); // Frame size
        f.setLocationRelativeTo(null); // to open the screen in the middle
        f.setVisible(true);
        f.setResizable(false);
    }
}
