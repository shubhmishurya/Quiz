import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class next extends JFrame implements ActionListener
{
    String name;
    JButton nexts,close;
    next(String name)
   {
       this.name = name;
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);


    JLabel heading = new JLabel("Let's Start "+name+" with Today's Quiz");
    heading.setBounds(210,30,700,40);   
    heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
    heading.setForeground(new Color(30,144,254));
    add(heading);

JLabel rule = new JLabel("Rules of Quiz");
    rule.setBounds(400,90,700,40);   
    rule.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
    rule.setForeground(new Color(30,144,254));
    add(rule);



   JLabel next = new JLabel();
    next.setBounds(20,90,700,350);   
    next.setFont(new Font("Tahoma",Font.PLAIN,16));
    next.setText("<html>"+ 
                "1. Each question carries 10 marks" + "<br><br>" +
                "2. Attempt only if you know the answer" + "<br><br>" +
                "3. Negative marking is also there" + "<br><br>" +
                "4. For every wrong answer there is -5 negative marking" + "<br><br>" +
                "5. Don't peep into others paper for answers .... Do it only if there is lenient Examiner" + "<br><br>" +    "<html>"
);
    add(next);

      nexts = new JButton("Start");
    nexts.setBounds(460,500,120,25);
    nexts.setBackground(new Color(30,144,254));
    nexts.setForeground(Color.WHITE);
    nexts.addActionListener(this);
    add(nexts);

    close = new JButton("Back");
    close.setBounds(460,540,120,25);
    close.setBackground(new Color(30,144,254));
    close.setForeground(Color.WHITE);
    close.addActionListener(this);
    add(close);


        setSize(1000,650);
        setLocation(350,100);
        setVisible(true);
      

   }

public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource() == nexts )
   {
     new quiz(name);
     setVisible(false);
    }
   else
   {
       setVisible(false);
       login l=new login();
        
    }
 }

    public static void main(String args[])
    {
       next n=new next("User");
    }
     


}