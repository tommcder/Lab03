package com.company;

import java.awt.*;
import java.awt.Graphics2D;

public class Smiley {
    int xLeft;
    int yTop;

    public Smiley(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    public void draw(Graphics2D g2)
    {
        /*
        g2.drawOval(  xLeft,   yTop, 500, 500);
        g2.setColor(Color.LIGHT_GRAY);

        g2.fillRect(  ,   0, 500, 500);
         */
        g2.setColor(Color.MAGENTA);

        g2.fillOval(xLeft+140,yTop+440,300,400);
        g2.setColor(new Color(245, 245, 108));
        g2.fillOval(xLeft+50, yTop+50, 400, 400);
        g2.setColor(Color.BLACK);
        g2.fillOval(xLeft+130, yTop+130,50,70);
        g2.fillOval(xLeft+280, yTop+130,50,80);
        g2.fillArc(xLeft+160, yTop+280,150,120, 180, 180);
        Color ear = new Color(250, 187, 52);
        g2.setColor(ear);
        g2.fillOval(xLeft+400,yTop+200,40,60);
        g2.setColor(Color.DARK_GRAY);/*
        g2.fillPolygon(new Polygon(
                new int[] { 170,215,250},
                new int[] {230, 290, 230},
                3
        ));
        g2.setColor(Color.CYAN);
        g2.fillPolygon( new Polygon // put this last
                ( new int[] {  10, 265, 499 },
                        new int[] { 80,  -90, 80 },
                        3

                )

        );
    */
    }
}
