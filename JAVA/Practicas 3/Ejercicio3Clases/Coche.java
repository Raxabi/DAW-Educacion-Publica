package Ejercicio3Clases;

/**
 * Construye un objeto coche a partir de su misma clase
 */
public class Coche {
    private String modelo;
    private String fabricante;
    private float precioSinIva;
    public byte porcentajeIva;

    /**
     * Constructor del coche predeterminado, sin ningun parametro
     */
    public Coche() {}

    /**
     * Segundo constructor que admite pasar valores iniciales a las propiedades de coche
     * @param modelo Inica el modelo del coche a crear
     * @param fabricante Indica el fabricante del coche
     * @param precioSinIva Indica el precio sin iva del coche
     * @param porcentajeIva Indica el porcetanje del IVA del coche
     */
    public Coche(String modelo, String fabricante, float precioSinIva, byte porcentajeIva) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.precioSinIva = precioSinIva;
        this.porcentajeIva = porcentajeIva;
    }

    /**
     * Tercer y ultimo constructor posible de la clase coche
     * @param modelo Indica el modelo del coche a crear
     * @param fabricante Indica el fabricante del coche
     * @param precio Indica el precio inicial del coche (Sin IVA)
     */
    public Coche(String modelo, String fabricante, float precio) {
        this();
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.precioSinIva = precio;
    }

    /**
     * Calcula el precio con iva del coche
     */
   /*  private float precioReal() {
        return 0f;
    } */

    /**
     * @param porcentaje - Actualiza el precio a partir de un paramatro (simulando el porcentaje)
     */
    public void actualizarPrecio(byte porcentaje) {
        this.porcentajeIva = porcentaje;
        this.precioSinIva = this.precioSinIva + ((this.porcentajeIva * 100) / this.precioSinIva);
    }

    /**
     * Muestra informacion sobre el coche como el {@code modelo} y el {@code precioSinIva}
     */
    @Override
    public String toString() {
        return "";
    }

    public void consulta() {

    }

    /* @Override
    public boolean equals(Object paramterComparation) {
        if (paramterComparation == this) {
            return true;
        } else if (!(paramterComparation instanceof Coche)) {
            return false;
        }
        Coche comparer = (Coche) paramterComparation;

        return if(comparer) {
            
        }
    } */

}
