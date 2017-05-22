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
 * @author ASUS
 */
public class KoorSegitiga extends JPanel{
    int h = 480, w = 480, id, grid = 20;
    int x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, xT, yT, sudut;
    float scale;
    
    public KoorSegitiga(int x1, int y1, int x2, int y2, int x3, int y3, int id) {
        x1Axis = x1;
        y1Axis = y1;
        x2Axis = x2;
        y2Axis = y2;
        x3Axis = x3;
        y3Axis = y3;
        this.id = id;
    }
    
    public KoorSegitiga(int x1, int y1, int x2, int y2, int x3, int y3, float sc, int id) {
        x1Axis = x1;
        y1Axis = y1;
        x2Axis = x2;
        y2Axis = y2;
        x3Axis = x3;
        y3Axis = y3;
        scale = sc;
        this.id = id;
    }
    
    public KoorSegitiga(int x1, int y1, int x2, int y2, int x3, int y3, int xt, int yt, int id){
        x1Axis = x1;
        y1Axis = y1;
        x2Axis = x2;
        y2Axis = y2;
        x3Axis = x3;
        y3Axis = y3;
        xT = xt;
        yT = yt;
        this.id = id;
    }
    
    public KoorSegitiga(int x1, int y1, int x2, int y2, int x3, int y3, int deg, int id) {
        x1Axis = x1;
        y1Axis = y1;
        x2Axis = x2;
        y2Axis = y2;
        x3Axis = x3;
        y3Axis = y3;
        sudut = deg;
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
            //----- point and line -----
            case 1:
                Point(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                break;
                
            case 2:
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 1);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                break;
                
            case 3: //translasi
                //segitiga asli
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 1);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                
                Line(gr, (x1Axis+xT), (y1Axis+yT), (x2Axis+xT), (y2Axis+yT), (x3Axis+xT), (y3Axis+yT), 2);
                gr.drawString("A' ("+ (x1Axis+xT) +", "+ (y1Axis+yT) +")", (x1Axis+xT) * grid + w / 2+5, h / 2 - (y1Axis+yT) * grid-5);
                gr.drawString("B' ("+ (x2Axis+xT) +", "+ (y2Axis+yT) +")", (x2Axis+xT) * grid + w / 2+5, h / 2 - (y2Axis+yT) * grid-5);
                gr.drawString("C' ("+ (x3Axis+xT) +", "+ (y3Axis+yT) +")", (x3Axis+xT) * grid + w / 2+5, h / 2 - (y3Axis+yT) * grid-5);
                break;
                
            case 4: //cermin koordinat x
                //segitiga asli
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 1);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                
                Line(gr, x1Axis, (-y1Axis), x2Axis, (-y2Axis), x3Axis, (-y3Axis), 2);
                gr.drawString("A' ("+ x1Axis +", "+ (-y1Axis) +")", x1Axis * grid + w / 2+5, h / 2 - (-y1Axis) * grid-5);
                gr.drawString("B' ("+ x2Axis +", "+ (-y2Axis) +")", x2Axis * grid + w / 2+5, h / 2 - (-y2Axis) * grid-5);
                gr.drawString("C' ("+ x3Axis +", "+ (-y3Axis) +")", x3Axis * grid + w / 2+5, h / 2 - (-y3Axis) * grid-5);
                break;
                
            case 5: //cermin koordinat y
                //segitiga asli
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 1);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                
                Line(gr, (-x1Axis), y1Axis, (-x2Axis), y2Axis, (-x3Axis), y3Axis, 2);
                gr.drawString("A ("+ (-x1Axis) +", "+ y1Axis +")", (-x1Axis) * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ (-x2Axis) +", "+ y2Axis +")", (-x2Axis) * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ (-x3Axis) +", "+ y3Axis +")", (-x3Axis) * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                break;
                
            case 6: //cermin x=y
                //segitiga asli
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 1);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                
                Line(gr, y1Axis, x1Axis, y2Axis, x2Axis, y3Axis, x3Axis, 2);
                gr.drawString("A ("+ y1Axis +", "+ x1Axis +")", y1Axis * grid + w / 2+5, h / 2 - x1Axis * grid-5);
                gr.drawString("B ("+ y2Axis +", "+ x2Axis +")", y2Axis * grid + w / 2+5, h / 2 - x2Axis * grid-5);
                gr.drawString("C ("+ y3Axis +", "+ x3Axis +")", y3Axis * grid + w / 2+5, h / 2 - x3Axis * grid-5);
                break;
                
            case 7: //shear
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 1);                                                                                        
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                
                Line(gr, x1Axis, y1Axis, x2Axis, (y2Axis+yT), (x3Axis + xT), (y3Axis +yT), 2);
                gr.drawString("A' ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B' ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C' ("+ (x3Axis + xT) +", "+ (y3Axis +yT) +")", (x3Axis + xT) * grid + w / 2+5, h / 2 - (y3Axis +yT) * grid-5);
                break;
                
            case 8: //rotation
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 1);
                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                
                gr.rotate(Math.toRadians(-sudut), w / 2, h / 2);
                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 2);
                
                break;
                
            case 9 : //scale
