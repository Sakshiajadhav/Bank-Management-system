
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Transaction extends JFrame implements ActionListener
{
    JButton deposit,withdraw,balanceenquiry,exit,pinchange,ministatement;
    
    String pinnumber;
    
    
    Transaction(String pinnumber)
    {
           this.pinnumber = pinnumber;
           setLayout(null);
           
           ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));//add atm img
           Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
           ImageIcon i3=new ImageIcon(i2);
           JLabel image=new JLabel(i3);
           image.setBounds(0,0,900,900);
           add(image);
           
           
           JLabel text=new JLabel("please select your transaction ");
           text.setBounds(235,300,700,35);
           text.setForeground(Color.BLUE);
           text.setFont(new Font("System", Font.BOLD,16));
           image.add(text);
           
           
           deposit=new JButton("Deposit");
//           deposit.setBounds(170,450,150,30);
           deposit.setBounds(170,415,150,30);
           deposit.addActionListener(this);
           image.add(deposit);
           
           withdraw=new JButton("Withdrawal");
           withdraw.setBounds(355,415,150,30);
           withdraw.addActionListener(this);
           image.add(withdraw);
                  
           ministatement=new JButton("Mini Statement");
           ministatement.setBounds(170,485,150,30);
           ministatement.addActionListener(this);
           image.add(ministatement);
           
           pinchange=new JButton("Pin Change");
           pinchange.setBounds(355,450,150,30);
           pinchange.addActionListener(this);
           image.add(pinchange);
           
           
           balanceenquiry=new JButton("Balance Enquiry");
           balanceenquiry.setBounds(170,450,150,30);
           balanceenquiry.addActionListener(this);
           image.add(balanceenquiry);
                   
                          
          exit=new JButton("Exit");         
          exit.setBounds(355,485,150,30);
          exit.addActionListener(this);
          image.add(exit);
           
           setSize(900,900);
           setLocation(300,0);
           setUndecorated(true);
           setVisible(true);}
           
           
           
           
            public void actionPerformed(ActionEvent ae){
        
        
        if (ae.getSource()==exit)
        {
            System.exit(0);
        }else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()==withdraw){
             setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()== pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()== ministatement){
//            setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }else if(ae.getSource()== balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);  
        }
            }
                           
        
    public static void main(String args[])
    {
        new Transaction("");     
    }
}
    

//add package java.sql.*; in login class
//add this in login class
/*under actionperformed else if(ae.getSource()==login)
Conn conn=new Conn();
String cardnumber =cardTextField.getText();
String pinnumber =pinTextField.getText();
String query ="Select *from login where cardnumber ='"+cardnumber+"and pin ='"+pinnumber+"'";

try{

    ResultSet rs= conn.s.executeQuery(query);
    if(rs.next()){
    setVisible(false);
    new Transaction().setVisible(true
}else{
JOption.showMessageDialog(null,"Incorrect Card number or pin");

}

catch(Exception ae){
}



*/


/* in my sql 
select *from login

*/
    
