
package cap7;

import javax.swing.JOptionPane;
public class Ex4Brinquedo {
    
    private String nome, faixaEtaria;
    private float preco;
    
    public Ex4Brinquedo(){
        
    }
    
    public Ex4Brinquedo(String nome){
        this.nome= nome;
    }
    
    public Ex4Brinquedo(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Nome: " +this.nome+
                                            "\nPreço: " +this.preco+
                                            "\nFaixa Etária: " +this.faixaEtaria);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {        
        if("0 a 2".equals(faixaEtaria) || "3 a 5".equals(faixaEtaria) || "6 a 10".equals(faixaEtaria) || "acima de 10".equals(faixaEtaria)){
            this.faixaEtaria = faixaEtaria;
        }else{
            JOptionPane.showMessageDialog(null, "Valores inválidos!");
            System.exit(0);
        }
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
