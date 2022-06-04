
package cap3;


import javax.swing.JOptionPane;

public class Ex4Tabuada {
    int numero, n, vetor[]=new int[10], i=0;
    String aux;
    
    
    public void Executa(){
        try{
            aux = JOptionPane.showInputDialog("Digite um número: ");
            numero = Integer.parseInt(aux);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Informe um número inteiro!\n" + ex.toString());
            System.exit(0);
        }
        
        for(int cont = 1; cont<=10; cont++){
            
                n = numero * cont;
                vetor[i]= n;
                i++;
            
            
        }
        JOptionPane.showMessageDialog(null, numero+ " x  1 = " +vetor[0]+
                                       "\n"+numero+ " x  2 = " +vetor[1]+
                                       "\n"+numero+ " x  3 = " +vetor[2]+
                                       "\n"+numero+ " x  4 = " +vetor[3]+
                                       "\n"+numero+ " x  5 = " +vetor[4]+
                                       "\n"+numero+ " x  6 = " +vetor[5]+
                                       "\n"+numero+ " x  7 = " +vetor[6]+
                                       "\n"+numero+ " x  8 = " +vetor[7]+
                                       "\n"+numero+ " x  9 = " +vetor[8]+
                                       "\n"+numero+ " x  10 = " +vetor[9]);
        
    }
    
}
