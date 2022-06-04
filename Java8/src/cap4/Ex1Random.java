
package cap4;

import javax.swing.JOptionPane;
public class Ex1Random {
    
    int numero;
    String Dado=" ";
    
    public void Executa(){
        for(int i=0; i<3; i++){
            numero = (int) (Math.random()*6)+1;
            Dado += numero+"  ";
        }        
        JOptionPane.showMessageDialog(null, "Números sorteados do dado:\n" +Dado);
       
   }
    
}
