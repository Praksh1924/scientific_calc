package swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    static class CreateCalcUI implements ActionListener{
        double Oprand1,Oprand2;
        char Oprator;
        double FinelEq;
        Boolean CheckSum = false;

        JLabel Heading, Value;
        JTextField MainField;
        JRadioButton On,Off;
        JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,Add,Sub,Mul,Dev,Per,Dot,Eql,Del,AC;
        Border border = BorderFactory.createLineBorder(Color.ORANGE,2);
        Font BFont = new Font("Arial",Font.BOLD,20);
        Color BColor = new Color(239,188,2);

        CreateCalcUI(){
            addComponents();
        }
        public void addComponents(){
            JFrame frame = new JFrame("Calculator");
            frame.getContentPane().setLayout(null);
            frame.getContentPane().setBackground(Color.BLACK );
//            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setBounds(200,150,305,450);

            Heading = new JLabel("By Mr Prakash Prajapat");
            Heading.setFont(new Font("Aerial",Font.BOLD,10));
            Heading.setForeground(Color.WHITE);
            Heading.setBounds(10,0,200,20);

            Value = new JLabel();
            Value.setForeground(Color.GRAY);
            Value.setBounds(250,0,50,50);
//            Value.setHorizontalAlignment(SwingConstants.RIGHT);

            frame.add(Heading);
            frame.add(Value);

            MainField = new JTextField();
            On = new JRadioButton("On");
            Off = new JRadioButton("Off");
            ButtonGroup BG = new ButtonGroup();
            BG.add(On);
            BG.add(Off);
            B7 = new JButton("7");
            B8 = new JButton("8");
            B9 = new JButton("9");
            Del = new JButton("DEL");
            AC = new JButton("AC");
            B4 = new JButton("4");
            B5 = new JButton("5");
            B6 = new JButton("6");
            Mul = new JButton("X");
            Dev = new JButton("/");
            B1 = new JButton("1");
            B2 = new JButton("2");
            B3 = new JButton("3");
            Add = new JButton("+");
            Sub = new JButton("-");
            Dot = new JButton(".");
            B0 = new JButton("0");
            Per = new JButton("%");
            Eql = new JButton("=");

            MainField.setEditable(false);
            MainField.setBorder(border);
            MainField.setBackground(Color.lightGray);
            MainField.setForeground(Color.BLACK);
            MainField.setFont(new Font("Courier",Font.BOLD,20));
            MainField.setHorizontalAlignment(SwingConstants.RIGHT);
            MainField.setBounds(10,40,270,40);

            On.setBounds(10,95,60,40);
//            On.isSelected(true);
            On.setFont(new Font("Arial",Font.BOLD,14));
            On.setBackground(Color.BLACK);
            On.setForeground(Color.white);
            On.addActionListener(this);
            Off.setBounds(10,120,60,40);
//            On.isSelected(false);
            Off.setFont(new Font("Arial",Font.BOLD,14));
            Off.setBackground(Color.BLACK);
            Off.setForeground(Color.WHITE);
            Off.addActionListener(this);
            Del.setBounds(80, 110, 60,40);
            Del.setFont(new Font("Arial",Font.BOLD,13));
            Del.setBackground(Color.RED);
            Del.setForeground(Color.WHITE);
            Del.addActionListener(this);
            Del.setActionCommand("Del");
            AC.setBounds(150, 110, 60,40);
            AC.setFont(new Font("Arial",Font.BOLD,13));
            AC.setBackground(Color.RED);
            AC.setForeground(Color.WHITE);
            AC.addActionListener(this);
            AC.setActionCommand("AC");
            Dev.setBounds(220, 110, 60,40);
            Dev.setFont(BFont);
            Dev.setBackground(BColor);
            Dev.addActionListener(this);
            Dev.setActionCommand("Dev");
            B7.setBounds(10, 170, 60,40);
            B7.setFont(BFont);
            B7.addActionListener(this);
            B7.setActionCommand("7");
            B8.setBounds(80, 170, 60,40);
            B8.setFont(BFont);
            B8.addActionListener(this);
            B8.setActionCommand("8");
            B9.setBounds(150, 170, 60,40);
            B9.setFont(BFont);
            B9.addActionListener(this);
            B9.setActionCommand("9");
            Sub.setBounds(220, 170, 60,40);
            Sub.setFont(BFont);
            Sub.setBackground(BColor);
            Sub.addActionListener(this);
            Sub.setActionCommand("Sub");
            B4.setBounds(10,230,60,40);
            B4.setFont(BFont);
            B4.addActionListener(this);
            B4.setActionCommand("4");
            B5.setBounds(80, 230, 60,40);
            B5.setFont(BFont);
            B5.addActionListener(this);
            B5.setActionCommand("5");
            B6.setBounds(150, 230, 60,40);
            B6.setFont(BFont);
            B6.addActionListener(this);
            B6.setActionCommand("6");
            Mul.setBounds(220, 230, 60,40);
            Mul.setFont(BFont);
            Mul.setBackground(BColor);
            Mul.addActionListener(this);
            Mul.setActionCommand("Mul");
            B1.setBounds(10,290,60,40);
            B1.setFont(BFont);
            B1.addActionListener(this);
            B1.setActionCommand("1");
            B2.setBounds(80, 290, 60,40);
            B2.setFont(BFont);
            B2.addActionListener(this);
            B2.setActionCommand("2");
            B3.setBounds(150, 290, 60,40);
            B3.setFont(BFont);
            B3.addActionListener(this);
            B3.setActionCommand("3");
            Add.setBounds(220, 290, 60,40);
            Add.setFont(BFont);
            Add.setBackground(BColor);
            Add.addActionListener(this);
            Add.setActionCommand("Add");
            Per.setBounds(10, 350, 60,40);
            Per.setFont(BFont);
            Per.setBackground(BColor);
            Per.addActionListener(this);
            Per.setActionCommand("Per");
            B0.setBounds(80, 350, 60,40);
            B0.setFont(BFont);
            B0.addActionListener(this);
            B0.setActionCommand("0");
            Dot.setBounds(150,350,60,40);
            Dot.setFont(BFont);
            Dot.setBackground(BColor);
            Dot.addActionListener(this);
            Dot.setActionCommand("Dot");
            Eql.setBounds(220, 350, 60,40);
            Eql.setFont(BFont);
            Eql.setBackground(Color.yellow);
            Eql.setBorder(border);
            Eql.addActionListener(this);
            Eql.setActionCommand("Eql");

            frame.add(MainField);
            frame.add(On);
            frame.add(Off);
            frame.add(B7);
            frame.add(B8);
            frame.add(B9);
            frame.add(Del);
            frame.add(AC);
            frame.add(B4);
            frame.add(B5);
            frame.add(B6);
            frame.add(Mul);
            frame.add(Dev);
            frame.add(B1);
            frame.add(B2);
            frame.add(B3);
            frame.add(Add);
            frame.add(Sub);
            frame.add(Dot);
            frame.add(B0);
            frame.add(Per);
            frame.add(Eql);
        }
        @SuppressWarnings("deprecation")
        @Override
        public void actionPerformed(ActionEvent e) {
            Object Source = e.getSource();
            if(Source == On){
                enable();
            } else if (Source == Off) {
                disable();
            } else if (Source == AC) {
                Value.setText("");
                MainField.setText("");
            } else if (Source == Del) {
                int Length = MainField.getText().length();
                int num = Length-1;
                if (Length > 0){
                    StringBuilder back = new StringBuilder((MainField.getText()));
                    back.deleteCharAt(num);
                    MainField.setText(back.toString());
                }if (MainField.getText().endsWith("")){
                    Value.setText("");
                }
            } else if (Source == B7) {
                MainField.setText(MainField.getText()+"7");
            }
        }
        public void enable() {
            On.setEnabled(false);
            Off.setEnabled(true);
            MainField.setEnabled(true);
            Value.setEnabled(true);
            AC.setEnabled(true);
            Del.setEnabled(true);
            Dev.setEnabled(true);
            Per.setEnabled(true);
            Sub.setEnabled(true);
            B7.setEnabled(true);
            B8.setEnabled(true);
            B9.setEnabled(true);
            Mul.setEnabled(true);
            B4.setEnabled(true);
            B5.setEnabled(true);
            B6.setEnabled(true);
            Add.setEnabled(true);
            B1.setEnabled(true);
            B2.setEnabled(true);
            B3.setEnabled(true);
            Eql.setEnabled(true);
            B0.setEnabled(true);
            Dot.setEnabled(true);
        }

        public void disable() {
            On.setEnabled(true);
            Off.setEnabled(false);
            MainField.setText("");
            Value.setText(" ");
            Del.setEnabled(false);
            AC.setEnabled(false);
            Dev.setEnabled(false);
            Per.setEnabled(false);
            Sub.setEnabled(false);
            B7.setEnabled(false);
            B8.setEnabled(false);
            B9.setEnabled(false);
            Mul.setEnabled(false);
            B4.setEnabled(false);
            B5.setEnabled(false);
            B6.setEnabled(false);
            Add.setEnabled(false);
            B1.setEnabled(false);
            B2.setEnabled(false);
            B3.setEnabled(false);
            Eql.setEnabled(false);
            B0.setEnabled(false);
            Dot.setEnabled(false);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator.CreateCalcUI();
            }
        });
    }
}