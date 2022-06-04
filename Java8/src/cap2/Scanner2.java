
package cap2;

import java.util.Scanner;

public class Scanner2 {
    
    private int lider, lanterna, partidas;
    
    public void Executa(){
        try{
            System.out.println("Informe a pontuação do time líder");
            Scanner sc = new Scanner(System.in);
            lider = sc.nextInt();


            System.out.println("Informe a pontuação do time lanterna");
            sc = new Scanner(System.in);
            lanterna = sc.nextInt();



            if(lanterna%3 == 0 && lider%3 == 0){
                if(lanterna < lider){
                    partidas = (lider - lanterna)/3;
                    System.out.println("O time lanterna precisa ganhar " +partidas+ " partidas para alcançar o time líder!");

                }else{
                    System.out.println("Pontuação do líder é menor que do lanterna! Informe a pontuação correta");

                }
            }else{
                System.out.println("Informe a pontuação correta dos times! Os números devem ser múltiplos de 3");
            }
        }catch(Exception ex){
            System.out.println("Informe valores válidos! " +ex);
            
        }
    }
    
    
}
