package launcher;

import modelo.Trabajador;
import vista.VentanaCLI;

public class Principal {
    public static void main(String[] args) {
        Trabajador trabajador = new Trabajador("Nicolás", "Rojas", "20.123.456-7", "Colmena", "Cuprum");

        VentanaCLI vista = new VentanaCLI();
        vista.mostrarTrabajador(trabajador);
    }
}

