/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller01;

/**
 *
 * @author jramirezg
 */
public class Punto {
    
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double radioPolar(){
            
        
        double distancia = Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(),2));
        return distancia;
    }
   
    public double anguloPolar(){
        double angulo = Math.atan(getY()/getX());
        return angulo;
    }
    
    public double distanciaEuclidiana(Punto p){
        double distanciaE = Math.sqrt(Math.pow(p.getX()-getX(),2)+Math.pow(p.getY()-getY(),2));
        return distanciaE;
    }
    
}
