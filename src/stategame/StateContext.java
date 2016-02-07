/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author lammi
 */
class StateContext {
    private GameState cState;
    protected static int stateCounter=0;
    private View v;
    private long time, endTime;
    
     
    StateContext() {
        setState(new FirstState(this));
        v = new View();
        v.setStateContext(this);
    }

   
    void setState(final GameState newState) {
        cState = newState;
    }
   
    
    
    public void StartGame(){
         
        time = System.currentTimeMillis();
         String[] temp = cState.getRandomFruitWithResult();
      v.firstButtons(cState.getRandomFruit(), temp[0]);
    }
    
    public void checkTxt(String a, String b) {
       String[] temp;
        
        if(cState.checkTxt(a, b)){
            stateCounter++;
        }else {
            
        }
         
        if (stateCounter==3) {
            setState(new SecondState(this));
            temp = cState.getRandomFruitWithResult();
            v.secondButtons(cState.getRandomFruit(), cState.getRandomFruit(), cState.getRandomFruit(), temp[0]);
        }
        
        if (stateCounter==6) {
            setState(new FinalState(this));
             temp = cState.getRandomFruitWithResult();
            v.finalButtons(cState.getRandomFruit(), cState.getRandomFruit(), cState.getRandomFruit(), cState.getRandomFruit(), temp[0]);
        }
        if(stateCounter <3){
         temp = cState.getRandomFruitWithResult();
        v.setTextfirstStage(cState.getRandomFruit(), temp[0]);
        }
        if(stateCounter<6&&stateCounter>3){
            temp = cState.getRandomFruitWithResult();
            v.setTextSecondStage(cState.getRandomFruit(), cState.getRandomFruit(), cState.getRandomFruit(), temp[0]);
        }
        if (stateCounter<10&& stateCounter>6){
            temp = cState.getRandomFruitWithResult();
            v.setTextFinalStage(cState.getRandomFruit(), cState.getRandomFruit(), cState.getRandomFruit(), cState.getRandomFruit(), temp[0]);
        }
        if (stateCounter==10) {
            endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Peli läpi. Aikaa meni "+((endTime-time)/1000)+"s");
            System.exit(5);
        }
    }
    
    
    

    
}
