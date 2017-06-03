package basics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by n on 26.05.17.
 */
public class Wind2 extends JFrame {
    public Wind2(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(500,300);
        setLocationRelativeTo(null);
        setTitle("Sub's2 Game");


        JMenuBar jMenuBar = new JMenuBar();//place for menus
        setJMenuBar(jMenuBar);//добавляем во фрейм будущее меню
        JMenu gameMenu = new JMenu("Game");
        JMenu aboutMenu = new JMenu("About");
        jMenuBar.add(gameMenu);
        jMenuBar.add(aboutMenu);
        JFrame thisFrame = this;
        JMenuItem restart = new JMenuItem("Restart");

        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //JOptionPane.showMessageDialog(thisFrame,"This is restart");
                //JOptionPane.showMessageDialog(thisFrame,"This is restart","About",JOptionPane.WARNING_MESSAGE);
                Object[] options = {"yes","no","thanks","anything else ?"};
                int r = JOptionPane.showOptionDialog(thisFrame,"Are you?","Some question",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
                System.out.println(r);
            }
        });
        JMenuItem close = new JMenuItem("Close");
        //close.addActionListener(new aListener());
        close.addActionListener(new ActionListener() {
        //close.addActionListener(e -> System.out.println("click")); // LAMBDA
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("click");
                System.exit(0);
            }
        });
        gameMenu.add(restart);
        gameMenu.add(close);

        setVisible(true);



    }

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        //Main main = new Main();
         //new Wind2(); работать будет, он не правильный запуск
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                new Wind2();
            }
        });
    }
}
