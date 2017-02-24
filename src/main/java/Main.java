import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Main {


    public static void main(String[] args) {

        Implementador implem = new Implementador();

        BasicConfigurator.configure();                      //Estructura Logger
        final Logger logger = Logger.getLogger("main");
        final Logger logList = Logger.getLogger("Orden figuras");


        Figura fr = new Rectangulo(10,20);     //optimizarlo
        Figura fc = new Circulo(5);
        Figura ft = new Triangulo(3,5);
        Figura fcu = new Cuadrado(4);

        implem.addFig(fr);
        implem.addFig(fc);
        implem.addFig(ft);
        implem.addFig(fcu);

        double resultado = implem.sumAreas();
        logger.info("La suma de areas de las figuras es:" +resultado+"\n");

        logList.info("Figuras ordenadas por area");
        implem.listSorted();
        for (int i=0; i< implem.figuraList.size(); i++){
            System.out.println("Figura "+(i+1)+" : "+implem.figuraList.get(i).getClass().getSimpleName()+" --> Area: "+implem.figuraList.get(i).area());
        }
    }
}
