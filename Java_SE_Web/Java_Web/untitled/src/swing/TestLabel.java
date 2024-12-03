package swing;

import javax.swing.*;
import java.awt.*;

public class TestLabel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Label__尚文老弟");
        Container container = frame.getContentPane();
        container.setBackground(Color.pink);

        JLabel label = new JLabel();
        label.setText("ShangWen--LaoDi");
        label.setIcon(new ImageIcon("D:\\MyLearningTools\\MyJavaIdea\\CodeJava\\code\\untitled\\src\\swing\\icon.png"));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setEnabled(true);
        label.setDisabledIcon(new ImageIcon("D:\\MyLearningTools\\MyJavaIdea\\CodeJava\\code\\untitled\\src\\swing\\icon_re.png"));



        container.add(label);

        frame.setBounds(200,200,400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }




}
