package raskladki;

import javax.swing.*;
import java.awt.*;

/**
 * Created by javaNoob on 30.05.2017.
 */
public class Test0 extends JFrame {
    public Test0() throws HeadlessException {
        super("Left to Right");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,100);
        JButton jButton = new JButton("Hello");
        JButton jButton1 = new JButton("Hello2");
        setLayout(new FlowLayout());//тупо слева направо

        add(jButton);
        add(jButton1);
        add(new JButton("Button3"));
        add(new JButton("Button4"));
        add(new JButton("Button5"));
        setVisible(true);

    }

    public static void main(String[] args) {
        new Test0();
    }
}//class
