
package cap4;

import javax.swing.JOptionPane;
public class ex4InverteString {
    
    String frase, aux, nova= "";
    int tamanho;
    
    public void Executa(){
        frase = JOptionPane.showInputDialog("Digite uma frase:");
        aux = frase.trim();
        aux = aux.replace(" ", "");
        tamanho= aux.length();
        
        for(int i=tamanho-1; i>=0; i--){
            nova += aux.charAt(i);
        }
        JOptionPane.showMessageDialog(null, "Frase fornecida: " +frase+
                                            "\nFrase invertida: " +nova);
    }
    
    
    
}
