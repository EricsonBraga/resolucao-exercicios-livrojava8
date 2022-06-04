
package cap4;

import javax.swing.JOptionPane;
public class Ex5IndexOf {
    
    String frase;
    int index1, index2;
    
    public void Executa(){
        frase = JOptionPane.showInputDialog("Digite uma frase!");
        index1 = frase.indexOf("sexo");
        index2 = frase.indexOf("sexual");
        if(index1 == -1 && index2 == -1){
            JOptionPane.showMessageDialog(null, "Frase informada: " +frase);
        }else{
            JOptionPane.showMessageDialog(null, "CONTEUDO IMPROPRIO!");
        }
        
    }
    
}
