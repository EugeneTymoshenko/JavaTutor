/**
 * Created by Sunstory on 20.09.2016.
 */

import javax.swing.*;
import java.awt.event.*;
 public class Main {

     public static void main(String[] args){
         new Frame("Start", 500, 400);
     }
 }

class Frame extends JFrame {
    Frame(String text, int width, int height) {
        super();
        setTitle(text);
        setBounds(50, 50, width, height);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        new Button(this);
    }
        }

class Button extends JButton {
   Frame frame;
    Button(Frame frame) {
        super();
        this.frame = frame;

       final JTextField tf = new JTextField();
       final JTextField tf_resoult = new JTextField();
        tf.setBounds(100, 80, 200, 30);
        tf_resoult.setBounds(100, 110, 200, 30);
        JButton btn1 = new JButton("Start");
        btn1.setBounds(350, 80, 80, 50);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str;
                str = tf.getText();
                char[] strToChar = str.toCharArray();
                String s;
                for (int i = 0; i < strToChar.length; i++) {
                    s = String.valueOf(strToChar[i]);
                    int b = (int) (s.charAt(0));
                    if ((b <= 95) && (b >= 65)) {
                        s = s.toLowerCase();
                    } else {
                        s = s.toUpperCase();
                    }
                    strToChar[i] = s.charAt(0);
                    tf_resoult.setText(String.valueOf(strToChar));
                }
            }
        });
        frame.getContentPane().add(btn1);
        frame.getContentPane().add(tf);
        frame.getContentPane().add(tf_resoult);
    }
}
