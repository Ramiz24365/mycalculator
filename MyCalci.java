import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyCalci implements ActionListener {
    JFrame f;
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bmul, beq, bdiv, bdel, bdec, bclr;
    JLabel j;
    static double a = 0, b = 0, result = 0;  //declaring variable for action method
    static int operator = 0;            //declaring variable for action method

    MyCalci()      //constructor
    {
        f = new JFrame("RAMIZ CALCULATOR");
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(20, 20, 300, 350);
       // f.setResizable(false);
        Font fo = new Font("comic sans Ms", Font.BOLD, 20);
        Font fo2 = new Font("ALGERIAN" ,Font.BOLD,18);
        j=new JLabel("Ramiz Calculator");
        j.setFont(fo2);
        j.setBounds(50, 1,200,50);
        t = new JTextField();
        t.setFont(fo);
        t.setBackground(Color.YELLOW);
        t.setForeground(Color.RED);
        t.setBounds(40, 40, 200, 50);
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        badd = new JButton("+");
        badd.setFont(fo);
        bsub = new JButton("-");
        bsub.setFont(fo);
        bdiv = new JButton("/");
        bdiv.setFont(fo);
        bmul = new JButton("*");
        bmul.setFont(fo);
        bdec = new JButton(".");
        bdec.setFont(fo);
        bclr = new JButton("clear");
        bclr.setFont(fo);
        bdel = new JButton("delete");
        bdel.setFont(fo);
        beq = new JButton("=");
        beq.setFont(fo);
//for setting bounds of all buttons
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(90, 100, 50, 40);
        b9.setBounds(140, 100, 50, 40);
        bdiv.setBounds(190, 100, 50, 40);
        b4.setBounds(40, 140, 50, 40);
        b5.setBounds(90, 140, 50, 40);
        b6.setBounds(140, 140, 50, 40);
        bmul.setBounds(190, 140, 50, 40);
        b1.setBounds(40, 180, 50, 40);
        b2.setBounds(90, 180, 50, 40);
        b3.setBounds(140, 180, 50, 40);
        bsub.setBounds(190, 180, 50, 40);
        bdec.setBounds(40, 220, 50, 40);
        b0.setBounds(90, 220, 50, 40);
        beq.setBounds(140, 220, 50, 40);
        badd.setBounds(190, 220, 50, 40);
        bdel.setBounds(40, 260, 100, 40);
        bclr.setBounds(140, 260, 100, 40);
        // add actionlistner class for each buttons
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
        bdiv.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        beq.addActionListener(this);
        bdec.addActionListener(this);
        bclr.addActionListener(this);
        bdel.addActionListener(this);
        //for adding buttons in frame
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);
        f.add(bdel);
        f.add(bclr);
        f.add(beq);
        f.add(bdec);
        f.add(j);
    }


    public static void main(String[] args) {
        new MyCalci();
    }

    @Override
    public void actionPerformed(ActionEvent e) {  //method for actionlistener class
        if (e.getSource() == bclr) {    // for perform action if  button clear press
            t.setText("");
        }
        if (e.getSource() == bdel) {    // for perform action if  button delete press
            String s = t.getText();
            t.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                t.setText(t.getText() + s.charAt(i));
        }
        if (e.getSource() == b1) {    // for perform action if button 1 press
            t.setText(t.getText().concat("1"));
        }
        if (e.getSource() == b2) {    // for perform action if button 2 press
            t.setText(t.getText().concat("2"));
        }
        if (e.getSource() == b3) {    // for perform action if button 3 press
            t.setText(t.getText().concat("3"));
        }
        if (e.getSource() == b4) {    // for perform action if button 4 press
            t.setText(t.getText().concat("4"));
        }
        if (e.getSource() == b5) {    // for perform action if button 5 press
            t.setText(t.getText().concat("5"));
        }
        if (e.getSource() == b6) {    // for perform action if button 6 press
            t.setText(t.getText().concat("6"));
        }
        if (e.getSource() == b7) {    // for perform action if button 7 press
            t.setText(t.getText().concat("7"));
        }
        if (e.getSource() == b8) {    // for perform action if button 8 press
            t.setText(t.getText().concat("8"));
        }
        if (e.getSource() == b9) {    // for perform action if button 9 press
            t.setText(t.getText().concat("9"));
        }
        if (e.getSource() == b0) {    // for perform action if button 0 press
            t.setText(t.getText().concat("0"));
        }
        if (e.getSource() == bdec) {    // for perform action if button decimal press
            t.setText(t.getText().concat("."));
        }
        if (e.getSource() == badd) {    // for perform action if button addition press
            a = Double.parseDouble(t.getText());
            operator = 1;
            t.setText(" ");
        }
        if (e.getSource() == bsub) {    // for perform action if  button subtraction press
            a = Double.parseDouble(t.getText());
            operator = 2;
            t.setText(" ");
        }

        if (e.getSource() == bmul) {    // for perform action if  button multiplication press
            a = Double.parseDouble(t.getText());
            operator = 3;
            t.setText(" ");
        }
        if (e.getSource() == bdiv) {    // for perform action if  button division press
            a = Double.parseDouble(t.getText());
            operator = 4;
            t.setText(" ");
        }
        if (e.getSource() == beq) {    // for perform action if  button equal press
            b = Double.parseDouble(t.getText());
            switch (operator)
            {
                case 1:
                    result = a+b;
                    break;
                case 2:
                    result = a-b;
                    break;
                case 3:
                    result = a*b;
                    break;
                case 4:
                    result = a/b;
                    break;
            }
            t.setText("" + result);

        }

    }

    }

