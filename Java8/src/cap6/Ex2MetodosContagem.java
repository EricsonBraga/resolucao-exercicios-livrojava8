package cap6;

import static java.lang.Thread.sleep;


public class Ex2MetodosContagem {
    
    public static void Contar(){
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
    
    public static void Contar(int fim){
        for(int i=1; i<=fim; i++){
            System.out.println(i);
        }
    }
    
    public static void Contar(int inicio, int fim){
        for(int i = inicio; i<= fim; i++){
            System.out.println(i);
        }
    }
    
    public static void Contar(int inicio, int fim, int pausa) throws InterruptedException{
        for(int i = inicio; i<= fim; i++){
            System.out.println(i);
            Thread.sleep(pausa*1000);
        }
    }
}
