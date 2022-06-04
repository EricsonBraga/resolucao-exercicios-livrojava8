/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap2;

/**
 *
 * @author Donald
 */
public class Scanner {
    
    public void Executa(){
        float valor, desconto, valorDesconto, valorProdutoDesconto;
       
        try{
            System.out.println("Qual o valor do produto?");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            valor = sc.nextFloat();
        
        
        
            System.out.println("Qual a porcentagem de desconto?");
            sc = new java.util.Scanner(System.in);
            desconto = sc.nextFloat();
        
        
            valorDesconto = valor * (desconto/100);
            System.out.println("Desconto de R$" +valorDesconto);

            valorProdutoDesconto = valor - valorDesconto;
            System.out.println("Valor final do produto: R$" +valorProdutoDesconto);
            
        }catch(Exception ex){
            System.out.println("Informe valores válidos! " +ex);
            System.exit(0);
        }
    }
}
