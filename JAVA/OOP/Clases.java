public class Clases {
    public static void main(String[] args) {
        Perro perro = new Perro("Tobi");

        System.out.println(perro.getNombre());
    }
}

class Mascota {
    public String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return "El nombre de la mascota es " + this.nombre;
    }
}

class Perro extends Mascota {
    public Perro(String paramNombre) {
        this.setNombre(paramNombre);
    }
}