package basics;

import javax.swing.*;
import java.awt.*;

/**
 * Created by n on 26.05.17.
 */
public class Main extends JFrame {
    public Main(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300,500);
        setLocationRelativeTo(null);
        setTitle("Sub's Game");

    }

    public static void main(String[] args) {
        //Main main = new Main();
         new Main();
    }
}
