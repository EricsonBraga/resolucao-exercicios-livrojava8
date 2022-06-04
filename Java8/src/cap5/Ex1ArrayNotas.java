
package cap5;

import java.util.Arrays;
import javax.swing.JOptionPane;
public class Ex1ArrayNotas {
    
    double notas[] = new double[5], media, soma;
    String aux;
    
    public void Executa(){
        for(int i=0; i<5; i++){
            aux = JOptionPane.showInputDialog("Informe a nota do aluno"+(i+1));
            notas[i] = Double.parseDouble(aux);
            soma += notas[i];
        }
        Arrays.sort(notas);
        media = soma/notas.length;
        JOptionPane.showMessageDialog(null, "Notas em ordem decrescente: "
        +"\nNOTA 5: "+notas[4]
        +"\nNOTA 4: "+notas[3]
        +"\nNOTA 3: "+notas[2]
        +"\nNOTA 2: "+notas[1]
        +"\nNOTA 1: "+notas[0]
        +"\nMEDIA: " +media);
        
    }
    
}
