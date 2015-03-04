package br.com.gilson.model;

/**
 *
 * @author Gilson da Silva
 * @version 1.0
 */
public class Functions {

    public static double teste() {
        return 12.133;
    }

    public static Resultado bhaskara(int a, int b, int c) {
        if (a == 0) {
            return null;
        }

        double delta, raizDelta, x1, x2;
        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            return null;
        }

        raizDelta = Math.sqrt(delta);
                
        x1 = (-b + raizDelta) / (2 * a);
        if (delta < 0) {
            x2 = x1;
        } else {
            x2 = (- b - raizDelta) / (2 * a);
        }
        return new Resultado(x1, x2);
    }

}

