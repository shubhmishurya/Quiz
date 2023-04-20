 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;



class quiz extends JFrame implements ActionListener
{
     
    String questions[][]=new String[10][5];   //no wrror if col. left behind ; error onlu if both left empty
    String answers[][]=new String[10][2];
    String useranswers[][]=new String[10][1];
    JButton next,back;
    JLabel q1,q;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup group1;
    public static int timer=15;
    public static int ans = 0;
    public static int s = 0;
public static int count = 0;

String name;
   
     quiz(String name)
    {
       this.name=name;
       setBounds(400,200,1200,500);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("finalquiz/logo2.jpg"));
    JLabel image = new JLabel(i1);
    image.setBounds(0,0,600,500);
    add(image);

    q1=new JLabel();
    q1.setBounds(710,70,500,20);
    q1.setFont(new Font("Tahoma",Font.PLAIN,14));
    add(q1);

     q=new JLabel();
    q.setBounds(740,70,500,20);
    q.setFont(new Font("Tahoma",Font.PLAIN,14));
    add(q);

    questions[0][0] = "Which is capital of India?";
        questions[0][1] = "Delhi";
        questions[0][2] = "Jalandhar";
        questions[0][3] = "Goa";
        questions[0][4] = "Jammu";

        questions[1][0] = "What is the color of apple?";
        questions[1][1] = "red";
        questions[1][2] = "Orange";
        questions[1][3] = "pink";
        questions[1][4] = "violent";

        questions[2][0] = "Which is a car company?";
        questions[2][1] = "Mango";
        questions[2][2] = "frooti";
        questions[2][3] = "Tata";
        questions[2][4] = "Jags";

        questions[3][0] = "How many players are in cricket team?";
        questions[3][1] = "7";
        questions[3][2] = "12";
        questions[3][3] = "10";
        questions[3][4] = "11";

        questions[4][0] = "When did India won world cup?";
        questions[4][1] = "2011";
        questions[4][2] = "2003";
        questions[4][3] = "2013";
        questions[4][4] = "2017";

        questions[5][0] = "How many times RCB won IPL?";
        questions[5][1] = "1";
        questions[5][2] = "2";
        questions[5][3] = "3";
        questions[5][4] = "0";

        questions[6][0] = "Which keyword is not used as variable name?";
        questions[6][1] = "if";
        questions[6][2] = "a";
        questions[6][3] = "e";
        questions[6][4] = "exp";

        questions[7][0] = "In RCB R stands for?";
        questions[7][1] = "Royal";
        questions[7][2] = "Roast";
        questions[7][3] = "Rohan";
        questions[7][4] = "Runner";

        questions[8][0] = "Which is the package for color in gui?";
        questions[8][1] = "awt";
        questions[8][2] = "swing";
        questions[8][3] = "Scanner";
        questions[8][4] = "none";

        questions[9][0] = "Who is best Test Captain?";
        questions[9][1] = "Virat";
        questions[9][2] = "Dhoni";
        questions[9][3] = "Rohit";
        questions[9][4] = "None";

        answers[0][1] = "Delhi";
        answers[1][1] = "red";
        answers[2][1] = "Tata";
        answers[3][1] = "11";
        answers[4][1] = "2011";
        answers[5][1] = "0";
        answers[6][1] = "if";
        answers[7][1] = "Royal";
        answers[8][1] = "awt";
        answers[9][1] = "Virat";

         opt1=new JRadioButton();
       opt1.setBounds(730,110,300,20);
       opt1.setBackground(Color.WHITE);
       opt1.setFont(new Font("Dialog",Font.PLAIN,14));
      add(opt1);  

      opt2=new JRadioButton();
       opt2.setBounds(730,130,300,20);
       opt2.setBackground(Color.WHITE);
       opt2.setFont(new Font("Dialog",Font.PLAIN,14));
      add(opt2); 

      opt3=new JRadioButton();
       opt3.setBounds(730,150,300,20);
       opt3.setBackground(Color.WHITE);
       opt3.setFont(new Font("Dialog",Font.PLAIN,14));
      add(opt3); 


       opt4=new JRadioButton();
       opt4.setBounds(730,170,300,20);
       opt4.setBackground(Color.WHITE);
       opt4.setFont(new Font("Dialog",Font.PLAIN,14));
      add(opt4); 
       
