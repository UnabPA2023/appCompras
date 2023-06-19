package programacion_avanzada.tp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private Vendedor vendedor;
    private Cliente cliente;
    private LocalDate fechaCompra;
    private List<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public List<Producto> getProductos() {
        return productos;
    }


    public Iterable<? extends Producto> getProducto() {
        return productos;
    }
}





