package swing;

import javax.swing.*;
import java.awt.*;

public class TestRadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TestRadioButton");
        Container container = frame.getContentPane();
        container.setBackground(Color.pink);
        container.setLayout(null);

        JRadioButton radioButton_1 = new JRadioButton("eat");
        JRadioButton radioButton_2 = new JRadioButton("sleep");
        JRadioButton radioButton_3 = new JRadioButton("study");
        JRadioButton radioButton_4 = new JRadioButton("play the game");

        radioButton_1.setBounds(10,10,180,20);
        radioButton_2.setBounds(80,80,180,20);
        radioButton_3.setBounds(150,150,180,20);
        radioButton_4.setBounds(220,220,180,20);

        container.add(radioButton_1);
        container.add(radioButton_2);
        container.add(radioButton_3);
        container.add(radioButton_4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton_1);
        buttonGroup.add(radioButton_2);
        buttonGroup.add(radioButton_3);
        buttonGroup.add(radioButton_4);


        frame.setBounds(100,100,500,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
