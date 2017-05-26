package basics;

import javax.swing.*;

/**
 * Created by n on 26.05.17.
 */
public class Wind1 extends JFrame {
    public Wind1(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500,300);
        setLocationRelativeTo(null);
        setTitle("Sub's Game");


        JMenuBar jMenuBar = new JMenuBar();//place for menus
        setJMenuBar(jMenuBar);//добавляем во фрейм будущее меню
        JMenu gameMenu = new JMenu("Game");
        JMenu aboutMenu = new JMenu("About");
        jMenuBar.add(gameMenu);
        jMenuBar.add(aboutMenu);

        JMenuItem restart = new JMenuItem("Restart");
        JMenuItem close = new JMenuItem("Close");
        gameMenu.add(restart);
        gameMenu.add(close);




    }

    public static void main(String[] args) {
        //Main main = new Main();
         new Wind1();
    }
}
