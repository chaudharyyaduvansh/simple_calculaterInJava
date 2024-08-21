import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends Frame implements ActionListener
{
    JLabel l1, l2, l3, l;
    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4, b5;
    Calculator()
    {
        super("Calculator");
        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result");
        l  = new JLabel("please Enter valid number.");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");
        b5 = new JButton("close");
        add(l1); add(l2); add(l3); 
        add(tf1); add(tf2); add(tf3);
        add(b1);add(b2); add(b3); add(b4); add(b5);
        l1.setBounds(100, 50, 100, 20);
        l2.setBounds(100, 80, 100, 20);
        l3.setBounds(100, 110, 100, 20);
        tf1.setBounds(220, 50, 100, 20);
        tf2.setBounds(220, 80, 100, 20);
        tf3.setBounds(220, 110, 100, 20);
        b1.setBounds(80, 210, 50, 20);
        b2.setBounds(150, 210, 50, 20);
        b3.setBounds(220, 210, 50, 20);
        b4.setBounds(290, 210, 50, 20);
        b5.setBounds(190, 250, 50, 20);
        setLayout(null);
        setSize(420,300);
        setLocation(100,100);
        setBackground(Color.CYAN);
        setForeground(Color.white);
        b1.setBackground(new Color(55, 56, 49));
        b2.setBackground(new Color(55, 56, 49));
        b3.setBackground(new Color(55, 56, 49));
        b4.setBackground(new Color(55, 56, 49));
        b5.setBackground(new Color(168, 42,35));
        b1.setForeground(new Color(131, 168, 35));
        b2.setForeground(new Color(131, 168, 35));
        b3.setForeground(new Color(131, 168, 35));
        b4.setForeground(new Color(131, 168, 35));
        tf1.setForeground(Color.black);
        tf2.setForeground(Color.black);
        tf3.setForeground(Color.black);
        tf3.setEditable(false);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        
        try
        {
        if(e.getSource() == b1)
        {
            double first = Double.parseDouble(tf1.getText());
            double second = Double.parseDouble(tf2.getText());
            double result = (first + second);
            tf3.setText(String.valueOf(result));
        }
        if(e.getSource() == b2)
        {
            double first = Double.parseDouble(tf1.getText());
            double second = Double.parseDouble(tf2.getText());
            double result = (first - second);
            tf3.setText(String.valueOf(result));
        }
        if(e.getSource() == b3)
        {
            double first = Double.parseDouble(tf1.getText());
            double second = Double.parseDouble(tf2.getText());
            double result = (first * second);
            tf3.setText(String.valueOf(result));
        }
        
        if(e.getSource() == b4)
        {
            double first = Double.parseDouble(tf1.getText());
            double second = Double.parseDouble(tf2.getText());
            double result = (first / second);
            tf3.setText(String.valueOf(result));
        }
    }
    catch(NumberFormatException ex)
    {
        new PopUp();
       
    }
          
        if(e.getSource() == b5)
        {
            System.exit(0);
        }
     
    }  
    
    public static void main(String[] s)
    {
        new Calculator();
    }
}

class PopUp extends Frame implements ActionListener
{
    Label l;
    Button b;
    PopUp()
    {
        l = new Label("Please enter a valid number.");
        add(l);
        b = new Button("ok");
        add(b);
        b.setBackground(Color.red);
        l.setForeground(Color.red);
        setLayout(new FlowLayout());
        setSize(200,100);
        setLocation(500, 200);
        setVisible(true);
        b.addActionListener(this);
    }

     public void actionPerformed(ActionEvent e)
     {
        if(e.getSource() == b)
        {
            System.exit(0);
        }
     }
}
