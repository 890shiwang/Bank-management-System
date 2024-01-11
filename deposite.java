package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class deposite  extends JFrame implements ActionListener {
   String pin;
TextField textfeild;
JButton b1 , b2;
    deposite(String pin){
        this.pin =pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550 , 830 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0 ,0 ,1550, 830);
        add(l3);

     JLabel lablel1 = new JLabel("ENTER AMMOUNT YOU WANT TO DEPOSITE");
    lablel1.setForeground(Color.WHITE);
    lablel1.setFont( new Font("System" , Font.BOLD , 16));
    lablel1.setBounds(460,180,400,35);
    l3.add(lablel1);

    textfeild = new TextField();
    textfeild.setBackground(new Color(65 , 125 , 128));
    textfeild.setForeground(Color.WHITE);
    textfeild.setBounds(460 , 230 , 320 , 25);
    textfeild.setFont(new Font ( "Ralway" , Font.BOLD , 22));
    l3.add(textfeild);


    b1 = new JButton("DEPOSITE");
    b1.setBounds(700, 362 , 135, 32);
    b1.setForeground(Color.WHITE);
    b1.setBackground(new Color(65 , 125 , 128));
    b1.setFont(new Font("Arial" , Font.BOLD , 13));
    b1.addActionListener(this);
    l3.add(b1);


    b2 = new JButton("BACK");
    b2.setBounds(700, 406, 135, 32);
    b2.setForeground(Color.WHITE);
    b2.setBackground(new Color(65 , 125 , 128));
    b2.setFont(new Font("Arial" , Font.BOLD , 13));
    b2.addActionListener(this);
    l3.add(b2);





        setLayout(null);
        setSize(1550 , 1080);
        setLocation(0 ,0);
        setVisible(true);


    }

    @Override
    public void actionPerformed( ActionEvent e) {
       try{
        String ammount = textfeild.getText();
        if(e.getSource() == b1){
            if(textfeild.getText().equals("")){
                JOptionPane.showMessageDialog(null , "Please Enter The Ammount You Want to Deposite");
            }
            else {
         conection c = new conection();
         c.statement.executeUpdate("insert into depositeone values ('"+pin+"' , 'DEPOSITE' , '"+ammount+"')");
         JOptionPane.showMessageDialog(null,"Rs."+ammount+" Depositeed Succesfully");
        setVisible(false);
        new main(pin);
            }
        }else if(e.getSource() == b2){
         setVisible (false);
         new main(pin);
        }
    } catch (Exception E){
        E.printStackTrace();

    }
}



public static void main (String[] args){
new deposite("");
}

}
