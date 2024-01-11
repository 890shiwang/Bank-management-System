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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1 , r2 , r3 , r4 , r5;
    JButton Next;

    JTextField textName, textFName , textcity , textDOB , textM , textpin , textstate  , textemail;

    Random ran = new Random();
    long First4 = (ran.nextLong() % 9000L) + 1000L;
    String First = " " + Math.abs(First4);

    Signup(){
        super("Application Form");

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/bank.png"));
    Image i2 = i1.getImage().getScaledInstance(100 , 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(25,10,100,100);
    add(image);

    JLabel label1 = new JLabel("Application Form No:" + First4);
    label1.setBounds(160, 20 , 600 , 40);
    label1.setFont(new Font("Raleway" , Font.BOLD , 38));
    add(label1);

    JLabel label2 = new JLabel("Page 1");
    label2.setFont(new Font ("Ralway" , Font.BOLD , 22));
    label2.setBounds(330 , 70 , 600 , 30);
    add(label2);

    JLabel label3 = new JLabel("Personal Details");
    label3.setFont(new Font ("Ralway" , Font.BOLD , 22));
    label3.setBounds(290 , 90 , 600 , 30 );
    add(label3);

    JLabel labelname = new JLabel("Name : ");
    labelname.setFont(new Font("Ralway" , Font.BOLD , 20));
    labelname.setBounds(100, 190 , 100 , 30);
    add(labelname);

    textName = new JTextField();
    textName.setFont(new Font("Ralway" , Font.BOLD , 14));
    textName.setBounds(300 , 190 , 400 , 30 );
    add(textName);

    JLabel labelfname = new JLabel("Father's Name: ");
    labelfname.setFont(new Font("Ralway" , Font.BOLD , 20));
    labelfname.setBounds(100 , 240 , 200 , 30);
    add(labelfname);

    textFName = new JTextField();
     textFName.setFont(new Font("Ralway" , Font.BOLD , 14));
    textFName.setBounds(300 , 240 , 400 , 30 );
    add(textFName);

     JLabel DOB = new JLabel("Date Of Birth: ");
    DOB.setFont(new Font("Ralway" , Font.BOLD , 20));
    DOB.setBounds(100 , 340 , 200 , 30);
    add(DOB);

    textDOB = new JTextField();
     textDOB.setFont(new Font("Ralway" , Font.BOLD , 14));
    textDOB.setBounds(300 , 340 , 400 , 30 );
    add(textDOB);

    JLabel Gen = new JLabel("Gender: ");
    Gen.setFont(new Font("Ralway" , Font.BOLD , 20));
    Gen.setBounds(100 , 290 , 200 , 30);
    add(Gen);

    r1 = new JRadioButton("Male");
    r1.setFont( new Font("Ralway" , Font.BOLD , 14));
    r1.setBackground(new Color(222 ,255 , 228));
    r1.setBounds(300 , 290 , 60 , 30);
    add(r1);

     r2 = new JRadioButton("Female");
    r2.setFont( new Font("Ralway" , Font.BOLD , 14));
    r2.setBackground(new Color(222 ,255 , 228));
    r2.setBounds(400 , 290 , 80 , 30);
    add(r2);

    ButtonGroup buttonGroup = new ButtonGroup();
    buttonGroup.add(r1);
    buttonGroup.add(r2);

    JLabel Email = new JLabel("Email adress: ");
    Email.setFont(new Font("Ralway" , Font.BOLD , 20));
    Email.setBounds(100 , 390 , 200 , 30);
    add(Email);

    textemail = new JTextField();
     textemail.setFont(new Font("Ralway" , Font.BOLD , 14));
    textemail.setBounds(300 , 390 , 400 , 30 );
    add(textemail);

    JLabel M = new JLabel("Maritial Status: ");
    M.setFont(new Font("Ralway" , Font.BOLD , 20));
    M.setBounds(100 , 440 , 200 , 30);
    add(M);

    r3 = new JRadioButton("Married");
    r3.setFont( new Font("Ralway" , Font.BOLD , 14));
    r3.setBackground(new Color(222 ,255 , 228));
    r3.setBounds(300 , 440 , 100 , 30);
    add(r3);

    r4 = new JRadioButton("Unmarried");
    r4.setFont( new Font("Ralway" , Font.BOLD , 14));
    r4.setBackground(new Color(222 ,255 , 228));
    r4.setBounds(415, 440 , 100 , 30);
    add(r4);

    r5 = new JRadioButton("others");
    r5.setFont( new Font("Ralway" , Font.BOLD , 14));
    r5.setBackground(new Color(222 ,255 , 228));
    r5.setBounds(540, 440 , 150, 30);
    add(r5);

    ButtonGroup button = new ButtonGroup();
    button.add(r3);
    button.add(r4);
    button.add(r5);

    JLabel addres = new JLabel("Address  : ");
    addres.setFont(new Font("Ralway" , Font.BOLD , 20));
    addres.setBounds(100 , 490 , 200 , 30);
    add(addres);

    textM= new JTextField();
    textM.setFont(new Font("Ralway" , Font.BOLD , 14));
    textM.setBounds(300 , 490 , 400 , 30 );
    add(textM);


    JLabel city = new JLabel("City : ");
    city.setFont(new Font("Ralway" , Font.BOLD , 20));
    city.setBounds(100 , 540 , 200 , 30);
    add(city);

    textcity= new JTextField();
     textcity.setFont(new Font("Ralway" , Font.BOLD , 14));
    textcity.setBounds(300 , 540 , 400 , 30 );
    add(textcity);

    JLabel pincode= new JLabel("PIN Code : ");
    pincode.setFont(new Font("Ralway" , Font.BOLD , 20));
    pincode.setBounds(100 , 590 , 200 , 30);
    add(pincode);

    textpin= new JTextField();
     textpin.setFont(new Font("Ralway" , Font.BOLD , 14));
    textpin.setBounds(300 , 590 , 400 , 30 );
    add(textpin);

    JLabel state= new JLabel("State : ");
    state.setFont(new Font("Ralway" , Font.BOLD , 20));
    state.setBounds(100 , 640 , 200 , 30);
    add(state);

    textstate= new JTextField();
     textstate.setFont(new Font("Ralway" , Font.BOLD , 14));
    textstate.setBounds(300 , 640 , 400 , 30 );
    add(textstate);
    


     Next = new JButton("Next");
     Next.setFont(new Font("Ralway" , Font.BOLD , 14));
     Next.setBackground(Color.BLACK);
     Next.setForeground(Color.WHITE);
     Next.setBounds(620 , 710 , 80 ,30);
     Next.addActionListener(this);
     add(Next);


     getContentPane().setBackground(new Color(222, 255 , 228));
     setLayout(null);
     setSize(850 , 800);
     setLocation(360 , 40);
     setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = First;
        String name = textName.getText();
        String Fname = textFName.getText();
        String datebirth = textDOB.getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }
        else if(r2.isSelected())  {
            gender = "Female";
        }
        String email = textemail.getText();
        String Marital= null;
        if(r3.isSelected()){
            Marital = "Married";
        }
        else if(r4.isSelected()){
            Marital = "Unmarried";
        }
        else if (r5.isSelected()){  
            Marital = "other";
        }

        String address =  textM.getText();
        String city = textcity.getText();
        String pin = textpin.getText();
        String state = textstate.getText();

        try {
            if(textName.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill  all the feilds");}
            else{ 
                conection con2 =  new conection();
                String q = "insert into signup values('"+formno+"' , '"+name+"' , '"+Fname+"' , '"+datebirth+"' , '"+gender+"' , '"+email+"', '"+Marital+"' , '"+address+"' , '"+city+"' , '"+pin+"' , '"+state+"')";
                con2.statement.executeUpdate(q);
                new Signup2(First);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Signup();
    }
}
