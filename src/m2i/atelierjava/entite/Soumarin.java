/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class Soumarin extends Vehicule{

    private boolean monte;
    
     public boolean isMonte(){
         return monte;
     }  

    public void setMonte(boolean monte) {
        this.monte = monte;
    }
     
        
    
    public Soumarin(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int pas, boolean monte) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, pas);
        this.monte = monte;
        
    }
    
  
        

    @Override
    public void reculer() {
        super.reculer(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        
        if(this.monte)
           this.y = this.y + this.pas/2;
        else 
            this.y = this.y - this.pas/2;
        
         
    }
            

}