//                Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 1);
//                gr.drawString("A ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
//                gr.drawString("B ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
//                gr.drawString("C ("+ x3Axis +", "+ y3Axis +")", x3Axis * grid + w / 2+5, h / 2 - y3Axis * grid-5);
                int x1New = x1Axis;
                int x2New = (int)(x1Axis - ((x1Axis - x2Axis) * scale));
                int x3New = (int)(x1Axis - ((x1Axis - x3Axis) * scale));
                int y1New = y1Axis;
                int y2New = (int)(y1Axis - ((y1Axis - y2Axis) * scale));
                int y3New = (int)(y1Axis - ((y1Axis - y3Axis) * scale));
                
                Line(gr,  x1Axis, y1Axis, (int)(scale * x2Axis * grid + (w/2)), (int)((w/2) - grid * y2Axis * scale),
                        (int)((scale * x3Axis * grid )+ (w/2)), (int)((w/2) - (grid * y3Axis * scale)), 
                         2);
                
                //Line(gr, x1Axis, y1Axis, x2Axis, y2Axis, x3Axis, y3Axis, 2);
                
//                gr.drawString("A' ("+ x1Axis +", "+ y1Axis +")", x1Axis * grid + w / 2+5, h / 2 - y1Axis * grid-5);
//                gr.drawString("B' ("+ x2Axis +", "+ y2Axis +")", x2Axis * grid + w / 2+5, h / 2 - y2Axis * grid-5);
//                gr.drawString("C' ("+ (x3Axis + xT) +", "+ (y3Axis +yT) +")", (x3Axis + xT) * grid + w / 2+5, h / 2 - (y3Axis +yT) * grid-5);
                break;  
                
            default: ;
        }
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
    }
    
    public void Point(Graphics2D p, int x1, int y1, int x2, int y2, int x3, int y3) {
        p.setStroke(new BasicStroke(5));
        p.drawLine(x1 * grid + w / 2, h / 2 - y1 * grid,
                x1 * grid + w / 2, h / 2 - y1 * grid);
        p.drawLine(x2 * grid + w / 2, h / 2 - y2 * grid,
                x2 * grid + w / 2, h / 2 - y2 * grid);
        p.drawLine(x3 * grid + w / 2, h / 2 - y3 * grid,
                x3 * grid + w / 2, h / 2 - y3 * grid);
        //p.drawRect(x3 * grid + w / 2, h / 2 - y3 * grid, 1, 1);
        //p.drawOval(x3, y3, 1, 1);
    }

    public void Line(Graphics l, int x1, int y1, int x2, int y2, int x3, int y3, int warna) {
        Graphics2D gr = (Graphics2D) l;
        gr.setStroke(new BasicStroke(2));
        
        switch(warna){
            case 1:
                gr.setColor(Color.RED);
                drawArrow(l, x1 * grid + w / 2, h / 2 - y1 * grid,
                        x2 * grid + w / 2, h / 2 - y2 * grid);
                drawArrow(l, x1 * grid + w / 2, h / 2 - y1 * grid,
                        x3 * grid + w / 2, h / 2 - y3 * grid);
                drawArrow(l, x2 * grid + w / 2, h / 2 - y2 * grid,
                        x3 * grid + w / 2, h / 2 - y3 * grid);
                gr.setColor(Color.BLACK);
                Point(gr, x1, y1, x2, y2, x3, y3);
                break;
                
            case 2:
                gr.setColor(Color.GREEN);
                drawArrow(l, x1 * grid + w / 2, h / 2 - y1 * grid,
                        x2 * grid + w / 2, h / 2 - y2 * grid);
                drawArrow(l, x1 * grid + w / 2, h / 2 - y1 * grid,
                        x3 * grid + w / 2, h / 2 - y3 * grid);
                drawArrow(l, x2 * grid + w / 2, h / 2 - y2 * grid,
                        x3 * grid + w / 2, h / 2 - y3 * grid);
                gr.setColor(Color.BLACK);
                Point(gr, x1, y1, x2, y2, x3, y3);
                break;
                
            default:
                System.out.println("Salah coy!");
                break;
        }
    }
}
