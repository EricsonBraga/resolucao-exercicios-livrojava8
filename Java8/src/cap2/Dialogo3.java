/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap2;

import javax.swing.JOptionPane;

public class Dialogo3 {
    
    String genero, aux;
    int idade, tempo, aposentadoria;
    
    
    public void Executa(){
        try{
            aux = JOptionPane.showInputDialog("Informe seu gênero"+ "\nM para masculino"+"\nF para feminino");
            genero = aux;

            aux = JOptionPane.showInputDialog("Informe sua idade");
            idade = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Informe seu tempo de contribuição:");
            tempo = Integer.parseInt(aux);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Digite os valores corretos");
            System.exit(0);
        }    
        
        if("M".equals(genero)){
            idade = 65 - idade;
            tempo = 35 - tempo;
            if(idade == 0 || tempo == 0){
                JOptionPane.showMessageDialog(null, "Você já pode se aposentar!");
            }else{
                JOptionPane.showMessageDialog(null, "Faltam "+idade+ " anos para se aposentar por idade"
                        + "\nFaltam "+tempo+" anos para se aposentar por tempo de contribuição");
            }        
            
        }else if("F".equals(genero)){
            idade = 60 - idade;
            tempo = 30 - tempo;
            if(idade == 0 || tempo == 0){
                JOptionPane.showMessageDialog(null, "Você já pode se aposentar!");
            }else{
                JOptionPane.showMessageDialog(null, "Faltam "+idade+ " anos para se aposentar por idade"
                        + "\nFaltam "+tempo+" anos para se aposentar por tempo de contribuição");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Informe uma letra válida! \nM ou F");
        }
            
        
        
    }
    
}
