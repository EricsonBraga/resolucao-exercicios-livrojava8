
package cap4;

import javax.swing.JOptionPane;
public class Ex2ArredondarRound {
    
    double preco, novopreco, porcentagem=1.12;
    String aux, remedio;
    public void Executa(){
        remedio = JOptionPane.showInputDialog("Informe o nome do remédio");
        aux = JOptionPane.showInputDialog("Informe o preço do remédio");
        preco = Integer.parseInt(aux);
        do{
            novopreco= preco*porcentagem;
            JOptionPane.showMessageDialog(null, "Preço com reajuste: $" +Math.round(novopreco));
            remedio = JOptionPane.showInputDialog("Informe o nome do remédio");
            aux = JOptionPane.showInputDialog("Informe o preço do remédio\n"
                    + "Digite 0 para encerrar a execução!");
            preco = Integer.parseInt(aux);
        }while(preco!=0);
    }
    
}
