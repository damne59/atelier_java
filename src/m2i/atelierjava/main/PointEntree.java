/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.main;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class PointEntree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long a = 10;
        long b = 20;
        long c = 30;
        
        System.out.println(a+b+c);
        
        c = a;
        a = b;
        b = c;
        System.out.println(a+" "+b);
      
        
        // TODO code application logic here
//        String monLogin;
//        String monPasse;
//        
//        Scanner maVaScanner = new Scanner(System.in);
//        System.out.print("Votre identifiant:");
//        monLogin = maVaScanner.nextLine();
//        System.out.print("Votre mot de passe:");
//        monPasse = maVaScanner.nextLine();
//        System.out.print("monLogin"+"monPasse");
    }
    
}
