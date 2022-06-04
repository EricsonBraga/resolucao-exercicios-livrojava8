
package cap3;

import javax.swing.JOptionPane;
public class Ex3Login {
    
    String usuario = "java8";
    String senha = "java8";
    String aux1, aux2;
    int n = 2;
    
    public void Executa(){
        for(int cont =0; cont<3;){
            aux1= JOptionPane.showInputDialog("Usuário");
            aux2= JOptionPane.showInputDialog("Senha");
            if(aux1.equals(usuario) && aux2.equals(senha)){
                JOptionPane.showMessageDialog(null, "Usuário e Senha aceitos!");
                cont = 3;
            }else{
                JOptionPane.showMessageDialog(null, "Falha no LOGIN. \n" +n+ " Tentativas restantes!");
                cont++;
                n--;
            }
        }
    }
    
}
