package Design;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Arrays;
import javax.swing.*;

public class Koordinat  extends JPanel {

    int h = 480, w = 480, id, grid = 20;
    int x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, xt, yt;
    int cs, xmin, ymin, xmax, ymax;
    int poX[], poY[], liX[], liY[], elX[], elY[];
    int triX[], triY[], triXR[], triYR[], reX[], reY[], reXR[], reYR[];

    public Koordinat() {
    }

    public Koordinat(int x1, int y1, int x2, int y2, int id) {
        x1Axis = x1;
        y1Axis = y1;
        x2Axis = x2;
        y2Axis = y2;
        this.id = id;
    }
    
    public Koordinat(int x1, int y1, int x2, int y2, int xT, int yT, int id) {
        x1Axis = x1;
        y1Axis = y1;
        x2Axis = x2;
        y2Axis = y2;
        xt = xT;
        yt = yT;
        this.id = id;
    }
    
    public Koordinat(int x[], int y[], int c[], int id, int cs) {
        poX = liX = triX = reX = x;
        poY = liY = triY = reY = y;
        xmin = c[0];
        xmax = c[1];
        ymin = c[2];
        ymax = c[3];
        this.id = id;
        this.cs = cs;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        
        Graphics2D gr = (Graphics2D) g;
        
        gr.setStroke(new BasicStroke((float)0.2));
        for (int x = 0; x <= w; x += grid) {
            g.setColor(Color.GRAY);
            g.drawLine(x, 0, x, h);
            g.drawLine(0, x, w, x);
            if (x <= w / 2 && x / grid != 0) {
                gr.setColor(Color.BLACK);
                gr.drawString("" + x / grid, w / 2 + x, h / 2 + 15);
                gr.drawString("" + x / grid, w / 2 - 15, h / 2 - x);
                gr.drawString("" + (-x / grid), w / 2 - 15, h / 2 + 10 + x);
                gr.drawString("" + (-x / grid), w / 2 - x, h / 2 + 15);
            }
        }
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(2));
        gr.drawString("X", w-10, h/2-5);
        gr.drawString("Y",w/2+5, 20);
        gr.drawString("0", w/2+3, h/2+15);
        gr.drawLine(0, h / 2, w, h / 2);
        gr.drawLine(w / 2, 0, w / 2, h);
        gr.setStroke(new BasicStroke(2));
        AffineTransform af = new AffineTransform();
        
        switch (id) {
            //----- point and line -----
            case 1:
                Point(gr, x1Axis, y1Axis, x2Axis, y2Axis);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                break;
                
            case 2:
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, 1);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                break;
                
            case 3:
                LineAdd(gr, x1Axis, y1Axis, x2Axis, y2Axis);
                gr.setColor(Color.BLACK);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.setColor(Color.blue);
                gr.drawString("C ("+ (x1Axis+x2Axis) +", "+ (y1Axis+y2Axis) +")", (x1Axis+x2Axis) * grid + w / 2+5, h / 2 - (y1Axis+y2Axis) * grid-5);
                break;
                
            case 4:
                LineSub(gr, x1Axis, y1Axis, x2Axis, y2Axis);
                gr.setColor(Color.BLACK);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.setColor(Color.red);
                gr.drawString("C ("+ (x1Axis-x2Axis) +", "+ (y1Axis-y2Axis) +")", (x1Axis-x2Axis) * grid + w / 2+5, h / 2 - (y1Axis-y2Axis) * grid-5);
            break;
                
            case 5: //translasi
                Translasi(gr, x1Axis, y1Axis, xt, yt);
                gr.setColor(Color.BLACK);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                //gr.drawString("T ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("A' ("+ (x1Axis+xt) +", "+ (y1Axis+yt) +")", (x1Axis+xt) * grid + w / 2+5, h / 2 - (y1Axis+yt) * grid-5);
                
//                Translasi(gr, x2Axis, y2Axis, xt, yt);
//                gr.setColor(Color.BLACK);
//                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
//                //gr.drawString("T ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
//                gr.drawString("B' ("+ (x2Axis+xt) +", "+ (y2Axis+yt) +")", (x2Axis+xt) * grid + w / 2+5, h / 2 - (y2Axis+yt) * grid-5);
            break;
                
