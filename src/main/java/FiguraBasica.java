/**
 * Created by ivanm on 24/02/2017.
 */

//Esta clase

public abstract class FiguraBasica implements Figura, Comparable<Figura>{
    public int compareTo(Figura o) {
        int resultado = 0;
        if (this.area()<o.area()){resultado=-1;}
        else if (this.area()>o.area()){resultado=1;}
        else {resultado=0;}
        return resultado;
    }
}
