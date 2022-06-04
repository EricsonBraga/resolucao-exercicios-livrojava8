
package cap3;

import javax.swing.JOptionPane;
public class ExemploFor {
    
    int cont;
    
    public void Executa1(){
        
        for(cont = 1; cont<10; cont++){
            JOptionPane.showMessageDialog(null, "ERICSON\n" +cont);
            
        }
    }
    
    public void Executa2(){
        for(cont = 1; cont !=0;){
            JOptionPane.showMessageDialog(null, "Ericson");
            String aux;
            aux = JOptionPane.showInputDialog("Digite 0 para parar\n Digite 1 para continuar");
            cont = Integer.parseInt(aux);
   
        }
        
    } 
}
