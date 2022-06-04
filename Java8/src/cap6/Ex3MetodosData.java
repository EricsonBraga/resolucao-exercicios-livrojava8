
package cap6;

import javax.swing.JOptionPane;
public class Ex3MetodosData {
    static String aux="", aux2;
    
    public static int GetDia(String mensagem){
        try{
            aux2  = mensagem.substring(0, 2);
            int dia = Integer.parseInt(aux2);
            return dia;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Formato de data incorreto");
            return 0;
        }
    }
    
    public static int GetMes(String mensagem){
        try{
            //aux = JOptionPane.showInputDialog(mensagem);
            aux2 = mensagem.substring(3, 5);
            int mes = Integer.parseInt(aux2);
            return mes;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Formato de data incorreto");
            return 0;
        }
    }
    
    public static int GetAno(String mensagem){
        try{
            //aux = JOptionPane.showInputDialog(mensagem);
            aux2 = mensagem.substring(6, 10);
            int ano = Integer.parseInt(aux2);
            return ano;    
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Formato de data incorreto");
            return 0;
        }
    }
    
    //classe main
    /* String mensagem = JOptionPane.showInputDialog("Informe data no padrão dd/mm/aaaa");
        int dia = cap6.Ex3MetodosData.GetDia(mensagem);
        
        int mes = cap6.Ex3MetodosData.GetMes(mensagem);
        
        int ano = cap6.Ex3MetodosData.GetAno(mensagem);
        
        JOptionPane.showMessageDialog(null, "Dia: " +dia
        +"\nMês: " +mes
        +"\nAno: " +ano);*/
    
}
