import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class score extends JFrame implements ActionListener
{
JLabel q1,q,sco;
JButton next1;
 score(String name,int s)
  {
     
       setBounds(400,200,1100,500);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("finalquiz/result.jpg"));
    Image i2=i1.getImage().getScaledInstance(500,350,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0,0,600,450);
    add(image);

  q1=new JLabel("Thank you "+name+" for playing Quiz");
    q1.setBounds(690,70,500,20);
    q1.setFont(new Font("Tahoma",Font.PLAIN,18));
    add(q1);

  sco=new JLabel("Your Score is "+s);
    sco.setBounds(750,120,500,20);
    sco.setFont(new Font("Tahoma",Font.PLAIN,14));
    add(sco);

    next1 = new JButton("Close");
    next1.setBounds(750,200,120,25);
    next1.setFont(new Font("Tahoma",Font.BOLD,12));
    next1.setBackground(new Color(30,144,254));
    next1.setForeground(Color.WHITE);
    next1.addActionListener(this);
    add(next1); 



   setVisible(true);
   }

public void actionPerformed(ActionEvent ae)
{
 
   setVisible(false);

}
   
  public static void main(String args[])
 {
    new score("user",0);
   
  }
 
}