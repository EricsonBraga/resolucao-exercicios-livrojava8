
package cap5;

import javax.swing.JOptionPane;
public class Ex5ArrayEstacionamento {
    String estacionamento[] = new String[10];
    String aux, aux2, placa;
    int opcao, vaga;
    
    public void Executa(){
        while(opcao!=4){
            try{
                aux = JOptionPane.showInputDialog("Digite a opção:"
                +"\n1 - ENTRADA"
                +"\n2 - SAÍDA"
                +"\n3 - LISTAR VAGAS"
                +"\n4 - ENCERRAR");

                opcao = Integer.parseInt(aux);

                switch(opcao){
                    case 1:
                       aux2 = JOptionPane.showInputDialog("Informe o número da vaga:"
                               + "\nDe 1 a 10"); 
                       vaga = Integer.parseInt(aux2);
                       if(estacionamento[vaga-1] == null){
                            placa = JOptionPane.showInputDialog("Informe a placa do veículo:");
                            estacionamento[vaga-1] = placa;
                       }else{
                           JOptionPane.showMessageDialog(null, "VAGA JÁ ESTÁ OCUPADA!"
                                   + "\nINFORME UM NÚMERO VÁLIDO!");
                       }
                       break;
                    case 2:
                        aux2 = JOptionPane.showInputDialog("Informe o número da vaga:");
                        vaga = Integer.parseInt(aux2);
                        if(estacionamento[vaga-1] != null){
                            estacionamento[vaga-1] = null;
                        }else{
                            JOptionPane.showMessageDialog(null, "VAGA JÁ ESTÁ VAZIA!"
                                    + "\nINFORME O NÚMERO CORRETO!");
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "VAGA 1: " +estacionamento[0]+
                                "\nVAGA 2: " +estacionamento[1]+
                                "\nVAGA 3: " +estacionamento[2]+
                                "\nVAGA 4: " +estacionamento[3]+
                                "\nVAGA 5: " +estacionamento[4]+
                                "\nVAGA 6: " +estacionamento[5]+
                                "\nVAGA 7: " +estacionamento[6]+
                                "\nVAGA 8: " +estacionamento[7]+
                                "\nVAGA 9: " +estacionamento[8]+
                                "\nVAGA 10: " +estacionamento[9]);
                        break;
                    case 4:
                        break;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "INFORME UM VALOR VÁLIDO!");
            }
        }
    }
    
}
