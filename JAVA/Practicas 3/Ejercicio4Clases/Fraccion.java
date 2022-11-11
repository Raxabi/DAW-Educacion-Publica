package Ejercicio4Clases;

public class Fraccion {
    float numerador;
    float denominador;
    int signo;
    
    /**
     * Constructor de la clase fraccion
     * 
     * Crea una nueva fraccion a partir de:
     * @param numerador - Numerador de la fraccion
     * @param denominador - Denominador de la fraccion
     */
    public Fraccion(float numerador, float denominador, int signo) {
        this.numerador = numerador;
        this.denominador = denominador;
        this.signo = signo;
    }

    public float getNumerador() {
        return numerador;
    }

    public float getDenominador() {
        return denominador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(float denominador) {
        this.denominador = denominador;
    }
}
