import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Main {


    public static void main(String[] args) {

        Implementador implem = new Implementador();

        //BasicConfigurator.configure();                      //Estructura Logger
      //  final Logger logger = Logger.getLogger("main");

        Figura fr = new Rectangulo(10,20);
        Figura fc = new Circulo(5);
        Figura ft = new Triangulo(3,5);
        Figura fcu = new Cuadrado(4);

        implem.addFig(fr);
        implem.addFig(fc);
        implem.addFig(ft);
        implem.addFig(fcu);

        double resultado = implem.sumAreas();
        System.out.println("La suma de areas de las figuras es:" +resultado);


    }
}
