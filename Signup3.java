package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signup3  extends JFrame implements ActionListener{

    
    JRadioButton r1 , r2 , r3 , r4;
    JCheckBox c1 ,c2 ,c3 , c4 , c5 , c6;
    JButton  Submit , Cancle;
     String First;
     String formno;
    
    

    Signup3( String First){
        this.First = First;
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/bank.png"));
     Image i2 = i1.getImage().getScaledInstance(100 , 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(150,5,100,100);
    add(image);

    JLabel l1 = new JLabel("Page No:");
    l1.setFont(new Font("Raleway" , Font.BOLD , 22));
    l1.setBounds(280 , 40 , 400 , 40);
    add(l1);

    JLabel l2 = new JLabel("Account Details:");
    l2.setFont(new Font("Raleway" , Font.BOLD , 22));
    l2.setBounds(280 , 70 , 400 , 40);
    add(l2);

    JLabel l3 = new JLabel("Account Type:");
    l3.setFont(new Font("Raleway" , Font.BOLD , 18));
    l3.setBounds(100 , 140 , 200 , 30);
    add(l3);

    r1 = new JRadioButton("Saving Account");
    r1.setFont( new Font("Ralway" , Font.BOLD , 16));
    r1.setBackground(new Color(215 , 252 , 252));
    r1.setBounds(100, 180 , 250 , 30);
    add(r1);

    r2 = new JRadioButton("Fixed Deposite Account");
    r2.setFont( new Font("Ralway" , Font.BOLD , 16));
    r2.setBackground(new Color(215 , 252 , 252));
    r2.setBounds(350, 180  , 250 , 30);
    add(r2);


    r3 = new JRadioButton("Current Account");
    r3.setFont( new Font("Ralway" , Font.BOLD , 16));
    r3.setBackground(new Color(215 , 252 , 252));
    r3.setBounds(100, 220, 250 , 30);
    add(r3);

    r4 = new JRadioButton("Recurring Deposite Account");
    r4.setFont( new Font("Ralway" , Font.BOLD , 16)); 
    r4.setBackground(new Color(215 , 252 , 252));
    r4.setBounds(350, 220, 250 , 30);
    add(r4);


    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(r1);
    buttonGroup.add(r2);
    buttonGroup.add(r3);
    buttonGroup.add(r4);

    JLabel l4 = new JLabel("Card Number:");
    l4.setFont(new Font("Raleway" , Font.BOLD , 18));
    l4.setBounds(100 , 300 , 200 , 30);
    add(l4);

    JLabel l5 = new JLabel("(Your 16 Digit Card No)");
    l5.setFont(new Font("Raleway" , Font.BOLD , 12));
    l5.setBounds(100 , 320, 300, 30);
    add(l5);

    JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4321");
    l6.setFont(new Font("Raleway" , Font.BOLD , 18));
    l6.setBounds(330 , 300 , 300, 20);
    add(l6);

    JLabel l7 = new JLabel("(It would appear on atm card/cheque Book Statement)");
    l7.setFont(new Font("Raleway" , Font.BOLD , 12));
    l7.setBounds(330 , 330 ,500 ,20);
    add(l7);

    JLabel l8 = new JLabel("PIN No");
    l8.setFont(new Font("Raleway" , Font.BOLD , 18));
    l8.setBounds(100 , 370 ,200 ,30);
    add(l8);

    JLabel l9 = new JLabel("XXXX");
    l9.setFont(new Font("Raleway" , Font.BOLD , 12));
    l9.setBounds(330 , 370 ,200 ,30);
    add(l9);

     JLabel l10 = new JLabel("(4-digit Password)");
    l10.setFont(new Font("Raleway" , Font.BOLD , 12));
    l10.setBounds(100 , 400, 200, 20);
    add(l10);

    JLabel l11 = new JLabel("Services Required:");
    l11.setFont(new Font("Raleway" , Font.BOLD , 18));
    l11.setBounds(100 , 450,200 ,30);
    add(l11);

    c1 = new JCheckBox("ATM CARD");
    c1.setBackground(new Color(215 ,252 ,252));
    c1.setFont(new Font("Ralwey" , Font.BOLD , 16));
    c1.setBounds(100 , 500 , 200 , 30);
    add(c1);

    c2 = new JCheckBox("Net Bnaking");
    c2.setBackground(new Color(215 ,252 ,252));
    c2.setFont(new Font("Ralwey" , Font.BOLD , 16));
    c2.setBounds(350 , 500 , 200 , 30);
    add(c2);

    c3 = new JCheckBox("Mobile Bnking");
    c3.setBackground(new Color(215 ,252 ,252));
    c3.setFont(new Font("Ralwey" , Font.BOLD , 16));
    c3.setBounds(100 , 550 , 200 , 30);
    add(c3);

    c4 = new JCheckBox("E-mail Alerts");
    c4.setBackground(new Color(215 ,252 ,252));
    c4.setFont(new Font("Ralwey" , Font.BOLD , 16));
    c4.setBounds(350 , 550 , 200 , 30);
    add(c4);

    c5 = new JCheckBox("Cheque Book");
    c5.setBackground(new Color(215 ,252 ,252));
    c5.setFont(new Font("Ralwey" , Font.BOLD , 16));
    c5.setBounds(100 , 600 , 200 , 30);
    add(c5);
    
    c6 = new JCheckBox("E-Statement");  
    c6.setBackground(new Color(215 ,252 ,252));
    c6.setFont(new Font("Ralwey" , Font.BOLD , 16));
    c6.setBounds(350 , 600, 200 , 30);
    add(c6);

    JCheckBox c7 = new JCheckBox("I hereby declares that the above information given by me is best of my knowledge");
    c7.setBounds(100 , 650 , 600 , 30);
    c7.setBackground(new Color(215 ,252 ,252));
    c7.setFont(new Font("Ralway" , Font.BOLD , 12));
    add(c7);

    JLabel l12 = new JLabel("Form No :" );
    l12.setFont(new Font("Ralway" , Font.BOLD , 14));
    l12.setBounds(700 , 10 ,100, 30);
    add(l12);

    JLabel l13 = new JLabel(First);
    l13.setFont(new Font("Ralway" , Font.BOLD , 14));
    l13.setBounds(760 , 10 ,60, 30);
    add(l13);

    Submit = new JButton("Submit");
    Submit.setFont(new Font("Ralway" , Font.BOLD , 14));
    Submit.setBackground(Color.BLACK);
    Submit.setForeground(Color.WHITE);
    Submit.addActionListener(this);
    Submit.setBounds(220,720 , 100 , 30);
    add(Submit);

    Cancle = new JButton("Cancle");
    Cancle.setFont(new Font("Ralway" , Font.BOLD , 14));
    Cancle.setBackground(Color.BLACK);
    Cancle.setForeground(Color.WHITE);
    Cancle.addActionListener(this);
    Cancle.setBounds(420 ,720 , 100 , 30);
    add(Cancle);


    setLayout(null);
    setSize(850,800);
    setLocation(400 , 20);
    getContentPane().setBackground(new Color(215 ,252 ,252));
    setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        }
        else if(r2.isSelected())  {
            atype = "Fixed deposite Account";                                      
        }
        else if(r3.isSelected()){
            atype = "Current Account";
        }
        else if(r4.isSelected()){
             atype = "Recurring Deposite Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);
       
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        String services ="";
        if(c1.isSelected()){
            services = services + "ATM Card";
        }
        else if( c2.isSelected()){
            services =  services+"Net Banking";
        }
        else if ( c3.isSelected()){
            services = services+"Mobile Bnaking";
        }
        else if ( c4.isSelected()){ 
            services = services+"E-Mail Alerts";
        }
        else if( c5.isSelected()){
            services = services+"Cheque Book";
        }
        else if(c6.isSelected()){
            services =  services + "E-Statement";
        }
    try {
            if(e.getSource() == Submit ){
                if (atype.equals("")){
                JOptionPane.showMessageDialog(null , "Fill all the Feilds ");
             }
             else {
                conection con2 = new conection();
                String q1 = "insert into signupfour values('"+formno+"' , '"+atype+"' , '"+cardno+"' , '"+pin+"' , '"+services+"')";
                String q2 = "insert into loginone values ( '"+formno+"' , '"+cardno+"' , '"+pin+"')";
                con2.statement.executeUpdate(q1);
                con2.statement.executeUpdate(q2);
                JOptionPane.showMessageDialog(null, "Card Number : "+cardno+"\n Pin : "+pin);
                new deposite(pin);
                setVisible(false);
             }
            }
            else if(e.getSource() == Cancle){
            System.exit(0);
            }
        
        }    catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
