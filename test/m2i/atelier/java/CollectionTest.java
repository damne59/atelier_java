/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class CollectionTest {
    
    @Test
    public void testList(){
        List<String> listFilms = new ArrayList<>();
        
        
        listFilms.add("Dracula");
        listFilms.add("Matrix");
        listFilms.add("Winnie l'ourson");
        
        
        
        System.out.println(listFilms.size());
        
        //for (String Film : listFilms) {
           // System.out.println(Film);
            
        }
        
        
    }
    

