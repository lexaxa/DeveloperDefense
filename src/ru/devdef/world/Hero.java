package ru.devdef.world;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created with IntelliJ IDEA.
 * User: akuzin
 * Date: 16.06.14
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public class Hero {

    Image img = new ImageIcon("res/hero.png").getImage();

    int x = 0;
    int y = 0;
    int dx = 0;
    int dy = 0;

    public void move(){
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if( key == KeyEvent.VK_RIGHT){ dx =5;}
        if( key == KeyEvent.VK_LEFT){ dx = -5;}
        if( key == KeyEvent.VK_UP){ dy = -5;}
        if( key == KeyEvent.VK_DOWN){ dy =5;}
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT){ dx = 0;}
        if(key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN){ dy = 0;}
    }
}
