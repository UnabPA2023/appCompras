package programacion_avanzada.tp;

import java.time.LocalDate;


public class Carrito {
    private Vendedor vendedor;
    private Cliente cliente;
    private LocalDate fechaCompra;
    private Producto producto[] = new Producto[10];
    public Vendedor vendedor(){return vendedor;}

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente cliente() {return cliente;}

    public Cliente getCliente() {return cliente;}

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }
}





