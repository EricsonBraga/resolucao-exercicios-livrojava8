
package cap2;

import javax.swing.JOptionPane;
public class Dialogo2 {
    
    float prova1, prova2, trabalho, media;
    String aux;
    
    public void Executa(){
        try{
            aux = JOptionPane.showInputDialog("Nota da 1ª prova:");
            prova1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Nota da 2ª prova:");
            prova2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Nota do trabalho:");
            trabalho = Float.parseFloat(aux);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Informe números válidos. " +ex);
        }
        
        media = (prova1 + prova2+ trabalho)/3;
        
        if(media>=6){
            JOptionPane.showMessageDialog(null, "MÉDIA= "+media+  "\nAluno APROVADO!");
        }else{
            JOptionPane.showMessageDialog(null, "MÉDIA= "+media+ "\nAluno REPROVADO!");
        }
        
    }
    
}
