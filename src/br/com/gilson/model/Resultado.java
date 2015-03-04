package br.com.gilson.model;

/**
 * Representa as raízes de uma equação de segundo grau
 * @author Gilson da Silva
 * @version 1.0
 * @see Functions
 */
public class Resultado {

    private double x1, x2;

    public Resultado(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public String getX1() {
        return String.valueOf(x1);
    }

    public String getX2() {
        return String.valueOf(x2);
    }
    
    

}