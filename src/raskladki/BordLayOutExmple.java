package raskladki;

import javax.swing.*;
import java.awt.*;

/**
 * Created by javaNoob on 30.05.2017.
 */
public class BordLayOutExmple extends JFrame {
    public BordLayOutExmple() throws HeadlessException {
        super("Border LayOut");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,100);
        JButton jButton = new JButton("Hello");
        JButton jButton1 = new JButton("Hello2");

        setLayout(new BorderLayout());//по сторонам

        add(jButton,BorderLayout.CENTER);
        add(jButton1,BorderLayout.NORTH);
        add(new JButton("Button3"),BorderLayout.SOUTH);
        add(new JButton("Button4"),BorderLayout.EAST);
        add(new JButton("Button5"),BorderLayout.WEST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BordLayOutExmple();
    }
}//class
