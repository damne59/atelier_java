/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import org.junit.Test;

/**
 *
 * @author Formation
 */
public class TableauxTest {
    
    //@Test
    public void Tableau (){
        String[] tab = new String[] {"abc", "def", "ghi"};
        for(int i=0;i<tab.length;i++){
            System.out.println( tab[i]);
//for (String s : tab) {
           // System.out.println( s );
            
        }
    }
    // crée tab 1..10
    @Test
    public void tab2 (){
    int [] tab = new int[10];
        for (int i = 1; i < 11; i++) {
            tab[i-1] = i;
            
           }
  
       
       
      // affiche le carre
    for (int i : tab) {
    VariablesTest vTest = new VariablesTest();
    
            System.out.println(vTest.carre(i));
}
        
    
}
}