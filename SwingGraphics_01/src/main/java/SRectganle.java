
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;

public class SRectganle extends Shape {

    Point start;
    Point end;
    int width;
    int height;
    Color color;
    int thickess;

    public SRectganle(Point start, Point end, Color color, int thickess) {
        this.start = new Point(start.x, start.y);
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

    public void Restore(Point astart, Point end) {

        if (start.x > end.x) {
            start.x = end.x;
            width = Math.abs(astart.x - end.x);

        } else if (start.x < end.x){
            width = Math.abs(start.x - end.x);
            height = Math.abs(astart.y - end.y);

        }

        if (start.y > end.y) {
            start.y = end.y;
        } else if (start.y < end.y){
            height = Math.abs(start.y - end.y);

        }

    }

    @Override
    public void Draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Stroke s = new BasicStroke(this.thickess, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER);
        g2d.setStroke(s);
        g2d.setColor(this.color);
        g2d.drawRect(this.start.x, this.start.y, width, height);
    }

}
