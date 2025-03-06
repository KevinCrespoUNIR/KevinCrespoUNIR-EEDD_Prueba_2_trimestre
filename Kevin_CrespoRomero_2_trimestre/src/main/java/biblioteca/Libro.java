package biblioteca;

/**
 * <p>Esta clase contiene el constructor y los métodos necesarios {@link Libro}
 * para realizar los métodos de la clase Biblioteca </p>
 *
 * @author Kevin Crespo Romero
 * @see Biblioteca
 * <a href="https://github.com/KevinCrespoUNIR/KevinCrespoUNIR-EEDD_Prueba_2_trimestre.git">Mi Repositorio</a>
 */

public class Libro {

    /**
     * <p>Declaración de las siguientes variables: titulo, autor, anioPublicacion </p>
     *  @param titulo Parámetro que almacena el título del libro
     *  @param autor Parámetro que almacena el nombre del autor
     *  @param anioPublicacion Parámetro que almacena el año de publicación del libro
     *
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;



    // TODO: Testear este método
    /**
     * @param titulo Parámetro que almacena el título del libro
     */
    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     *
     * @return Devuelve el título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * <p> get que devuelve el nombre del autor del libro</p>
     * @return Devuelve el autor
     * @see Libro
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * <p> get que devuelve el año de publicación del libro</p>
     * @return Devuelve eñ año de publicación
     * @see Libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
