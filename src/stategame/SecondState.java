/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lammi
 */
public class SecondState extends GameState{
    
   private List<String> fruitList = new ArrayList<String>();

    public SecondState(StateContext con) {
        super(con);
        for (int i=0; i<fruits.length; i++)
        fruitList.add(fruits[i]);
    }
   
    
    
    public void setGameObjects() {
        
    }

    
    public boolean checkTxt(String a, String b) {
        if(a.equals(b)){
            return true;
        } else {
            return false;
        }
        }

    
   

    public String getRandomFruit() {
       int rand = random.nextInt(9);
       while(fruitList.get(rand)!=null){
        return fruitList.get(random.nextInt(9));}
       return null;
    }
    public String[] getRandomFruitWithResult() {
        int rand = random.nextInt(9);
        String[] res=new String[]{fruitList.get(rand), fruitList.get(rand)};
        return res;
    }
    
}
