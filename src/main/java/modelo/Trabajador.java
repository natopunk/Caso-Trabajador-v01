package modelo;

public class Trabajador extends Persona {
    private String isapre;
    private String afp;

    public Trabajador(String nombre, String apellido, String rut, String isapre, String afp) {
        super(nombre, apellido, rut);
        this.isapre = isapre;
        this.afp = afp;
    }

    public String getIsapre() { return isapre; }
    public String getAfp() { return afp; }

    public void setIsapre(String isapre) { this.isapre = isapre; }
    public void setAfp(String afp) { this.afp = afp; }
}
