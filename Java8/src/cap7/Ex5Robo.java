
package cap7;

import javax.swing.JOptionPane;
public class Ex5Robo implements Ex5Controle{
    
    @Override
    public void Falar(){
        JOptionPane.showMessageDialog(null, "Falando!");
    }
    @Override
    public void Virar(){
        JOptionPane.showMessageDialog(null, "Virando!");
    }
    @Override
    public void Andar(){
        JOptionPane.showMessageDialog(null, "Andando!");
    }
}
