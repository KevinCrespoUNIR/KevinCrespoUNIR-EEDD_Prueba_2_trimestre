package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    /**
     * <p>Crea una lista de libros </p>
     */
    private final List<Libro> libros;

    /**
     * <p> Define el constructor de la clase Biblioteca</p>
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Define parámertros para la clase biblioteca
     * @param libros
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    //  Test: Comprobar si se ha agregado
    /**
     * @param libro
     * @return Devuelve los libros almacenados en la lista de libros
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    /**
     *
     * @param libro
     * @return Elimina un libro de la lista
     */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * @return Devuelve todos los libros de la lista
     */
    public List<Libro> getLibros() {
        return libros;
    }


    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /**
     *
     * @param titulo
     * @return Devuelve el título del libro que se ha
     * introducido por parámetro
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated
     * <p>Este se encuentra obsoleto, {@link List<Libro> encuentraLibrosporAutor}</p>
     * @param autor Parámetro que contiene el autor
     * @return Devuelve el autor del libro
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }


    //  TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * <p> Este método. encuentra libros según su autor</p>
     * @param autor contiene el autor del libro
     * @return Devuelve el autor del libro
     * @version 2.0
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
