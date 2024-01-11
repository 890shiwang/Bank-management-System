package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Login  extends JFrame implements ActionListener{
    JLabel lablel1 , lablel2 , lable3;
    JTextField textfeild2;
    JPasswordField passwordfield3;
    JButton button1 , button2 ,button3 ;
    Login(){
    
    super("Bank Management system");
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/bank.png"));
    Image i2 = i1.getImage().getScaledInstance(100 , 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(350,10,100,100);
    add(image);

    ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/card.png"));
    Image ii2 = ii1.getImage().getScaledInstance(100 , 100, Image.SCALE_DEFAULT);
    ImageIcon ii3 = new ImageIcon(ii2);
    JLabel iimage = new JLabel(ii3);
    iimage.setBounds(630,350,100,100);
    add(iimage);

   
    


    lablel1 = new JLabel("WELCOME TO ATM");
    lablel1.setForeground(Color.WHITE);
    lablel1.setFont( new Font("AvantGarde" , Font.BOLD , 38));
    lablel1.setBounds(250,125,450,40);
    add(lablel1);

    lablel2 = new JLabel("Card No:");
    lablel2.setFont(new Font("Ralway" , Font.BOLD , 28));
    lablel2.setForeground(Color.BLACK);
    lablel2.setBounds(150,190,375,30);
    add(lablel2);

    textfeild2 = new JTextField(15);
    textfeild2.setBounds(325, 190 , 230 , 30);
    textfeild2.setFont(new Font("Arial" , Font.BOLD , 14));
    add(textfeild2);

    
    lable3 = new JLabel("PIN: ");
    lable3.setFont(new Font("Ralway" , Font.BOLD , 28));
    lable3.setForeground(Color.BLACK);
    lable3.setBounds(150,250,375,30);
    add(lable3);

    passwordfield3 = new JPasswordField(15);
    passwordfield3.setBounds(325, 250,230,30);
    passwordfield3.setFont(new Font("Arial" , Font.BOLD,14));
    add(passwordfield3);

    button1 = new JButton("SIGN IN");
    button1.setBounds(300, 300 , 100 , 25);
    button1.setForeground(Color.WHITE);
    button1.setBackground(Color.BLACK);
    button1.setFont(new Font("Arial" , Font.BOLD , 13));
    button1.addActionListener(this);
    add(button1);


    button2 = new JButton("CLEAR");
    button2.setBounds(430 , 300, 100, 30);
    button2.setForeground(Color.WHITE);
    button2.setBackground(Color.BLACK);
    button2.setFont(new Font("Arial" , Font.BOLD , 13));
    button2.addActionListener(this);
    add(button2);
    
    button3 = new JButton("SIGN UP");
    button3.setBounds(300, 350, 230, 25);
    button3.setForeground(Color.WHITE);
    button3.setBackground(Color.BLACK);
    button3.setFont(new Font("Arial" , Font.BOLD , 13));
    button3.addActionListener(this);
    add(button3);
    








    ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/backbg.png"));
    Image iii2 = iii1.getImage().getScaledInstance(850 , 480, Image.SCALE_DEFAULT);
    ImageIcon iii3 = new ImageIcon(iii2);
    JLabel iiimage = new JLabel(iii3);
    iiimage.setBounds(0,0,850,480);
    add(iiimage);

    setLayout(null);
    setSize(850,480);
    setLocation(450, 200);
    //  setUndecorated(true);
    setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{

            if(e.getSource() == button1){
                conection c = new conection();
                String cardno = textfeild2.getText();
                String pin = passwordfield3.getText();
                String q = "select * from loginone where card_number = '"+cardno+"' and pin ='"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new main(pin);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }

            }else if  (e.getSource() == button2){
                textfeild2.setText("");
                passwordfield3.setText("");
         }else if (e.getSource() == button3){
            new Signup();
            setVisible(false);

         }
            

        }catch(Exception E){
            E.printStackTrace();
        }
        
    }
    public static void main (String [] args){
        new Login();
    }
}
