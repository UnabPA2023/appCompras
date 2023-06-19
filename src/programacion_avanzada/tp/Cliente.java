package programacion_avanzada.tp;

public class Cliente extends Persona {
    private int numCliente;

    public Cliente(String nombre, String apellido, String dni, int numCliente) {
        super(nombre, apellido, dni);
        this.numCliente = numCliente;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }
}