            case 6: //vektor
                Line(gr, x1Axis, y1Axis, (x1Axis+xt), (y1Axis+yt), 2);
                Translasi(gr, x1Axis, y1Axis, xt, yt);
                gr.setColor(Color.BLACK);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                //gr.drawString("T ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("A' ("+ (x1Axis+xt) +", "+ (y1Axis+yt) +")", (x1Axis+xt) * grid + w / 2+5, h / 2 - (y1Axis+yt) * grid-5);
                
//                Line(gr, x2Axis, y2Axis, (x2Axis+xt), (y2Axis+yt), 2);
//                Translasi(gr, x2Axis, y2Axis, xt, yt);
//                gr.setColor(Color.BLACK);
//                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
//                //gr.drawString("T ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
//                gr.drawString("B' ("+ (x2Axis+xt) +", "+ (y2Axis+yt) +")", (x2Axis+xt) * grid + w / 2+5, h / 2 - (y2Axis+yt) * grid-5);
                break;
                
                
            default: ;
        }
    }

    void drawArrow(Graphics g1, int x1, int y1, int x2, int y2, int au) {
        Graphics2D g = (Graphics2D) g1.create();
        double dx = x2 - x1, dy = y2 - y1;
        double angle = Math.atan2(dy, dx);
        int len = (int) Math.sqrt(dx * dx + dy * dy), size = 10;
        AffineTransform at = AffineTransform.getTranslateInstance(x1, y1);
        at.concatenate(AffineTransform.getRotateInstance(angle));
        g.transform(at);
        g.drawLine(0, 0, len, 0);
        if (au == 2) {
            g.fillPolygon(new int[]{len, len - size, len - size, len}, new int[]{0, -size, size, 0}, 3);
        }
    }

    public void Point(Graphics2D p, int x1, int y1, int x2, int y2) {
        p.setStroke(new BasicStroke(5));
        p.drawLine(x1 * grid + w / 2, h / 2 - y1 * grid,
                x1 * grid + w / 2, h / 2 - y1 * grid);
        p.drawLine(x2 * grid + w / 2, h / 2 - y2 * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid);       
    }

    public void Line(Graphics l, int x1, int y1, int x2, int y2, int au) {
        Graphics2D gr = (Graphics2D) l;
        gr.setStroke(new BasicStroke(2));
        gr.setColor(Color.RED); //if
        drawArrow(l, x1 * grid + w / 2, h / 2 - y1 * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid, au);
        gr.setColor(Color.BLACK);
        Point(gr, x1, y1, x2, y2);
    }

    public void LineAdd(Graphics2D p, int x1, int y1, int x2, int y2) {
        int x_add = x1 + x2;
        int y_add = y1 + y2;
        Graphics2D gr = (Graphics2D) p;
        gr.setStroke(new BasicStroke(2));
        gr.setColor(Color.RED);
        gr.drawLine(x_add * grid + w / 2, h / 2 - y_add * grid,
                x_add * grid + w / 2, h / 2 - y_add * grid);
        drawArrow(p, x1 * grid + w / 2, h / 2 - y1 * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid, 1);
        gr.setColor(Color.GREEN);
        drawArrow(p, x_add * grid + w / 2, h / 2 - y_add * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid, 1);
        drawArrow(p, x_add * grid + w / 2, h / 2 - y_add * grid,
                x1 * grid + w / 2, h / 2 - y1 * grid, 1);
        gr.setColor(Color.BLACK);
        Point(gr, x1, y1, x2, y2);
        gr.setColor(Color.blue);
        Point(gr, x_add, y_add, x_add, y_add);
        
        int xArr[] = {x_add * grid + w / 2, x1 * grid + w / 2, x2 * grid + w / 2};
        int yArr[] = {h / 2 - y_add * grid, h / 2 - y1 * grid, h / 2 - y2 * grid};
        gr.setColor(Color.GREEN);
        gr.fill(new Polygon(xArr, yArr, xArr.length));
    }
    
    public void LineSub(Graphics2D p, int x1, int y1, int x2, int y2) {
        int x_sub = x1 - x2;
        int y_sub = y1 - y2;
        Graphics2D gr = (Graphics2D) p;
        gr.setStroke(new BasicStroke(2));
        gr.setColor(Color.RED);
        gr.drawLine(x_sub * grid + w / 2, h / 2 - y_sub * grid,
                x_sub * grid + w / 2, h / 2 - y_sub * grid);
        drawArrow(p, x1 * grid + w / 2, h / 2 - y1 * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid, 1);
        gr.setColor(Color.YELLOW);
        drawArrow(p, x_sub * grid + w / 2, h / 2 - y_sub * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid, 1);
        drawArrow(p, x_sub * grid + w / 2, h / 2 - y_sub * grid,
                x1 * grid + w / 2, h / 2 - y1 * grid, 1);
        gr.setColor(Color.BLACK);
        Point(gr, x1, y1, x2, y2);
        gr.setColor(Color.red);
        Point(gr, x_sub, y_sub, x_sub, y_sub);
        
        int xArr[] = {x_sub * grid + w / 2, x1 * grid + w / 2, x2 * grid + w / 2};
        int yArr[] = {h / 2 - y_sub * grid, h / 2 - y1 * grid, h / 2 - y2 * grid};
        gr.setColor(Color.YELLOW);
        gr.fill(new Polygon(xArr, yArr, xArr.length));
    }
    
    public void Translasi(Graphics2D p, int x1, int y1, int x2, int y2){
        int x_trans = x1 + x2;
        int y_trans = y1 + y2;
        Graphics2D gr = (Graphics2D) p;
        gr.setColor(Color.BLACK);
        Point(gr, x1, y1, x_trans, y_trans);
        gr.setStroke(new BasicStroke(2));
        gr.setColor(Color.BLUE);
        drawArrow(p, x1 * grid + w / 2, h / 2 - y1 * grid,
                x_trans * grid + w / 2, h / 2 - y1 * grid, 1);
        drawArrow(p, x_trans * grid + w / 2, h / 2 - y1 * grid,
                x_trans * grid + w / 2, h / 2 - y_trans * grid, 1);
    }
}