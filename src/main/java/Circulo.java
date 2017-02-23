/**
 * Created by ivanm on 23/02/2017.
 */
public class Circulo implements Figura {

    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return(Math.PI * Math.pow(radio,2));
    }
}
