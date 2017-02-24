import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ivanm on 23/02/2017.
 */
public class Implementador {

    final Logger logImpl = Logger.getLogger("Implementador");

    public List<Figura> figuraList = new ArrayList<Figura>();

    public void addFig(Figura f){
        try{figuraList.add(f);}
        catch (Exception e){
            logImpl.error(e.getMessage()+"\n");
        }
    }

    public double sumAreas(){
        double res =0;
        try {
            for (Figura f : figuraList) {
                logImpl.info("Area " + f.getClass().getName() + " es: " + f.area() + "\n");
                res = res + f.area();
            }
        }
        catch (Exception e) {
            logImpl.error(e.getMessage() + "\n");
        }
        return res;
    }

    public List<Figura> listSorted () {
        Collections.sort(figuraList,Collections.<Figura>reverseOrder());
        return figuraList;
    }

    }
