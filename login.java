import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class login extends JFrame implements ActionListener
{
   JButton next,close;
   JTextField Uname,Uname2;  
   login()
 {
    
    setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("finalquiz/logo2.jpg"));
    JLabel image = new JLabel(i1);
    image.setBounds(0,0,600,500);
    add(image);

    JLabel heading = new JLabel("Daily Quiz");
    heading.setBounds(770,60,300,45);   
    heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
    heading.setForeground(new Color(30,144,254));
    add(heading);

   JLabel name = new JLabel("First name");
    name.setBounds(710,150,300,20);   
    name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
    name.setForeground(new Color(30,144,254));
    add(name);

    Uname = new JTextField();
    Uname.setBounds(685,200,150,25);
    Uname.setFont(new Font("Times New Roman",Font.BOLD ,20));
    add(Uname);

JLabel name2 = new JLabel("Last name");
    name2.setBounds(980,150,300,20);   
    name2.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
    name2.setForeground(new Color(30,144,254));
    add(name2);

    Uname2 = new JTextField();
    Uname2.setBounds(955,200,150,25);
    Uname2.setFont(new Font("Times New Roman",Font.BOLD ,20));
    add(Uname2);


    next = new JButton("Next");
    next.setBounds(820,270,120,25);
    next.setBackground(new Color(30,144,254));
    next.setForeground(Color.WHITE);
    next.addActionListener(this);
    add(next); 

    close = new JButton("Close");
    close.setBounds(820,320,120,25);
    close.setBackground(new Color(30,144,254));
    close.setForeground(Color.WHITE);
    close.addActionListener(this);
    add(close);

    

    setSize(1200,500);
    setLocation(400,200);
    getContentPane().setBackground(Color.decode("#FFFFFF"));
    setVisible(true);
 }


  public void actionPerformed(ActionEvent ae)
{
   if(ae.getSource() == next )
    {
         String name=Uname.getText();
         String name1=Uname2.getText();
        setVisible(false);
          String n=name+" "+name1;
         next n1=new next(n);
     }
   else if(ae.getSource() == close )
   {
     setVisible(false);
   }

  
}  




  public static void main(String args[])
 {
     login l = new login();   
 }
}
