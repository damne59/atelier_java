/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Formation
 */
public class Serie {
   
    private String titre; 
    private int anneeDeSortie;
    private int nombreDeSaisons;
    private String synopsis;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String t) {
        titre = t;
    }

    public int getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(int anneeDeSortie) {
        this.anneeDeSortie = anneeDeSortie;
    }

    public int getNombreDeSaisons() {
        return nombreDeSaisons;
    }

    public void setNombreDeSaisons(int nombreDeSaisons) {
        this.nombreDeSaisons = nombreDeSaisons;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String Synopsis) {
        this.synopsis = Synopsis;
    }
    
    public void affiche(){
        System.out.println( titre  + " " + anneeDeSortie + " " + synopsis + " " + nombreDeSaisons );
    }
    public void initialise(String titre, String synopsis, int anneeDeSortie, int nombreDeSaison){
       this.titre = titre;
       this.synopsis = synopsis;
       this.anneeDeSortie = anneeDeSortie;
       this.nombreDeSaisons = nombreDeSaison;
           
    }
    
}
