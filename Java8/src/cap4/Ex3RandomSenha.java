
package cap4;

import javax.swing.JOptionPane;
public class Ex3RandomSenha {
    
    int num, i, aux;
    String senha="";
    
    public void Executa(){
        
        num = (int)(Math.random()*5)+5;
        for(i=0; i<num; i++){
            aux = (int)(Math.random()*9);
            senha+= aux+ " ";
        }
        JOptionPane.showMessageDialog(null, "Número sorteado: "+num+
                                        "\nSenha gerada: " +senha);
    }
    
    
   
    
}
