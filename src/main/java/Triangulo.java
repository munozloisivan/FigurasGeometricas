/**
 * Created by ivanm on 23/02/2017.
 */
public class Triangulo extends FiguraBasica {

    double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base*altura)/2;
    }

}
