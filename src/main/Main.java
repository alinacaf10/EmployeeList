package main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        final int[] id = {1};

    JFrame frame=new JFrame("Employers list");
    JButton button=new JButton("Save");
    button.setBounds(100,600,100,30);
    JPanel panel=new JPanel();

    JLabel lblhigh=new JLabel("Add to Employers List");
    lblhigh.setFont(new Font("Serif", Font.PLAIN, 22));
    lblhigh.setBounds(210,420,1000,30);


    JLabel lbl1=new JLabel("First Name:");
    lbl1.setBounds(20,470,100,20);
    JTextField text1=new JTextField();
    text1.setBounds(100,470,120,25);

    JLabel lbl2=new JLabel("Last Name:");
    lbl2.setBounds(20,530,100,20);
    JTextField text2=new JTextField();
    text2.setBounds(100,530,120,25);

        String[] name={"ID","Name","Surname"};

        DefaultTableModel model = new DefaultTableModel();
        JTable table = new JTable(model);
        JScrollPane sp=new JScrollPane(table);

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Surname");


        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            if (id[0]<=25){
                model.addRow(new Object[]{id[0],text1.getText(), text2.getText()});
                id[0]++;
            }
            else {
            JOptionPane.showMessageDialog(frame,"List is full");
            }
            }
        });





    frame.setVisible(true);
    frame.setSize(700,700);
    frame.add(button);
    frame.add(lblhigh);
    frame.add(lbl1);
    frame.add(lbl2);
    frame.add(text1);
    frame.add(text2);
    frame.add(sp);

    }
}
