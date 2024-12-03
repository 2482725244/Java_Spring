package swing;

import javax.swing.*;
import java.awt.*;

public class TestButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TestButton");
        Container container = frame.getContentPane();
        container.setBackground(Color.pink);
        container.setLayout(null);

        JButton buttonText = new JButton("ButtonText");
        JButton buttonIcon = new JButton("ButtonIcon");
        buttonIcon.setBounds(100,100,300,300);
        buttonText.setBounds(50,50,200,100);
        buttonIcon.setIcon(new ImageIcon("D:\\MyLearningTools\\MyJavaIdea\\CodeJava\\code\\untitled\\src\\swing\\icon.png"));
        buttonText.setBackground(Color.BLUE);
        buttonText.setVisible(true);
        buttonIcon.setVisible(true);

        container.add(buttonIcon);
        container.add(buttonText);

        frame.setBounds(300,300,400,300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
