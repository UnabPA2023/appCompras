package programacion_avanzada.tp;

public class Vendedor extends Persona {
    private String Legajo;

    public Vendedor(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni);
        Legajo = legajo;
    }

    public String getLegajo() {
        return Legajo;
    }

    public void setLegajo(String legajo) {
        Legajo = legajo;
    }
}


