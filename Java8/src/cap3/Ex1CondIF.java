
package cap3;

import javax.swing.JOptionPane;
public class Ex1CondIF {
    //cadastro de produtos
    
     String produto, aux;
     double preco, desconto, novoPreco;
     
     public void Executa(){
        try{
            aux = JOptionPane.showInputDialog("Nome do produto:");
            produto = aux;

            aux = JOptionPane.showInputDialog("Preço do produto:");
            preco = Double.parseDouble(aux);
        
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Informe um número válido!");
            System.exit(0);
        }
        
        
        if(preco>=50 && preco<200){
            desconto = 0.95;      
        }else if(preco>=200 && preco<500){
            desconto = 0.94;
        }else if(preco>=500 && preco<1000){
            desconto = 0.93;
        }else if(preco>=1000){
            desconto = 0.92;
        }else if(preco<=0){
            JOptionPane.showMessageDialog(null, "Informe um valor maior que zero!");
            System.exit(0);
        }
        
        novoPreco = preco*desconto;
        
        JOptionPane.showMessageDialog(null, "Produdo: " +produto+
                                            "\nValor original: " +preco+
                                            "\nValor com desconto: " +novoPreco);
     
     }
    
    
    
    
    
    
    
    
    
}
