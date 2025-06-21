package vista;

import modelo.Trabajador;

public class VentanaCLI {
    public void mostrarTrabajador(Trabajador t) {
        System.out.println("----- Datos del trabajador -----");
        System.out.println("Nombre: " + t.getNombre() + " " + t.getApellido());
        System.out.println("RUT: " + t.getRut());
        System.out.println("Isapre: " + t.getIsapre());
        System.out.println("AFP: " + t.getAfp());
    }
}
