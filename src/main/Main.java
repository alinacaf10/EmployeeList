package main;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	JFrame frame=new JFrame("Employers");
    JLabel lblhigh=new JLabel("Employee List");
    lblhigh.setFont(new Font("Serif", Font.PLAIN, 22));
    lblhigh.setBounds(210,20,1000,30);

    JLabel lbl1=new JLabel("First Name:");
    lbl1.setBounds(20,70,100,30);
    JTextField text1=new JTextField();
    text1.setBounds(150,70,150,30);

    JLabel lbl2=new JLabel("Last Name:");
    lbl2.setBounds(20,110,100,30);



    frame.setVisible(true);
    frame.setSize(600,600);
    frame.setLayout(null);
    frame.setResizable(false);
    frame.add(lblhigh);
    frame.add(lbl1);
    frame.add(lbl2);
    frame.add(text1);
    }
}
