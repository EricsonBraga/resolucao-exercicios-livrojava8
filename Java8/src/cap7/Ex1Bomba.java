
package cap7;

import javax.swing.JOptionPane;
public class Ex1Bomba {
    
    private boolean status;

        
    public void Ligar() throws InterruptedException{
        this.status = true;
        JOptionPane.showMessageDialog(null, "BOMBA LIGADA! \n STATUS: " +status);
        String aux = JOptionPane.showInputDialog("Deixar ligada por quantos segundos?");
        int segundos = Integer.parseInt(aux);
        
        for(int i = segundos; i>0; i--){
            System.out.println(i+" segundos restantes");
            Thread.sleep(1000);
        }
        
        this.Desligar();
        
        
    }

    public void Desligar(){
        this.status = false;
        JOptionPane.showMessageDialog(null, "BOMBA DESLIGADA! \nSTATUS: " +status);
        
    }
   
    
}
