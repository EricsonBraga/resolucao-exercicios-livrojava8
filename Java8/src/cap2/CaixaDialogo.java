
package cap2;

import javax.swing.JOptionPane;
public class CaixaDialogo {
    
    double valorTransacao, valorVenal, percentual, valorMaior, valorImposto;
    String aux;
    
    
    public void Executa(){
        
        try{
           
            aux = JOptionPane.showInputDialog("Qual o valor da transação de venda?");
            valorTransacao = Double.parseDouble(aux);
        
            aux = JOptionPane.showInputDialog("Qual o valor venal do terreno?");
            valorVenal = Double.parseDouble(aux);
       
            aux = JOptionPane.showInputDialog("Qual o valor do percentual de ITBI?");
            percentual = Double.parseDouble(aux);
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Informe valores válidos. " +ex);
            System.exit(0);
        }
        
        if(valorTransacao > valorVenal){
            valorImposto = valorTransacao * (percentual/100);
        }else{
            valorImposto = valorVenal * (percentual/100);
        }
        
        JOptionPane.showMessageDialog(null, "O valor do ITBI é de R$" +valorImposto);

    }
    
    
    
        
        
        
        
}
    

