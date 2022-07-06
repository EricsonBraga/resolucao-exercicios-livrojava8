
package cap7;


public class Ex2UsaBomba {

    public static void main(String[] args) {
        
        Ex1Bomba bomba = new Ex1Bomba();
        try{
            bomba.Ligar();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
