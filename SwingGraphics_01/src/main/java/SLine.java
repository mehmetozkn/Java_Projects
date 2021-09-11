
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;

public class SLine extends Shape {

    Point start;
    Point end;
    Color color;
    int thickess;

    public SLine(Point start, Point end, Color color, int thickess) {
        this.start = start;
        this.end = end;
        this.color = color;
        this.thickess = thickess;
    }

    @Override
    public void Draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Stroke s = new BasicStroke(this.thickess, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2d.setStroke(s);
        g2d.setColor(this.color);
        g2d.drawLine(this.start.x, this.start.y, this.end.x, this.end.y);
    }

}
