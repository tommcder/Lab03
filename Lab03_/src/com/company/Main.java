package com.company;
import javax.swing.JFrame;

public class Main {


    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();

        frame.setSize(300,400);
        frame.setTitle("Smileys in different locations :D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        smileyGuy component = new smileyGuy();
        frame.add(component);

        frame.setVisible(true);
    }
}
