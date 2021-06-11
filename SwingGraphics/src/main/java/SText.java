
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class SText extends Shape {

    Point start;
    Point end;
    String text;
    Color color;
    int thickess;
    Font font;

    public SText(Point start, String text, Color color, int thickess) {
        this.start = start;
        this.end = end;
        this.text = text;
        this.color = color;
        this.thickess = thickess;
        font = new Font("Comic Sans MS", Font.BOLD, this.thickess);
    }

    @Override
    public void Draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(font);
        g2d.setColor(this.color);
        g2d.drawString(this.text, this.start.x, this.start.y);
    }

    

}
