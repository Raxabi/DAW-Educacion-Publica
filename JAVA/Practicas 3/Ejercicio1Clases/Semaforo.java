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
        if (this.colorSemaforo.equals("Rojo")) {
            return false;
        }

        else if (this.colorSemaforo.equals("Amarillo")) {
            return false;
        }

        else {
            return true;
        }
    }

    @Override
    /**
     * Redefinicion del metodo toString para esta clase
     */
    public String toString() {

        String cadena = "";

        switch (this.colorSemaforo) {
            case "Rojo" -> {
                cadena = "Verde puede no pasar";
            }
            case "Amarillo" -> {
                cadena = "Amarillo no puede pasar";
            }
            case "Verde" -> {
                cadena = "Puede pasar";
            }
        }
        return cadena;
    }
}