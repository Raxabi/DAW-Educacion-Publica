package Ejercicio1Clases;

/**
 * La clase semaforo construye un nuevo semaforo con disintitas propiedades
 */
public class Semaforo {
    /**
     * Contiene el color actual del semaforo
     */
    private String colorSemaforo = "Rojo";

    /**
     * contruye un semaforo a partir de un color inicial
     * @param colorInicial
     */
    public Semaforo(String colorInicial) {
        this.colorSemaforo = colorInicial;
    }

    /**
     * Actualiza el color del semaforo
     * @param nuevoColor El color al que sera cambiada la propiedad {@code setColor}
     */
    public void setColor(String nuevoColor) {
        this.colorSemaforo = nuevoColor;
    }

    /**
     * Obtiene el color del semaforo
     * @return El color actual del semafoto
     */
    public String getColor() {
        return this.colorSemaforo;
    }

    /**
     * Comprueba si puedes pasar segun el color del semaforo
     * @return Verdadero si puedes pasar o falso si no puedes pasar
     */
    public boolean puedoPasar() {
        if (this.colorSemaforo == "Rojo") {
            return false;
        }

        else if (this.colorSemaforo == "Amarillo") {
            return true;
        }

        else if (this.colorSemaforo == "Verde") {
            return true;
        }

        return false;
    }
}