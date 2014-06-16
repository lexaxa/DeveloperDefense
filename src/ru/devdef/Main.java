package ru.devdef;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: akuzin
 * Date: 11.06.14
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class Main {
        public static void main(String[] args){
            JFrame frame = new JFrame("DeveloperDefense");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000,600);
            frame.add(new Map());
            frame.setVisible(true);
        }
}
