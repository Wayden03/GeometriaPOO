package java.lang;
package geometría;

/**
 *
 * @author Isaac
 */
public class Rectangulo extends Figura implements Comparable<Rectangulo>{
    private double base;
    private double altura;
    private int lados=4;
    
    public Rectangulo(double pBase,double pAltura){
        base=pBase;
        altura=pAltura;
    }
    
    
    public double calcularArea(){
        return base*altura;
    }

    public int numLados() {
       return lados;
    }
    
    
    public int compareTo(Rectangulo rectPorComparar, Rectangulo ladosPorComparar){
        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();
        int ladosPorComparar=rectPorComparar.lados;
        int misLados=this.lados;
        if(miArea==areaPorComparar){
            if(misLados==ladosPorComparar){
                return 0;
            }
        }
        else if (miArea>areaPorComparar){
            return 1;
        }
        else{
            return -1;
        }
    }
}