     group1=new ButtonGroup();
     group1.add(opt1);
      group1.add(opt2);
    group1.add(opt3);
    group1.add(opt4);


     next = new JButton("Next");
    next.setBounds(710,260,120,25);
    next.setFont(new Font("Tahoma",Font.BOLD,12));
    next.setBackground(new Color(30,144,254));
    next.setForeground(Color.WHITE);
    next.addActionListener(this);
    add(next); 

    back = new JButton("Submit");
    back.setBounds(910,260,120,25);
    next.setFont(new Font("Tahoma",Font.BOLD,12));
    back.setBackground(new Color(30,144,254));
    back.setForeground(Color.WHITE);
    back.setEnabled(false);
   back.addActionListener(this);
    add(back);

    
     start(count);
     



       setVisible(true); 

    }

    public void actionPerformed(ActionEvent ae)
{
    
    if(ae.getSource() == next )
    {
         repaint();
         ans =1;
          if(group1.getSelection()==null){
            useranswers[count][0] = "";
           }
        else{
          useranswers[count][0]=group1.getSelection().getActionCommand();
         }

        if (count == 8 )   //kyunki 8 ke trunt bd 9 hoga aur 9 pr sumit enable krna h //aur yh graphics m bhikrnaho  
      {                    //kyunki agr next ny dabaye toh phir kaise enable krega submit button ko systummm
          next.setEnabled(false);
         back.setEnabled(true);
          
      }
            
        
         count++;
         start(count);
     }
   else if(ae.getSource() == back )
   {
      ans=1;
     if(group1.getSelection()==null){                                 //yh if else user ka ans store kr rha
            useranswers[count][0] = "";
           }
        else{
          useranswers[count][0]=group1.getSelection().getActionCommand();
         }

         for(int i=0;i<useranswers.length;i++)
         {
             if(useranswers[i][0].equals(answers[i][1]))
                  {
                     s=s+10;
                   }
              else
                s=s-5;
          }
        setVisible(false);
        new score(name,s);  
   }

  
} 

/* //for TImer
   public void paint(Graphics g)
 {
      super.paint(g);
      String time="Time left  "+timer+" seconds";
      g.setColor(Color.RED);
      g.setFont(new Font("Tahoma",Font.BOLD,25));
      if(timer>0)
     {
        g.drawString(time,750,400);   
   
      }else
     {
        g.drawString("Times up!",750,400);    
      }
       timer--;
    
 try{ Thread.sleep(1000);
 repaint();   
}
		    catch(InterruptedException e) {
    e.printStackTrace();
}
       
      
     if(ans == 1 ){
         ans= 0;
         timer=15;
     }else if(timer<0)
     {
       timer=15;

        if (count == 8 )   //kyunki 8 ke trunt bd 9 hoga aur 9 pr sumit enable krna h //aur yh graphics m bhikrnaho  
      {                    //kyunki agr next ny dabaye toh phir kaise enable krega submit button ko systummm
          next.setEnabled(false);
          back.setEnabled(true);
          
      }
        if(count == 9)  //tki system submit lele last ques. ka time khtm hone pr
     {
        if(group1.getSelection()==null){                                 //yh if else user ka ans store kr rha
            useranswers[count][0] = "";
           }
        else{
          useranswers[count][0]=group1.getSelection().getActionCommand();
         }

         for(int i=0;i<useranswers.length;i++)
         {
             if(useranswers[i][0].equals(answers[i][1]))
                  {
                     s=s+10;
                   }
              else
                s=s-5;
          }
        setVisible(false);
        new score(name,s);
     }
       
     else
    {
       if(group1.getSelection()==null){
            useranswers[count][0] = "";
           }
        else{
          useranswers[count][0]=group1.getSelection().getActionCommand();
         }
         count++;
         start(count);
      }
  }

}

 
*/



   public void start(int count)
 {
      q1.setText("Q"+(count + 1)+".");
      q.setText(questions[count][0]);
     
     
      opt1.setText(questions[count][1]);
       opt1.setActionCommand(questions[count][1]);

      opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

      opt3.setText(questions[count][3]);
  opt3.setActionCommand(questions[count][3]);

      opt4.setText(questions[count][4]);
  opt4.setActionCommand(questions[count][4]);


      group1.clearSelection();
 }


 



    public static void main(String args[])
   {
      new quiz("user");


   }


}