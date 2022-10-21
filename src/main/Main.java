package main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
    int id=1;

        JFrame frame=new JFrame("Employers");
        JButton button=new JButton("Save");
        button.setBounds(100,200,100,30);
    JLabel lblhigh=new JLabel("Employee List");
    lblhigh.setFont(new Font("Serif", Font.PLAIN, 22));
    lblhigh.setBounds(210,20,1000,30);


    JLabel lbl1=new JLabel("First Name:");
    lbl1.setBounds(20,70,100,20);
    JTextField text1=new JTextField();
    text1.setBounds(100,70,120,25);

    JLabel lbl2=new JLabel("Last Name:");
    lbl2.setBounds(20,130,100,20);
    JTextField text2=new JTextField();
    text2.setBounds(100,130,120,25);

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);

// Create a couple of columns
        model.addColumn("Col1");
        model.addColumn("Col2");

// Append a row

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                model.addRow(new Object[]{text1.getText(), text2.getText()});

            }
        });





    frame.setVisible(true);
    frame.setSize(400,400);
        frame.add(button);
        frame.add(lblhigh);
    frame.add(lbl1);
    frame.add(lbl2);
    frame.add(text1);
    frame.add(text2);
    frame.add(table);

    }
}
