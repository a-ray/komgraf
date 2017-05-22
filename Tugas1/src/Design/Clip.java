/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author asus
 */
public class Clip extends JPanel {
    
    int h = 480, w = 480, id, grid = 20;
    int x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, xt, yt;
    int cs, xmin, ymin, xmax, ymax;
    int poX[], poY[], liX[], liY[], elX[], elY[];
    int triX[], triY[], triXR[], triYR[], reX[], reY[], reXR[], reYR[];

    public Clip(int x[], int y[], int c[], int id, int cs) {
        poX = liX = triX = reX = x;
        poY = liY = triY = reY = y;
        xmin = c[0];
        xmax = c[1];
        ymin = c[2];
        ymax = c[3];
        this.id = id;
        this.cs = cs;
    }
    
    public Clip(int x[], int y[], int id) {
        liX = triX = reX = elX = x;
        liY = triY = reY = elY = y;
        this.id = id;
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
            //----- clipping -----
            case 1://clipping point
                
                if (cs == 1) {
                    Point(gr, poX[0], poY[0], poX[1], poY[1]);
                    drawClip(gr);
                } else if (cs == 2) {
                    drawClip(gr);
                    java.awt.Shape clipArea = new java.awt.geom.Rectangle2D.Float(grid * xmin + w / 2, h / 2 - ymax * grid, (xmax - xmin) * grid, (ymax - ymin) * grid);
                    gr.clip(clipArea);
                    Point(gr, poX[0], poY[0], poX[1], poY[1]);
                } else {
                    Point(gr, poX[0], poY[0], poX[1], poY[1]);
                }
                break;
                
            case 2: //clipping line
                if (cs == 1) {
                    Line(gr, liX[0], liY[0], liX[1], liY[1]);
                    Line(gr, liX[2], liY[2], liX[3], liY[3]);
                    Line(gr, liX[4], liY[4], liX[5], liY[5]);
                    drawClip(gr);
                } else if (cs == 2) {
                    drawClip(gr);
                    java.awt.Shape clipArea = new java.awt.geom.Rectangle2D.Float(grid * xmin + w / 2, h / 2 - ymax * grid, (xmax - xmin) * grid, (ymax - ymin) * grid);
                    gr.clip(clipArea);
                    Line(gr, liX[0], liY[0], liX[1], liY[1]);
                    Line(gr, liX[2], liY[2], liX[3], liY[3]);
                    Line(gr, liX[4], liY[4], liX[5], liY[5]);
                } else {
                    Line(gr, liX[0], liY[0], liX[1], liY[1]);
                    Line(gr, liX[2], liY[2], liX[3], liY[3]);
                    Line(gr, liX[4], liY[4], liX[5], liY[5]);
                }
                break;
                
            case 3: //clipping rectangle
                if (cs == 1) {
                    rectFill(gr, reX[0], reY[0], reX[1], reY[1]);
                    rectFill(gr, reX[2], reY[2], reX[3], reY[3]);
                    rectFill(gr, reX[4], reY[4], reX[5], reY[5]);
                    drawClip(gr);
                } else if (cs == 2) {
                    drawClip(gr);
                    java.awt.Shape clipArea = new java.awt.geom.Rectangle2D.Float(grid * xmin + w / 2, h / 2 - ymax * grid, (xmax - xmin) * grid, (ymax - ymin) * grid);
                    gr.clip(clipArea);
                    rectFill(gr, reX[0], reY[0], reX[1], reY[1]);
                    rectFill(gr, reX[2], reY[2], reX[3], reY[3]);
                    rectFill(gr, reX[4], reY[4], reX[5], reY[5]);
                } else {
                    rectFill(gr, reX[0], reY[0], reX[1], reY[1]);
                    rectFill(gr, reX[2], reY[2], reX[3], reY[3]);
                    rectFill(gr, reX[4], reY[4], reX[5], reY[5]);
                }
                break;
                
            case 4: //clipping segitiga
                int x1[] = Arrays.copyOfRange(triX, 0, 3);
                int y1[] = Arrays.copyOfRange(triY, 0, 3);
                int x2[] = Arrays.copyOfRange(triX, 3, 6);
                int y2[] = Arrays.copyOfRange(triY, 3, 6);
                int x3[] = Arrays.copyOfRange(triX, 6, 9);
                int y3[] = Arrays.copyOfRange(triY, 6, 9);
                
                if (cs == 1) {
                    triFill(gr, x1, y1, x1.length);
                    triFill(gr, x2, y2, x2.length);
                    triFill(gr, x3, y3, x3.length);
                    drawClip(gr);
                } else if (cs == 2) {
                    drawClip(gr);
                    java.awt.Shape clipArea = new java.awt.geom.Rectangle2D.Float(grid * xmin + w / 2, h / 2 - ymax * grid, (xmax - xmin) * grid, (ymax - ymin) * grid);
                    gr.clip(clipArea);
                    triFill(gr, x1, y1, x1.length);
                    triFill(gr, x2, y2, x2.length);
                    triFill(gr, x3, y3, x3.length);
                } else {
                    triFill(gr, x1, y1, x1.length);
                    triFill(gr, x2, y2, x2.length);
                    triFill(gr, x3, y3, x3.length);
                }
                break;
            
            default: break;
        }
}

private void rectFill(Graphics2D recf, int x, int y, int wi, int he) {
        recf.fillRect(grid * x + w / 2, h / 2 - y * grid, wi * grid, he * grid);
    }

private void triFill(Graphics2D tr, int x[], int y[], int p) {
        tr.fillPolygon(x, y, p);
    }
    
public void Point(Graphics2D p, int x1, int y1, int x2, int y2) {
        p.setStroke(new BasicStroke(4));
        p.drawLine(x1 * grid + w / 2, h / 2 - y1 * grid,
                x1 * grid + w / 2, h / 2 - y1 * grid);
        p.drawLine(x2 * grid + w / 2, h / 2 - y2 * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid);
    }

private void drawClip(Graphics2D cl) {
        cl.setColor(Color.BLUE);
        cl.setStroke(new BasicStroke(2));
        cl.drawRect(grid * xmin + w / 2, h / 2 - ymax * grid, (xmax - xmin) * grid, (ymax - ymin) * grid);
        cl.setColor(Color.BLACK);
    }

public void Line(Graphics l, int x1, int y1, int x2, int y2) {
        Graphics2D gr = (Graphics2D) l;
        gr.setStroke(new BasicStroke(2));
        drawArrow(l, x1 * grid + w / 2, h / 2 - y1 * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid);
        Point(gr, x1, y1, x2, y2);
    }

void drawArrow(Graphics g1, int x1, int y1, int x2, int y2) {
        Graphics2D g = (Graphics2D) g1.create();
        double dx = x2 - x1, dy = y2 - y1;
        double angle = Math.atan2(dy, dx);
        int len = (int) Math.sqrt(dx * dx + dy * dy), size = 10;
        AffineTransform at = AffineTransform.getTranslateInstance(x1, y1);
        at.concatenate(AffineTransform.getRotateInstance(angle));
        g.transform(at);
        g.drawLine(0, 0, len, 0);
        if (id == 5) {
            g.fillPolygon(new int[]{len, len - size, len - size, len}, new int[]{0, -size, size, 0}, 3);
        }
    }
}
