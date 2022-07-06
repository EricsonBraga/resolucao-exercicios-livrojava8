
package cap7;

import javax.swing.JOptionPane;
public class Ex4UsaBrinquedo {

   
    public static void main(String[] args) {
        
        Ex4Brinquedo brinquedo = new Ex4Brinquedo("Boneca", 54.9f);
        
        String faixaEtaria = JOptionPane.showInputDialog("Informe uma faixa etária:"
                + "\n0 a 2"
                + "\n3 a 5"
                + "\n6 a 10"
                + "\nacima de 10");
        brinquedo.setFaixaEtaria(faixaEtaria);
        
        brinquedo.Mostrar();
        
        
    }
    
}
