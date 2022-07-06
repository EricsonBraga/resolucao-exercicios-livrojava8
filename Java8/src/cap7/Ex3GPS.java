
package cap7;

import javax.swing.JOptionPane;
public class Ex3GPS {
    
    private String idioma, rota;
    
    public Ex3GPS(){
        
    }    
    
    public Ex3GPS(String idioma, String rota){
        this.idioma = idioma;
        this.rota = rota;       
    }
    
    public void DefinirIdioma(){
        String aux = JOptionPane.showInputDialog("Selecione um idioma: "
                + "\n1 - Português"
                + "\n2 - Inglês"
                + "\n3 - Espanhol"
                + "\n4 - Francês"
                + "\n5 - Alemão");
        int opcao = Integer.parseInt(aux);
        
        switch(opcao){
            case 1:
                this.idioma = "Português";
                JOptionPane.showMessageDialog(null, "Português selecionado!");
                break;
            case 2:
                this.idioma = "Inglês";
                JOptionPane.showMessageDialog(null, "Inglês selecionado!");
                break;
            case 3:                   
                this.idioma = "Espanhol";
                JOptionPane.showMessageDialog(null, "Espanhol selecionado!");
                break;
            case 4:
                this.idioma = "Francês";
                JOptionPane.showMessageDialog(null, "Francês selecionado!");
                break;
            case 5:
                this.idioma = "Alemão";
                JOptionPane.showMessageDialog(null, "Alemão selecionado!");
                break;
                
        }
        
    }
    
    public void DefinirRota(){
        String aux2 = JOptionPane.showInputDialog("Escolha uma rota:");
        this.rota = aux2;   
        
    }
    
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Idioma: " +this.idioma
                                            +"\nRota: " +this.rota);     
        
    }
}
