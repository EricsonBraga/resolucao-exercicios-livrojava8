
package cap7;

import javax.swing.JOptionPane;


public class Ex5UsaRobo {

  
    public static void main(String[] args) {
        
        Ex5Robo walle = new Ex5Robo();
        try{
            walle.Andar();
            Thread.sleep(5*1000);
            walle.Falar();
            Thread.sleep(5*1000);
            walle.Virar();
        }catch(InterruptedException ex){
             JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
}
