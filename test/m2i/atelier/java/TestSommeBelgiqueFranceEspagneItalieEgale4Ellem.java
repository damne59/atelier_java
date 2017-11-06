/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelier.java;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class TestSommeBelgiqueFranceEspagneItalieEgale4Ellem {
    
    @Test
    public void exo1(){
        
        List<String> listPays = new ArrayList<>();
        listPays.add("Fance");
        listPays.add("Belgique");
        
        
        List<String> listPays2 = new ArrayList<>();
        listPays2.add("Espagne");
        listPays2.add("Italie");
       
        
       List<String> listTotal = new ArrayList<>();
       listTotal.addAll(listPays);
       listTotal.addAll(listPays2);
       
       int nbElm = listTotal.size();
       Assert.assertEquals(4, nbElm);
       
       
    }
    
}
