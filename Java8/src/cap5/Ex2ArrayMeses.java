
package cap5;
import javax.swing.JOptionPane;
public class Ex2ArrayMeses {
    
    String meses[] = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho",
        "Agosto","Setembro","Outubro","Novembro","Dezembro"};
    int aux;
    public void Executa(){
        aux = (int)(Math.random()*11);
        JOptionPane.showMessageDialog(null, "Número sorteado: " +(aux+1)
                                            +"\nMês correspondente: "+meses[aux]);
    }
}
