
package cap6;


public class Ex5MetodosArray {
    
    public static int PesquisaNumero(int[] lista1, int[] lista2, int num){
        int cont=0;
        for(int i=0; i<5; i++){
            if(num == lista1[i]){
                cont++;
            }
        }        
        for(int i=0; i<lista2.length;i++){
            if(num == lista2[i]){
                cont++;
            }
        }    
        
        
        return cont;
    }

    
    /*  public static void main(String[] args){
                
       int[] lista1 = {1, 2, 3, 4, 5};
       int[] lista2 = {5, 6, 7, 8, 9};
       
       JOptionPane.showMessageDialog(null, cap6.Ex5MetodosArray.PesquisaNumero(lista1, lista2, 4));
        
        
     
    }*/
    
}
