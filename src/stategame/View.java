/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lammi
 */
public class View extends JFrame{
    
    
    private JButton b1, b2, b3, b4, b5;
    private StateContext s;
    private boolean res;
    private JPanel buttons, buttons2, buttons3;
    private JPanel quiz;
    private JLabel txt;
    java.util.Random random = new java.util.Random();
    
    
    
   public View(){
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(800, 500));
        setVisible(true);
        quiz = new JPanel();
        buttons = new JPanel();
        buttons2 = new JPanel();
   }
   
   public void setStateContext(StateContext s) {
       this.s=s;
       
   }
   public void setTextfirstStage(String a, String res) {
       if(random.nextInt(2)+1==1){
           b1.setText(res);
           b2.setText(a);
       } else {
           b2.setText(res);
           b1.setText(a);
       }
       txt.setText(res);
   }
   
   public void setTextSecondStage(String a, String b,String c, String res) {
       int rand = random.nextInt(4)+1;
       
       
       switch(rand) {
           case 1:
               b1.setText(res);
               b2.setText(a);
               b3.setText(b);
               b4.setText(c);
               break;
            case 2:
               b2.setText(res);
               b1.setText(a);
               b3.setText(b);
               b4.setText(c);
               break;
            case 3:
               b3.setText(res);
               b2.setText(a);
               b1.setText(b);
               b4.setText(c);
               break;
            case 4:
               b4.setText(res);
               b2.setText(a);
               b3.setText(b);
               b1.setText(c);
               break;
              
       }
       txt.setText(res);
   }
   public void setTextFinalStage (String a, String b,String c, String d, String res) {
       
       int rand = random.nextInt(5)+1;
       
       switch(rand) {
           case 1:
               b1.setText(res);
               b2.setText(a);
               b3.setText(b);
               b4.setText(c);
               b5.setText(d);
               break;
            case 2:
               b2.setText(res);
               b1.setText(a);
               b3.setText(b);
               b4.setText(c);
               b5.setText(d);
               break;
            case 3:
               b3.setText(res);
               b2.setText(a);
               b1.setText(b);
               b4.setText(c);
               b5.setText(d);
               break;
            case 4:
               b4.setText(res);
               b2.setText(a);
               b3.setText(b);
               b1.setText(c);
               b5.setText(d);
               break;
            case 5:
               b5.setText(res);
               b2.setText(a);
               b3.setText(b);
               b1.setText(c);
               b4.setText(d);
               break;
       }
       txt.setText(res);
   }
   
   public void firstButtons(String a, String res) {
       b1 = new JButton();
       b2 = new JButton();
       txt = new JLabel();
       
       if(random.nextInt(2)+1==1){
           b1.setText(res);
           b2.setText(a);
       } else {
           b2.setText(res);
           b1.setText(a);
       }
       txt.setText(res);
       
       quiz.add(txt);
       quiz.repaint();
       b1.addActionListener(ae ->
       {s.checkTxt(b1.getText(), txt.getText())
               ;});
       
       b2.addActionListener(ae ->
       {s.checkTxt(b2.getText(), txt.getText())
               ;});
       
       buttons.add(b1);
       buttons.add(b2);
       buttons.repaint();
       add(buttons, BorderLayout.SOUTH);
       add(quiz, BorderLayout.NORTH);
       buttons.setVisible(true);
       quiz.setVisible(true);
   }
   
//   public void actionPerformed(ActionEvent ae) {
//              s.checkTxt(b1.getText(), txt.getText());
//           }
   public void secondButtons(String a, String b,String c, String res) {
       b3 = new JButton();
       b4 = new JButton();
       txt.setText(res);
       
       quiz.repaint();
       
       int rand = random.nextInt(4)+1;
       
       switch(rand) {
           case 1:
               b1.setText(res);
               b2.setText(a);
               b3.setText(b);
               b4.setText(c);
               break;
            case 2:
               b2.setText(res);
               b1.setText(a);
               b3.setText(b);
               b4.setText(c);
               break;
            case 3:
               b3.setText(res);
               b2.setText(a);
               b1.setText(b);
               b4.setText(c);
               break;
            case 4:
               b4.setText(res);
               b2.setText(a);
               b3.setText(b);
               b1.setText(c);
               break;
       }
       
       
       b3.addActionListener(ae ->
       {s.checkTxt(b3.getText(), txt.getText())
               ;});
       
       b4.addActionListener(ae ->
       {s.checkTxt(b4.getText(), txt.getText())
               ;});
       
       buttons.add(b3);
       buttons.add(b4);
       buttons.repaint();
       repaint();
   }
   
   public void finalButtons(String a, String b,String c, String d, String res) {
       b5 = new JButton();
       txt.setText(res);
       quiz.repaint();
       
       int rand = random.nextInt(5)+1;
       System.out.println(rand);
       switch(rand) {
           case 1:
               b1.setText(res);
               b2.setText(a);
               b3.setText(b);
               b4.setText(c);
               b5.setText(d);
               break;
            case 2:
               b2.setText(res);
               b1.setText(a);
               b3.setText(b);
               b4.setText(c);
               b5.setText(d);
               break;
            case 3:
               b3.setText(res);
               b2.setText(a);
               b1.setText(b);
               b4.setText(c);
               b5.setText(d);
               break;
            case 4:
               b4.setText(res);
               b2.setText(a);
               b3.setText(b);
               b1.setText(c);
               b5.setText(d);
               break;
            case 5:
               b5.setText(res);
               b2.setText(a);
               b3.setText(b);
               b1.setText(c);
               b4.setText(d);
               break;
       }
       
       
       
       b5.addActionListener(ae ->
       {s.checkTxt(b5.getText(), txt.getText())
               ;});
       
       
       buttons.add(b5);
       buttons.repaint();
       repaint();
   } 
}
        
    

    
    
    

