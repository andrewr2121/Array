/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrray;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andrew
 */
public class Arrray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int [] nuevoarray = {3,2,7,8,9,2,2,1,4,9};
        int sacarnumero=2;
        int posiciones=0;
        
        
        for (int z = 0; z <nuevoarray.length; z++) {
            if(nuevoarray[z]==sacarnumero){
            posiciones ++;

        }
        }
        int valorarraydos= nuevoarray.length-posiciones;
        int [] arraydos = new int [valorarraydos];
        for (int i = 0; i <nuevoarray.length; i++) {
            if(nuevoarray[i]!=sacarnumero){
                for (int j = 0; j <arraydos.length; j++) {
                    arraydos[j]=nuevoarray[i];
               
         }
          }
         }
        
               
         for (int x = 0; x<arraydos.length ; x++){
         System.out.println (arraydos[x] + " ");
        }
        
        
    
    
}
    }
