package Ejercicio2Clases;

/**
 * InnerLibro Describe como seran los objectos creados a partir de la clase Libro
 */
interface InnerLibro {

    String autor = "";
    String titulo = "";
    Boolean estado = true | false;

    void setAutor(String autor);

    String getAutor();

    void setTitulo(String titulo);

    String getTitulo();

    void setEstado(Boolean estado);

    boolean getEstado();
}

public class Libro implements InnerLibro {
    
    /**
     * Nombre del autor del libro
     */
    private String autor;

    /**
     * Nombre del libro
     */
    private String titulo;

    /**
     * Estado del libro
     */
    private boolean estado;

    /**
     * Constructor de la clase libro
     * @param autor Usado para actualizar el valor de la propiedad libro
     * @param titulo Usado para actualizar el valor de la propiedad titulo
     * @param estado Usado para actualizar el valor de la propiedad estado
     */
    public Libro(String autor, String titulo, Boolean estado) {
        this.autor = autor;
        this.titulo = titulo;
        this.estado = estado;
    }


    // Getters and Setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return this.estado;
    }
}
