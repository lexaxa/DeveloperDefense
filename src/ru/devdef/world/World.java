package ru.devdef.world;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created with IntelliJ IDEA.
 * User: akuzin
 * Date: 11.06.14
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */
public class World extends JPanel implements ActionListener{

    Timer timer = new Timer(20, this);
    Image img = new ImageIcon("res/map.jpg").getImage();
    Hero hero = new Hero();
    Cursor cursor;

    public World(){
        timer.start();
        addKeyListener(new MyKeyAdapter());

        //cursor = new Cursor(Cursor.CUSTOM_CURSOR);

        setHeroCursor();
        setFocusable(true);
    }

    private class MyKeyAdapter extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            hero.keyPressed(e);
        }
        public void keyReleased(KeyEvent e){
            hero.keyReleased(e);
        }
    }

    public void paint(Graphics g){
        //g = (Graphics2D) g;
        g.drawImage(img, 0, 0, null);
        g.drawImage(hero.img, hero.x, hero.y, null);

    }

    public void actionPerformed(ActionEvent action){
        hero.move();
        repaint();
    }
    private void setHeroCursor(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image curImg = kit.getImage("res/cursor.png");
        Point hotspot = new Point(0,0);
        cursor = kit.createCustomCursor(curImg, hotspot, "myCursor");
        setCursor(cursor);
    }
}
