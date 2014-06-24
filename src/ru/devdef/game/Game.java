package ru.devdef.game;

import ru.devdef.world.World;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: akuzin
 * Date: 11.06.14
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    JFrame frame = new JFrame("DeveloperDefense");

    Game(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
    }

    public static void main(String[] args){
        Game game = new Game();
        game.showMenu();
    }

    public void showWorld(){
        frame.getContentPane().removeAll();
        frame.add(new World());
        frame.repaint();
        frame.revalidate();
        frame.setVisible(true);
    }

    public void showMenu(){
        frame.getContentPane().removeAll();
        Menu menu = new Menu();
        menu.game = this;
        frame.add(new Menu());
        frame.repaint();
        frame.revalidate();
        frame.setVisible(true);
    }
}
