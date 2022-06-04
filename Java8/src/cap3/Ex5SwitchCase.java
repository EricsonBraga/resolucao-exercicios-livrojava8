/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap3;

import javax.swing.JOptionPane;

/**
 *
 * @author Donald
 */
public class Ex5SwitchCase {
    
    int exercicio;
    String aux;
    
    public void Executa(){
        aux = JOptionPane.showInputDialog("Digite o número do exercício desejado!\n"
                + "1 - Exercício 1\n"
                + "2 - Exercício 2\n"
                + "3 - Exercício 3\n"
                + "4 - Exercicio 4");
        exercicio = Integer.parseInt(aux);
        
        switch(exercicio){
            case 1:
                cap3.Ex1CondIF ex1 = new cap3.Ex1CondIF();
                ex1.Executa();
                break;
            case 2:
                cap3.Ex2MaiorMenor ex2 = new cap3.Ex2MaiorMenor();
                ex2.Executa();
                break;
            case 3:
                cap3.Ex3Login ex3 = new cap3.Ex3Login();
                ex3.Executa();
                break;
            case 4:
                cap3.Ex4Tabuada ex4 = new cap3.Ex4Tabuada();
                ex4.Executa();
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Digite um número de 1 a 4");
        }
    }
    
}
