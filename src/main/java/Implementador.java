import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivanm on 23/02/2017.
 */
public class Implementador {

    public List<Figura> figuraList = new ArrayList<Figura>();

    public void addFig(Figura f){
        figuraList.add(f);
    }

    public double sumAreas(){
        double res =0;
        for (Figura f : figuraList){
            System.out.println("Area de figura "+f.getClass().getName()+"es: "+f.area());
            res = res + f.area();
        }
        return res;
    }
}
