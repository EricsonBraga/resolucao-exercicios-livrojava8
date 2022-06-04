
package cap3;

import javax.swing.JOptionPane;



public class IfResumido {
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
        
        //(valorTransação é maior que valorVenal)?  
        //valorMaior recebe o valor que for maior entre as duas variáveis
        valorMaior = (valorTransacao > valorVenal) ? valorTransacao:valorVenal;
        valorImposto = valorMaior*(percentual/100);
        
        JOptionPane.showMessageDialog(null, "O valor do ITBI é de R$" +valorImposto);
    }
    
        
        
        
        
}
    
    

