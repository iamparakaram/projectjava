package bank.mamagement.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    //actionlisterner is an interface 
    //methods in interface must be overridden
    //LOGIN CONSTRUCTOR
      
           
     //GLOBALLY DEFINED THE BUTTONS TO USE THEM OUTSUDE THE CONSTRUCTOR AS WELL
    JButton login , signup , clear;
     JTextField cardTextField  ;
     JPasswordField pinTextField;
     
    Login(){
        //2.FOR TITLE
        setTitle("AUTOMATED TELLER MACHINE");
        
        //TO CANCEL THE DEFAULT 4 LAYOUTS
        setLayout(null);
        
        //3.FOR ADDING IMAGE
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        //4.CODE FOR TITLE
        //JLABEL IS A CLASS: CREATED AN OBJECT FOR JLABEL
        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        //5.CODE FOR CARD NUMBER DIALOGUE BOX[LABEL]
        JLabel cardno = new JLabel("CARD No.");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        //6.CODE FOR WRITING THE CARD NUMBER
         cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        
        //7.CODE OF PIN NUMBER DIALOGUE BOX[LABEL]
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        //8.CODE FOR WRITING PIN NUMBER 
         pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        //9.SIGN IN BUTTON
         login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        //ADDACTIONLISTENER IS A FUNCTION WHICH WE USE FOR THE BUTTON TO CATCH EVENT OF BUTTON
        add(login);
        getContentPane().setBackground(Color.WHITE);
        
        //10.CLEAR BUTTON
         clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        getContentPane().setBackground(Color.WHITE);
        
        //11.SIGN UP BUTTON
        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
       
        
        getContentPane().setBackground(Color.WHITE);
        
        
        //1.CODE FOR MAKING FRAME
        setSize(800,480);
        setVisible(true);  //TURE BECAUSE BY DEFAUT IT IS FALSE AND IS NOT VISIBLE TO USER
        setLocation(350,200);
        
    }
//constructor ended
    
    //what action is perfomed after clicking button this is defined in the actionperformed
    public void actionPerformed(ActionEvent ae)
    {                                         //ACTIONEVENT TELLS US WHICH ACTION IS PERFORMED ON WHAT COMPONENT
        if (ae.getSource()== clear)
        {
            cardTextField.setText("");
            pinTextField.setText("");
        } 
        else if (ae.getSource() == login)
        {
            
        }
        else if(ae.getSource()== signup)
        {
            
        }
    }
    
    public static void main(String args[]) {
        new Login();
    }
}
