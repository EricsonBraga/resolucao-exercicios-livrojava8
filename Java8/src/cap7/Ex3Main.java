
package cap7;

public class Ex3Main {

   
    public static void main(String[] args) {
        
        Ex3GPS gps = new Ex3GPS();
        gps.Mostrar();
        Ex3GPS gps2 = new Ex3GPS("Português", "Casa");
        gps2.Mostrar();
        
        gps.DefinirIdioma();
        gps.DefinirRota();
        gps.Mostrar();
    }
    
}
