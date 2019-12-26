package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Description:
 * @Author: JackYan
 * @Date2019/12/26 14:28
 * @Version V1.0
 **/
public class SwingObserverDemo {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverDemo dm = new SwingObserverDemo();
        dm.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(200,200);
        JButton bt = new JButton("Should I do it?");
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Don't do it,you might regret it!");
            }
        });
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Come on,do it!");
            }
        });
        frame.getContentPane().add(BorderLayout.CENTER,bt);
    }

}

