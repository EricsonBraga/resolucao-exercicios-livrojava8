
package cap6;

import javax.swing.JOptionPane;


public class Ex5MetodosArray2 {
   
    public static int[] RetornaArray(int num){
        int[] elementos = new int[num];
        for(int i=0; i<num; i++){
            elementos[i] = (int)(Math.random()*1000);
            System.out.println(elementos[i]);
        }
        
        return elementos;
    }
    
    /*public static void main(String[] args){
                
       int [] aux = cap6.Ex5MetodosArray2.RetornaArray(6);
       
    }*/
    
    
}
