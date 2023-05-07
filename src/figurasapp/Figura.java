/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasapp;

/**
 *
 * @author Angel
 */
public abstract class Figura {
    public final double MIPI=3.14;
    protected int x;
    protected int y;
    /**
     * Contructor sin parámetros para permitir que existan contructores
     * en las clases derivadas que no invoquen a super.
     * Las figuras sin coordenadas se crean en la coordenada (0,0)
     */
    public Figura(){
        x=0;
        y=0;
    }
    public Figura(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public abstract double area();
}

class Circulo extends Figura{
    protected double radio;
    /**
     * Constructor de Circulo con radio. No tiene coordenada,
     * por lo que no llamará a super con la coordenada.
     * Al no llamar a super, necesita un constructor en la clase
     * base sin parámetros. En caso contrario, error
     * @param radio 
     */
    public Circulo(double radio){
        this.radio=radio;
    }
    public Circulo(int x, int y, double radio){
        super(x,y);
        this.radio=radio;
    }
    /**
     * Calcula el área del círculo con ese radio y con
     * el valor de PI guardado en la constante MIPI.
     * Esta función no se puede redefinir en clases hijas
     * @return área del círculo con ese radio
     */
    public final double area(){
        return MIPI*radio*radio;
    }
}

class Rectangulo extends Figura{
    protected double ancho, alto;
    public Rectangulo(int x, int y, double ancho, double alto){
        super(x,y);
        this.ancho=ancho;
        this.alto=alto;
    }
    public double area(){
        return ancho*alto;
    }
}
/**
 * Clase cuadrado extiende de Rectángulo y no se permite herencia
 * a partir de ella
 * @author Angel
 */
final class Cuadrado extends Rectangulo{
    public Cuadrado(int x, int y, double dimension){
        super(x, y, dimension, dimension);
    }
}

class Triangulo extends Figura{
    protected double base, altura;
    public Triangulo(int x, int y, double base, double altura){
        super(x, y);
        this.base=base;
        this.altura=altura;
    }
    public double area(){
        return base*altura/2;
    }
}

