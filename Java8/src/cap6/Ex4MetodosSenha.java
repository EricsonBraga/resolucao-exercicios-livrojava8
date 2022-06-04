
package cap6;

public class Ex4MetodosSenha {
    static String senha="";
    public static int GerarSenha(){
        for(int i=0; i<8; i++){
            int aux = (int)(Math.random()*9);
            senha+= aux;
        }
        int se = Integer.parseInt(senha);
        return se;
    }
    
     /* public static void main(String[] args){
                
       JOptionPane.showMessageDialog(null, "Senha Gerada: " +cap6.Ex4MetodosSenha.GerarSenha());
        
        
     
    }
    
}*/
    
}
