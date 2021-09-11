
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class G_1 {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new JComponent() {
            public void paintComponent(Graphics g) {
                
                String text = "ISTANBUL";
                 // Basic sizes
                int centerX = 150, centerY = 100;
                int Width = 200, Height = 100;

                // Draw rectganle
                g.setColor(Color.red); // Set the color of the rectangular.
                g.drawRect(centerX - Width / 2, centerY - Height / 2, Width, Height); // Set and Draw the size of the rectangular.

                // Draw centered text
                FontMetrics fm = g.getFontMetrics();
                double textWidth = fm.getStringBounds(text, g).getWidth(); // Set and Draw the size of the text.
                g.setColor(Color.red);// Set the color of the text.
                g.drawString(text, (int) (centerX - textWidth / 2), (int) (centerY + fm.getMaxAscent() / 2)); // Set the size of the text.

            }
        });
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // To close the program when pressing the cross.
        f.setSize(300, 300); // Frame size
        f.setLocationRelativeTo(null); // To open the screen in the middle.
        f.setVisible(true);
        f.setResizable(false);

    }
}
