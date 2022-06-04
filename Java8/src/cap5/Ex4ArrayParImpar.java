
package cap5;


public class Ex4ArrayParImpar {
    
    int[] par = new int[10];
    int[] impar = new int [10];
    int aux, i;
    public void Executa(){
        for(i=0; i<10; i++){
            aux = (int)(Math.random()*20)+1;
            if(aux%2==0){
                par[i] = aux;
            }else{
                impar[i] = aux;
            }
        }
            //System.out.println((int)(Math.random()*20)+1);
        for(i=0;i<10;i++){
            System.out.println("PAR: " +par[i]);
        }
        for(i=0;i<10;i++){
            System.out.println("IMPAR: " +impar[i]);
        }
            
        }
       
    
    
}
