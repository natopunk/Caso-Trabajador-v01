package test;

import modelo.Trabajador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrabajadorTest {

    @Test
    public void testGetters() {
        Trabajador t = new Trabajador("Ana", "Silva", "11.222.333-4", "Banmédica", "Habitat");
        assertEquals("Ana", t.getNombre());
        assertEquals("Silva", t.getApellido());
        assertEquals("11.222.333-4", t.getRut());
        assertEquals("Banmédica", t.getIsapre());
        assertEquals("Habitat", t.getAfp());
    }
}

