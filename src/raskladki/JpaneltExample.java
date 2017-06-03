package raskladki;

import javax.swing.*;
import java.awt.*;

/**
 * Created by javaNoob on 30.05.2017.
 */
public class JpaneltExample extends JFrame {
    public JpaneltExample() throws HeadlessException {
        super("Panel example");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 100);
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Hello");
        JButton jButton1 = new JButton("Hello2");
        jPanel.add(jButton);//по умолчанию панель использует flowLayout()
        jPanel.add(new JButton("Game"));
        jPanel.add(new JButton("Restart"));
        setLayout(new BorderLayout());//по сторонам

        // add(jPanel, BorderLayout.CENTER);
        add(jPanel, BorderLayout.NORTH);
        add(new JButton("Button3"), BorderLayout.SOUTH);
        add(new JButton("Button4"), BorderLayout.EAST);
        add(new JButton("Button5"), BorderLayout.WEST);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JpaneltExample();
    }
}//class
