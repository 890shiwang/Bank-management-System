package Bank;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup2  extends JFrame implements ActionListener{
    JComboBox comboBox , comboBox2 , comboBox3 , comboBox4 , comboBox5;
    JRadioButton r1 , r2 , r3 , r4 ;
    JButton Next;

    String First;

    JTextField textPan , textadhar;
    Signup2(String First){
        super("APPLICATION FORM");
        
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ICONS/bank.png"));
    Image i2 = i1.getImage().getScaledInstance(100 , 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(150,5,100,100);
    add(image);
        
    this.First = First;

    JLabel l1 = new JLabel("Page 2");
    l1.setFont(new Font("Ralway" , Font.BOLD , 22));
    l1.setBounds(300 , 30 , 600 , 40);
    add(l1);

    JLabel l2 = new JLabel("Additional Details");
    l2.setFont(new Font("Ralway" , Font.BOLD , 22));
    l2.setBounds(300 , 60 , 600 ,  40);
    add(l2);

    JLabel l3 = new JLabel("Relegion :");
    l3.setFont(new Font("Ralway" , Font.BOLD , 18));
    l3.setBounds(100 , 120 ,100 , 30);
    add(l3);


    String religion[] = {"Hindu" , "Muslim" , "Sihks" , "Christian" , "Other"};
    comboBox = new JComboBox<>(religion);
    comboBox.setBackground(new Color ( 252 , 208 , 76));
    comboBox.setFont(new Font("Ralway" , Font.BOLD , 14));
    comboBox.setBounds(350 , 120 , 320 , 30);
    add(comboBox);

    JLabel l4 = new JLabel("Category :");
    l4.setFont(new Font("Ralway" , Font.BOLD , 18));
    l4.setBounds(100 , 170 ,100 , 30);
    add(l4);

    String Category[] = {"Genral" , "OBC" , "SC/ST" , "Other"};
    comboBox2 = new JComboBox<>(Category);
    comboBox2.setBackground(new Color ( 252 , 208 , 76));
    comboBox2.setFont(new Font("Ralway" , Font.BOLD , 14));
    comboBox2.setBounds(350 , 170 , 320 , 30);
    add(comboBox2);

    JLabel l5 = new JLabel("Income :");
    l5.setFont(new Font("Ralway" , Font.BOLD , 18));
    l5.setBounds(100 , 220 ,100 , 30);
    add(l5);

    String Income[] = {"Null","Less than 1 lacks" , "Less than 6 lacks" , "Less than 10 lacks" , "Less than 20 lack" , "Less than 50 lacks" , "Less than 1 cr" , "More than 1cr"};
    comboBox3 = new JComboBox<>(Income);
    comboBox3.setBackground(new Color ( 252 , 208 , 76));
    comboBox3.setFont(new Font("Ralway" , Font.BOLD , 14));
    comboBox3.setBounds(350 , 220 , 320 , 30);
    add(comboBox3);

    JLabel l6 = new JLabel("Educational :");
    l6.setFont(new Font("Ralway" , Font.BOLD , 18));
    l6.setBounds(100 , 270 ,150 , 30);
    add(l6);

    String Education[] = {"Non-Graduate" , "Graduate" , "Post-Graduation" , "Diploma" , "Others"};
    comboBox4 = new JComboBox<>(Education);
    comboBox4.setBackground(new Color ( 252 , 208 , 76));
    comboBox4.setFont(new Font("Ralway" , Font.BOLD , 14));
    comboBox4.setBounds(350 , 270 , 320 , 30);
    add(comboBox4);

    JLabel l7 = new JLabel("Occupation :");
    l7.setFont(new Font("Ralway" , Font.BOLD , 18));
    l7.setBounds(100 , 320 ,150 , 30);
    add(l7);

    String Occupation[] = {"Salaried" , "Self-Employed" , "Business" , "Student" , "Retiered" , "Housewife" , "Other"};
    comboBox5 = new JComboBox<>(Occupation);
    comboBox5.setBackground(new Color ( 252 , 208 , 76));
    comboBox5.setFont(new Font("Ralway" , Font.BOLD , 14));
    comboBox5.setBounds(350 , 320 , 320 , 30);
    add(comboBox5);

    JLabel l8 = new JLabel("Pan Card no :");
    l8.setFont(new Font("Ralway" , Font.BOLD , 18));
    l8.setBounds(100 , 370 ,150 , 30);
    add(l8);

    textPan= new JTextField();
     textPan.setFont(new Font("Ralway" , Font.BOLD , 14));
     textPan.setBackground(new Color ( 252 , 208 , 76));
    textPan.setBounds(350 , 370 , 320, 30 );
    add(textPan);
    
     JLabel l9 = new JLabel("Adharr Card no :");
    l9.setFont(new Font("Ralway" , Font.BOLD , 18));
    l9.setBounds(100 , 420 ,150 , 30);
    add(l9);

    textadhar= new JTextField();
     textadhar.setFont(new Font("Ralway" , Font.BOLD , 14));
     textadhar.setBackground(new Color ( 252 , 208 , 76));
    textadhar.setBounds(350 , 420, 320, 30 );
    add(textadhar);

    JLabel l10 = new JLabel("Senior Citizen :");
    l10.setFont(new Font("Ralway" , Font.BOLD , 18));
    l10.setBounds(100 , 470 ,150 , 30);
    add(l10);

    r1 = new JRadioButton("Yes");
    r1.setFont( new Font("Ralway" , Font.BOLD , 14));
    r1.setBackground(new Color(252 ,208 , 76));
    r1.setBounds(400 , 470 , 60 , 30);
    add(r1);

    r2 = new JRadioButton("No");
    r2.setFont( new Font("Ralway" , Font.BOLD , 14));
    r2.setBackground(new Color(252 ,208 , 76));
    r2.setBounds(550,470  , 60 , 30);
    add(r2);
    

    JLabel l11 = new JLabel("Existing Account :");
    l11.setFont(new Font("Ralway" , Font.BOLD , 18));
    l11.setBounds(100 , 520 ,200, 30);
    add(l11);

    r3 = new JRadioButton("Yes");
    r3.setFont( new Font("Ralway" , Font.BOLD , 14));
    r3.setBackground(new Color(252 ,208 , 76));
    r3.setBounds(400 , 520 , 60 , 30);
    add(r3);

    r4 = new JRadioButton("No");
    r4.setFont( new Font("Ralway" , Font.BOLD , 14));
    r4.setBackground(new Color(252 ,208 , 76));
    r4.setBounds(550,520  , 60 , 30);
    add(r4);

    JLabel l12 = new JLabel("Form NO :");
    l12.setFont(new Font("Ralway" , Font.BOLD , 18));
    l12.setBounds(690, 10 ,100, 30);
    add(l12);

    JLabel l13 = new JLabel(First);
    l13.setFont(new Font("Ralway" , Font.BOLD , 18));
    l13.setBounds(780 , 10 ,60, 30);
    add(l13);


    Next = new JButton("Next");
    Next.setFont(new Font("Ralway" , Font.BOLD , 14));
    Next.setBackground(Color.WHITE);
    Next.setForeground(Color.BLACK);
    Next.setBounds(570 ,640 , 100 , 30);
    Next.addActionListener(this);
    add(Next);
        
    
    
    setLayout(null);
        setSize(850,750);
        setLocation(450 , 80);
        getContentPane().setBackground(new Color(252 , 208 ,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = First;
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        

        String Pan = textPan.getText();
        String aadhar = textadhar.getText();

        String Scitizen =  " ";

        if((r1.isSelected())){
            Scitizen = "Yes";
        } else if (r2.isSelected()){
            Scitizen = "No";
        }

        String exist =  " ";

        if((r3.isSelected())){
            exist = "Yes";
        } else if (r4.isSelected()){
            exist = "No";
        }

        try {
            if(textPan.getText().equals("") || textadhar.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill  all the feilds");}
            else{ 
                conection con2 =  new conection();
            
                String q = "insert into signuptwo values( '"+formno+"' ,'"+rel+"' , '"+cate+"' , '"+inc+"' , '"+edu+"' , '"+occ+"' , '"+Pan+"', '"+aadhar+"' , '"+Scitizen+"' , '"+exist+"')";
                con2.statement.executeUpdate(q);
                new Signup3(First);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }



        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        new Signup2("");
    }
   
    
}
