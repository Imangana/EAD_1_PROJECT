package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.*;



public class CustomerInfo extends JFrame implements ActionListener {
    JTable table;
    JButton back;
    
    CustomerInfo(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        JLabel l1 = new JLabel("Document Type");
        l1.setBounds(30,10,100,20);
        add(l1);
       
       
        JLabel l2 = new JLabel("Number");
        l2.setBounds(180,10,100,20);
        add(l2);
        
        JLabel l3 = new JLabel("Name");
        l3.setBounds(300,10,100,20);
        add(l3);
        
        JLabel l4 = new JLabel("Gender");
        l4.setBounds(420,10,100,20);
        add(l4);
        
        JLabel l5 = new JLabel("Country");
        l5.setBounds(530,10,100,20);
        add(l5);
        
        JLabel l6 = new JLabel("Room Number");
        l6.setBounds(640,10,100,20);
        add(l6);
        
        JLabel l7 = new JLabel("Checkin Time");
        l7.setBounds(760,10,100,20);
        add(l7);
        
        JLabel l8 = new JLabel("Deposit");
        l8.setBounds(890,10,100,20);
        add(l8);
        
        
        
        table = new JTable();
        table.setBounds(10,40,970,400);
        add(table);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(420,500,120,30);
        add(back);
        
                
        
        setBounds (230,80,1000,600);
        setVisible(true);
    }
       public void actionPerformed (ActionEvent ae){
           setVisible(false);
           new Reception();
       }
    
    public static void main (String[] args)
    {
        new CustomerInfo();
    }
    
}


