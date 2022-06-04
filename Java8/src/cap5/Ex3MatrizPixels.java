
package cap5;

public class Ex3MatrizPixels {
    
    int[][] matriz = new int [40][40];
    
    public void Executa(){
        for(int linha=0; linha<matriz.length; linha++){
            for(int coluna=0; coluna<matriz[linha].length; coluna++){
                matriz[linha][coluna]= (int)(Math.random()*255);
                System.out.println("["+linha+","+coluna+"]= "+matriz[linha][coluna]);
            }
        }
        
    }
    
    
}
