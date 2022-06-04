
package cap3;

import javax.swing.JOptionPane;
public class Ex2MaiorMenor {
    
    int RE, r1, r2, r3, r4, maior, menor; //RE= resistencia equivalente; r1 a r4 resistencias do circuito
    String aux;
    public void Executa(){
        try{
            aux = JOptionPane.showInputDialog("Informe o número da resistência 1 ligada em série");
            r1 = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Informe o número da resistência 2 ligada em série");
            r2 = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Informe o número da resistência 3 ligada em série");
            r3 = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Informe o número da resistência 4 ligada em série");
            r4 = Integer.parseInt(aux);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Informe um número válido!");
            System.exit(0);
        }
        
        RE= r1+r2+r3+r4;
        
        if(r1>r2 && r1>r3 && r1>4){
            maior = r1;
        }else if (r1<r2 && r1<3 && r1<r4){
            menor = r1;
        }
        if(r2>r1 && r2>r3 && r2>r4){
            maior = r2;
        }else if(r2<r1 && r2<r3 && r2<r4){
            menor = r2;
        }
        if(r3>r1 &&r3>r2 && r3>r4){
            maior = r3;
        }else if(r3<r1 && r3<r2 && r3<r4){
            menor = r3;
        }
        if(r4>r1 && r4>r2 && r4>r3){
            maior = r4;
        }else if(r4<r1 && r4<r2 && r4<r3){
            menor = r4;
        }
        
        JOptionPane.showMessageDialog(null, "Resistências fornecidas:\n" 
                                            +r1+", "+r2+", "+r3+", "+r4+
                                            "\nResistência Equivalente: " +RE+
                                            "\nA maior resistência é: " +maior+
                                            "\nA menor resistência é: " +menor);
        
    }
    
}
