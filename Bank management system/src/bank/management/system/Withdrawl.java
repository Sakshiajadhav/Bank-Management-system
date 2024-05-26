package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener
{
     JButton withdrawl,back;
     JTextField amount;
     String pinnumber;
    
    Withdrawl(String pinnumber)
    {
           this.pinnumber=pinnumber;
           setLayout(null);
           
           ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//add atm img
           Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
           ImageIcon i3=new ImageIcon(i2);
           JLabel image=new JLabel(i3);
           image.setBounds(0,0,900,900);
           add(image);
           
           
           JLabel text=new JLabel("enter the amount you want to withdraw ");
           text.setBounds(170,300,400,20);
           text.setForeground(Color.BLUE);
           text.setFont(new Font("System", Font.BOLD,16));
           image.add(text);
           
           
           amount =new JTextField();
           amount.setBounds(170,350,320,20);
           amount.setFont(new Font("System", Font.BOLD,16));
           image.add(amount);
           
           
           
             
           withdrawl=new JButton("Withdraw");
           withdrawl.setBounds(355,485,150,30);
           withdrawl.addActionListener(this);
           image.add(withdrawl);  
          
           
           
           back=new JButton("Back");
           back.setBounds(355,520,150,30);
           back.addActionListener(this);
           image.add(back);  
           
           
           setSize(900,900);
           setLocation(300,0);
           setUndecorated(true);
           setVisible(true);
     }
        
    public void actionPerformed(ActionEvent ae){
        
        
        if (ae.getSource()==withdrawl)
        {
            String number=amount.getText();
            Date date=new Date();
            
            if(number.equals(" "))
            {
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
            }else 
            {
                try{
                conn con= new conn();
                String query ="insert into bank values('"+pinnumber+"', '"+date+"','withdraw','"+number+"')";
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs " +number+" Withdrawn successfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }catch(Exception e)
            {
                System.out.println(e);
             }
            
            }
        }else if(ae.getSource()==back)
        {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[])
    {
        new Withdrawl("");
    }
}
    
