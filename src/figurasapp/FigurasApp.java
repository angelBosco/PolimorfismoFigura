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
public class FigurasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura fig[]=new Figura[4];
        fig[0]=new Rectangulo(0,0, 5.0,2.0);
        fig[1]=new Circulo(0,0,3.0);
        fig[2]=new Cuadrado(0,0,8.0);
        fig[3]=new Circulo(0,0,9.0);
        Figura fMayor=figuraMayor(fig);
        System.out.println("El área mayor es: "+fMayor.area());
    }
    
    //determinar la figura que tiene el área mayor
   static Figura figuraMayor(Figura figuras[]){
        Figura mFigura=null;
        double areaMayor=0.0;
        for(int i=0; i<figuras.length; i++){
            if(figuras[i].area()>areaMayor){
                areaMayor=figuras[i].area();
                mFigura=figuras[i];
            }
        }
        return mFigura;
    }
}
    

