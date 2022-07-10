
package lab2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
    
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,clr;
    JLabel label = new JLabel();
    JPanel panel=new JPanel();
    static double a=0;
    static int operator=0;
    
    Calculator()
    {
        f=new JFrame("Calculator");
        t=new JTextField(); 
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        bdec=new JButton(".");
        beq=new JButton("=");
        clr=new JButton("Clear");

       
        label.setBounds(9,1,200,10);
        t.setBounds(9,15,270,40);
        panel.setBounds(9,60,270,190);
        panel.setBackground(Color.lightGray);
        
        //Panel.pack();
        panel.setLayout(new GridLayout(5,5,4,4));
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bdiv);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bmul);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bsub);
        panel.add(bdec);
        panel.add(b0);
        panel.add(beq);
        panel.add(badd);
        panel.add(clr);

        f.add(label);
        f.add(t);
        f.add(panel);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(305,295);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        clr.addActionListener(this);

    }
    
    public void actionPerformed(ActionEvent e){
        String cmd=e.getActionCommand();
        if(e.getSource()==badd)
        {
            String str = t.getText();
            a = Double.parseDouble(str);
            t.setText("");
            label.setText(str + " +");
            operator=1;
        }
        if(e.getSource()==bsub)
        {
            String str = t.getText();
            a = Double.parseDouble(str);
            t.setText("");
            label.setText(str + " -");
            operator=2;
        }
        if(e.getSource()==bmul)
        {
            String str = t.getText();
            a = Double.parseDouble(str);
            t.setText("");
            label.setText(str + " *");
            operator=3;
        }
        if(e.getSource()==bdiv)
        {
            String str = t.getText();
            a = Double.parseDouble(str);
            t.setText("");
            label.setText(str + " /");
            operator=4;
        }
        if(e.getSource()==clr)
        {
            t.setText("");
        }
        
        else if(cmd.equals("=")){
            double b=Double.parseDouble(t.getText());
            double c=0; 
            switch(operator){
                case 1:c=a+b;break;
                case 2:c=a-b;break;
                case 3:c=a*b;break;
                case 4:c=a/b;break;
                default :c=0;
            }
            label.setText("");
            t.setText(""+c);
        }
        
        else if(cmd.equals("0")){
                    t.setText(t.getText().concat("0"));
                }
        else if(cmd.equals("1")){
                    t.setText(t.getText().concat("1"));
                }
        else if(cmd.equals("2")){
                    t.setText(t.getText().concat("2"));
                }
        else if(cmd.equals("3")){
                    t.setText(t.getText().concat("3"));
                }
        else if(cmd.equals("4")){
                    t.setText(t.getText().concat("4"));
                }
        else if(cmd.equals("5")){
                    t.setText(t.getText().concat("5"));
                }
        else if(cmd.equals("6")){
                    t.setText(t.getText().concat("6"));
                }
        else if(cmd.equals("7")){
                    t.setText(t.getText().concat("7"));
                }
        else if(cmd.equals("8")){
                    t.setText(t.getText().concat("8"));
                }
        else if(cmd.equals("9")){
                    t.setText(t.getText().concat("9"));
                }
        else if(cmd.equals(".")){
                    t.setText(t.getText().concat("."));
                }
        else if(cmd.equals("Clear")){
                    t.setText(t.getText().concat("Clear"));
                }
        
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}
    
