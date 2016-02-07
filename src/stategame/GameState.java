/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stategame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lammi
 */
public abstract class GameState {
    
    protected String[] fruits = new String[]{"Appelsiini", "Omena", "Päärynä", "Banaani", "Kiivi", "Mandariini","Vesimeloni", "Mango", "Persikka"};
    private StateContext con;
    java.util.Random random = new java.util.Random();
    public GameState(StateContext con) {
       this.con = con;
    }
    
    public abstract void setGameObjects();
    public abstract boolean checkTxt(String a, String b);
    
    public abstract String getRandomFruit();
    public abstract String[] getRandomFruitWithResult();
    
}
