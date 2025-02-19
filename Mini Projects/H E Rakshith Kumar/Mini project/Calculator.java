package calculator;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator implements ActionListener{
 JFrame frame;
 JTextField textfield;
 JButton numberButton[]=new JButton[10];
 JButton fuctionButton[]=new JButton[8];
 JButton addButton,subButton,mulButton,divButton;
 JButton decButton,eqButton,delButton,clrButton;
 JPanel panel;
 Font myFont=new Font("Calibri",Font.BOLD,30);
 double num1=0,num2=0,result=0;
 char operator;
 Calculator() {
 frame=new JFrame("Calculator");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(420,550);
 frame.setLayout(null);
 textfield=new JTextField();
 textfield.setBounds(50,25,300,50);
 textfield.setFont(myFont);
 textfield.setEditable(false);
 addButton=new JButton("+");
 subButton=new JButton("-");
 mulButton=new JButton("*");
 divButton=new JButton("/");
 decButton=new JButton(".");
 eqButton=new JButton("=");
 delButton=new JButton("Del");
 clrButton=new JButton("Clear");
 fuctionButton[0]=addButton;
 fuctionButton[1]=subButton;
 fuctionButton[2]=mulButton;
 fuctionButton[3]=divButton;
 fuctionButton[4]=decButton;
 fuctionButton[5]=eqButton;
 fuctionButton[6]=delButton;
 fuctionButton[7]=clrButton;
 for(int i=0;i<8;i++) {
 fuctionButton[i].addActionListener(this);
 fuctionButton[i].setFont(myFont);
 //fuctionButton[i].setFocusable(false);)
 }
 for(int i=0;i<10;i++) {
 numberButton[i]=new JButton(String.valueOf(i));
 numberButton[i].addActionListener(this);
 numberButton[i].setFont(myFont);
 numberButton[i].setFocusable(false);
 }
 delButton.setBounds(50,430,145,50);
 clrButton.setBounds(205,430,145,50);
 //Panel for buttons
 panel=new JPanel();
 panel.setBounds(50,100,300,300);
 panel.setLayout(new GridLayout(4,4,10,10));
 panel.add(numberButton[1]);
 panel.add(numberButton[2]);
 panel.add(numberButton[3]);
 panel.add(addButton);
 panel.add(numberButton[4]);
 panel.add(numberButton[5]);
 panel.add(numberButton[6]);
 panel.add(subButton);
 panel.add(numberButton[7]);
 panel.add(numberButton[8]);
 panel.add(numberButton[9]);
 panel.add(mulButton);
 panel.add(numberButton[0]);
 panel.add(decButton);
 panel.add(divButton);
 panel.add(eqButton);
 //All buttons add in Frame
 frame.add(delButton);
 frame.add(clrButton);
 frame.add(textfield);
 frame.add(panel);
 frame.setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
 for(int i=0;i<10;i++) {
 if(e.getSource()==numberButton[i]) {
 textfield.setText(textfield.getText().concat(String.valueOf(i)));
 }
 }
 if(e.getSource()==decButton) {
 textfield.setText(textfield.getText().concat("."));
 }
 if(e.getSource()==addButton) {
 num1=Double.parseDouble(textfield.getText());
 operator='+';
 textfield.setText("");
 }
 if(e.getSource()==mulButton) {
 num1=Double.parseDouble(textfield.getText());
 operator='*';
 textfield.setText("");
 }
 if(e.getSource()==subButton) {
 num1=Double.parseDouble(textfield.getText());
 operator='-';
 textfield.setText("");
 }
 if(e.getSource()==divButton) {
 num1=Double.parseDouble(textfield.getText());
 operator='/';
 textfield.setText("");
 }
 if(e.getSource()==eqButton) {
 num2=Double.parseDouble(textfield.getText());
 switch(operator) {
 case '+':
 result=num1+num2;
 break;
 case '-':
 result=num1-num2;
 break;
 case '*':
 result=num1*num2;
 break;
 case '/':
 result=num1/num2;
 break;
 }
 textfield.setText(String.valueOf(result));
 num1=result;
 }
 if(e.getSource()==clrButton) {
 textfield.setText("");
 }
 if(e.getSource()==delButton) {
 textfield.setText("");
 }
 }
 public static void main(String[] args) {
 // TODO Auto-generated method stub
 new Calculator();
 }
}