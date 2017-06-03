package basics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by javaNoob on 29.05.2017.
 */
public class aListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello");
    }
}
