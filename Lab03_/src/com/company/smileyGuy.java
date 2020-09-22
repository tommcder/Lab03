package com.company;

import javax.swing.*;
import java.awt.*;

public class smileyGuy extends JComponent {

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Smiley sm1 = new Smiley(0,0);

        sm1.draw(g2);

        int x = 500 - 60;
        int y = 300 - 30;

        Smiley sm2 = new Smiley(x,y);

        sm2.draw(g2);

        int a = 1000 - 60;
        int b = 0;

        Smiley sm3 = new Smiley(a, b);

        sm3.draw(g2);
    }
}
