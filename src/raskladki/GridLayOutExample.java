package raskladki;

import javax.swing.*;
import java.awt.*;

/**
 * Created by javaNoob on 30.05.2017.
 */
public class GridLayOutExample extends JFrame {
    public GridLayOutExample() throws HeadlessException {
        super("Grid example");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 100);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,3,5,10));
        //JButton jButton = new JButton("Hello");
        //JButton jButton1 = new JButton("Hello2");
        //jPanel.add(jButton);//по умолчанию панель использует flowLayout()
        jPanel.add(new JButton("Game"));
        jPanel.add(new JButton("Restart"));
        jPanel.add(new JButton("A"));
        jPanel.add(new JButton("B"));
        jPanel.add(new JButton("C"));
        jPanel.add(new JButton("D"));

        //setLayout(new BorderLayout());//по сторонам
        add(jPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayOutExample();
    }
}//class
