
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    
    JComboBox Religion,category,income,education , occupation;
    JRadioButton syes,sno,eyes,eno;
    JTextField pan,aadhar;
    String formno;
    JButton next;
    
      
   
    SignupTwo(String formno){
        
        this.formno=formno;
        
        setLayout(null);
        
        
        setTitle("NEW ACCOUNT APPLICATION ");
        
        
        JLabel additionalDetails =new JLabel("Page2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion =new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        Religion = new JComboBox(valreligion);
        Religion.setBounds(300,140,400,30);
        Religion.setBackground(Color.WHITE);
        add(Religion);
         
        JLabel Category =new JLabel("Category:");
        Category.setFont(new Font("Raleway", Font.BOLD,20));
        Category.setBounds(100,190,400,30);
        add(Category);
                
        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
            
        
        JLabel Income =new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD,20));
        Income.setBounds(100,240,200,30);
        add(Income);
        
        String valincome[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
            
        JLabel Education =new JLabel("Educational");
        Education.setFont(new Font("Raleway", Font.BOLD,20));
        Education.setBounds(100,290,200,30);
        add(Education);
        
        
        JLabel Qualification =new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway", Font.BOLD,20));
        Qualification.setBounds(100,315,200,30);
        add(Qualification);
        
        String valeducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(valeducation);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        JLabel Occupation =new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD,20));
        Occupation.setBounds(100,390,200,30);
        add(Occupation);
        
        String valoccupation[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occupation = new JComboBox(valoccupation);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add( occupation);
            
        
        JLabel pnumber =new JLabel("PAN Number:");
        pnumber.setFont(new Font("Raleway", Font.BOLD,20));
        pnumber.setBounds(100,440,200,30);
        add( pnumber);
        
        pan =new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel anumber =new JLabel("Aadhar Number:");
        anumber.setFont(new Font("Raleway", Font.BOLD,20));
        anumber.setBounds(100,490,200,30);
        add(anumber);
        
        aadhar=new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        
        JLabel scitizen =new JLabel("Senior Citizen");
        scitizen.setFont(new Font("Raleway", Font.BOLD,20));
        scitizen.setBounds(100,540,200,30);
        add(scitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup seniorcitizen = new ButtonGroup();
        seniorcitizen.add(syes);
        seniorcitizen.add(sno);
        
        
        
     
        JLabel Eaccount =new JLabel("Existing Account");
        Eaccount.setFont(new Font("Raleway", Font.BOLD,20));
        Eaccount.setBounds(100,590,200,30);
        add(Eaccount);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup eaccount = new ButtonGroup();
        eaccount.add(eyes);
        eaccount.add(eno);
        
        
        
       next=new JButton("NEXT");
       next.setBackground(Color.black);
       next.setForeground(Color.white);
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       add(next);
       

        
        
        getContentPane().setBackground(Color.WHITE);
        
        
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
   
    
    public void actionPerformed(ActionEvent ae)
    {
        String sreligion = (String) Religion.getSelectedItem();
        String scategory =(String) category.getSelectedItem();
        String sincome=(String) income.getSelectedItem();
        String seducation=(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";        
            
        }
        else if(sno.isSelected()){
        seniorcitizen="No";
    }
        
        String eaccount=null;
        if(eyes.isSelected()){
            eaccount="Yes";
        }
        else if(eno.isSelected()){
            eaccount="No";
    }
        String span=pan.getText();
        String saadhar=aadhar.getText();
      
        try{
               conn c=new conn();
               String query = "insert into signuptwo values( '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"','"+seniorcitizen+"', '"+eaccount+"')";
               c.s.executeUpdate(query);
               
               //Signup3 object
               setVisible(false);
               new SignupThree(formno).setVisible(true);
           }catch(Exception e){
               System.out.println(e);
           }
            
        }
    public static void main(String args[])
    {
        new SignupTwo("");
        
    }
}

