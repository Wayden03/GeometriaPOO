package geometría;
import java.util.Arrays;
/**
 *
 * @author Isaac
 */
public class Geometría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo[] rects = new Rectangulo[4];
        
        rects[0]=new Rectangulo(2.5,3.0);
        rects[1]=new Rectangulo(1.7,2.2);
        rects[2]=new Rectangulo(2.8,3.1);
        rects[3]=new Rectangulo(3.5,1.2);
        Arrays.sort(rects);
    }
    
}
