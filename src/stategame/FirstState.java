/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategame;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lammi
 */
public class FirstState extends GameState{
    private List<String> fruitList = new ArrayList<String>();
    public FirstState(StateContext con) {
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

    
    public void correct() {
        }

    
    public void notCorrect() {
        }

    public String getRandomFruit() {
       //s[random.nextInt(9)]
        return fruits[random.nextInt(9)];
    }
    public String[] getRandomFruitWithResult() {
        int rand = random.nextInt(9);
        String[] res=new String[]{fruitList.get(rand), fruitList.get(rand)};
        return res;
    }
    
}
