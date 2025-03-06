import biblioteca.Biblioteca;
import biblioteca.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;

    biblioteca = new Biblioteca();


    // ¡¿CÓMO SE HACE ESTO?!

    @Test
    void eliminarLibro() {
        libro1 = new Libro("Libro");
        assertTrue(biblioteca.eliminarLibro("Libro"), "El libro debería eliminarse correctamente");
        assertFalse(biblioteca.eliminarLibro(libro1), "No se debería poder eliminar un libro que ya no está");
    }

    @Test
    void encuentraLibrosPorAutor() {

    }
}