import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculator extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
    JTextField text;
    static double a=0,b=0,result= 0;
    int operator = 0;

    public calculator(){

        setLayout(null);
        setVisible(true);
        setSize(350,550);
        setResizable(false);
        setLocation(520,120);
        setTitle("calculator");

        text = new JTextField();
        text.setBounds(20,20,300,70);
        text.setFont(new Font("raleway",Font.BOLD,45));
        text.setForeground(Color.white);
        text.setBackground(Color.black);
        add(text);


        b1 = new JButton("7");
        b1.setBounds(20,120,60,60);
        b1.setFont(new Font("raleway",Font.BOLD,35));
        b1.setBackground(Color.white);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("8");
        b2.setBounds(100,120,60,60);
        b2.setFont(new Font("raleway",Font.BOLD,35));
        b2.setBackground(Color.white);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton("9");
        b3.setBounds(180,120,60,60);
        b3.setFont(new Font("raleway",Font.BOLD,35));
        b3.setBackground(Color.white);
        b3.setForeground(Color.BLACK);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton("X");
        b4.setBounds(260,120,60,60);
        b4.setFont(new Font("raleway",Font.BOLD,35));
        b4.setBackground(Color.white);
        b4.setForeground(Color.BLACK);
        b4.addActionListener(this);
        add(b4);


        b5 = new JButton("4");
        b5.setBounds(20,200,60,60);
        b5.setFont(new Font("raleway",Font.BOLD,35));
        b5.setBackground(Color.white);
        b5.setForeground(Color.BLACK);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("5");
        b6.setBounds(100,200,60,60);
        b6.setFont(new Font("raleway",Font.BOLD,35));
        b6.setBackground(Color.white);
        b6.setForeground(Color.BLACK);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("6");
        b7.setBounds(180,200,60,60);
        b7.setFont(new Font("raleway",Font.BOLD,35));
        b7.setBackground(Color.white);
        b7.setForeground(Color.BLACK);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("-");
        b8.setBounds(260,200,60,60);
        b8.setFont(new Font("raleway",Font.BOLD,35));
        b8.setBackground(Color.white);
        b8.setForeground(Color.BLACK);
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("1");
        b9.setBounds(20,280,60,60);
        b9.setFont(new Font("raleway",Font.BOLD,35));
        b9.setBackground(Color.white);
        b9.setForeground(Color.BLACK);
        b9.addActionListener(this);
        add(b9);

        b10 = new JButton("2");
        b10.setBounds(100,280,60,60);
        b10.setFont(new Font("raleway",Font.BOLD,35));
        b10.setBackground(Color.white);
        b10.setForeground(Color.BLACK);
        b10.addActionListener(this);
        add(b10);

        b11 = new JButton("3");
        b11.setBounds(180,280,60,60);
        b11.setFont(new Font("raleway",Font.BOLD,35));
        b11.setBackground(Color.white);
        b11.setForeground(Color.BLACK);
        b11.addActionListener(this);
        add(b11);

        b12 = new JButton("+");
        b12.setBounds(260,280,60,60);
        b12.setFont(new Font("raleway",Font.BOLD,35));
        b12.setBackground(Color.white);
        b12.setForeground(Color.BLACK);
        b12.addActionListener(this);
        add(b12);

        b13 = new JButton("0");
        b13.setBounds(20,360,60,60);
        b13.setFont(new Font("raleway",Font.BOLD,35));
        b13.setBackground(Color.white);
        b13.setForeground(Color.BLACK);
        b13.addActionListener(this);
        add(b13);

        b14 = new JButton(".");
        b14.setBounds(100,360,60,60);
        b14.setFont(new Font("raleway",Font.BOLD,35));
        b14.setBackground(Color.white);
        b14.setForeground(Color.BLACK);
        b14.addActionListener(this);
        add(b14);

        b15 = new JButton("÷");
        b15.setBounds(180,360,60,60);
        b15.setFont(new Font("raleway",Font.BOLD,35));
        b15.setBackground(Color.white);
        b15.setForeground(Color.BLACK);
        b15.addActionListener(this);
        add(b15);

        b16 = new JButton("=");
        b16.setBounds(260,360,60,60);
        b16.setFont(new Font("raleway",Font.BOLD,35));
        b16.setBackground(Color.white);
        b16.setForeground(Color.BLACK);
        b16.addActionListener(this);
        add(b16);
        
        b17 = new JButton("clear");
        b17.setBounds(20,440,140,60);
        b17.setFont(new Font("raleway",Font.BOLD,35));
        b17.setBackground(Color.white);
        b17.setForeground(Color.black);
        b17.addActionListener(this);
        add(b17);

        b18 = new JButton("⌫");
        b18.setBounds(240,440,80,60);
        b18.setFont(new Font("raleway",Font.BOLD,35));
        b18.setBackground(Color.white);
        b18.setForeground(Color.black);
        b18.addActionListener(this);
        add(b18);

        getContentPane().setBackground(Color.black);
    }
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== b17){
            text.setText("");
        }
        if(ae.getSource()== b18){
            String s = text.getText();
            text.setText("");
            for(int i =0;i<s.length()-1;i++){
                text.setText(text.getText()+s.charAt(i));
            }
        }
        if(ae.getSource() == b1){
            text.setText(text.getText().concat("7"));
        }
        if(ae.getSource() == b2){
            text.setText(text.getText().concat("8"));
        }
        if(ae.getSource() == b3){
            text.setText(text.getText().concat("9"));
        }
        if(ae.getSource() == b5){
            text.setText(text.getText().concat("4"));
        }
        if(ae.getSource() == b6){
            text.setText(text.getText().concat("5"));
        }
         if(ae.getSource() == b7){
            text.setText(text.getText().concat("6"));
        }
        if(ae.getSource() == b9){
            text.setText(text.getText().concat("1"));
        }
         if(ae.getSource() == b10){
            text.setText(text.getText().concat("2"));
        }
        if(ae.getSource() == b11){
            text.setText(text.getText().concat("3"));
        }
        if(ae.getSource() == b13){
            text.setText(text.getText().concat("0"));
        }
        if(ae.getSource() == b14){
            text.setText(text.getText().concat("."));
        }
        if(ae.getSource()== b12){
            a= Double.parseDouble(text.getText());
            operator = 1;
            text.setText("");
        }
        if(ae.getSource() == b8){
            a = Double.parseDouble(text.getText());
            operator = 2;
            text.setText("");
        }
        if(ae.getSource() == b4 ){
            a= Double.parseDouble(text.getText());
            operator = 3;
            text.setText("");
        }
        if(ae.getSource() == b15 ){
            a= Double.parseDouble(text.getText());
            operator = 4;
            text.setText("");
        }
        if(ae.getSource()== b16){
            b = Double.parseDouble(text.getText());
            switch(operator){
                case 1: result = a+b;
                break;
                case 2: result = a-b;
                break;
                case 3: result = a*b;
                break;
                case 4: result = a/b;
                break;
            }
            text.setText(""+result);
        }
        }
    public static void main(String[] args) {
        new calculator();
    }
}
