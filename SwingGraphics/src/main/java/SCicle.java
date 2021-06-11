
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;

public class SCicle extends Shape {

    Point start;
    Point end;
    int width;
    int height;
    Color color;
    int thickess;

    public SCicle(Point start, Point end, Color color, int thickess) {
        this.start = start;
        this.end = end;

        width = Math.abs(start.x - end.x);
        height = Math.abs(start.y - end.y);
        if (start.x > end.x) {
            start.x = end.x;

        }

        if (start.y > end.y) {
            start.y = end.y;
        }
        this.color = color;
        this.thickess = thickess;
    }

    
    public void Restore(Point start,Point end) {
        width = Math.abs(start.x - end.x);
        height = Math.abs(start.y - end.y);
        if (start.x > end.x) {
            start.x = end.x;

        }

        if (start.y > end.y) {
            start.y = end.y;
        }

    }
    @Override
    public void Draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Stroke s = new BasicStroke(this.thickess, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2d.setStroke(s);
        g2d.setColor(this.color);
        g2d.drawOval(this.start.x, this.start.y, width, height);
    }

   

}
