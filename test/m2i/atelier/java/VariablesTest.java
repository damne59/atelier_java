/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class VariablesTest {

    @Test
    public void testConceneKingstonEtJamaique() {
        String a = "Jamaique ";
        String b = "Kingston";
        String c = b.toUpperCase() + "," + a.toUpperCase();
        System.out.println(c);
    }

    @Test
    public void testExercice2() {
        int a = 123;
        String b = "coucou";
        String c = a + b;
        String d = b + a;
        System.out.println(c);
        System.out.println(d);
    }

    @Test
    public void testExercise3() {
        int a = 10;
        String b = "20";
        int b1 = Integer.parseInt(b);

        System.out.println(a + b1);

    }

    public int carre(int nb) {

        return (nb * nb);
    }

    @Test
    public void test4() {
        System.out.println(carre(9));
    }
    public int puissance(int nb,int p){
        int  res  = 1;
        
        
        System.out.println();
        
        return res;
        
        
        
    }





}

