package programacion_avanzada.tp;

import programacion_avanzada.tp.*;
import java.time.LocalDate;
import java.util.Scanner;


public class FacturacionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener datos del vendedor
        System.out.print("Ingrese nombre del vendedor: ");
        String nombreVendedor = scanner.nextLine();
        System.out.print("Ingrese apellido del vendedor: ");
        String apellidoVendedor = scanner.nextLine();
        System.out.print("Ingrese DNI del vendedor: ");
        String dniVendedor = scanner.nextLine();
        System.out.print("Ingrese legajo del vendedor: ");
        String legajoVendedor = scanner.nextLine();
        Vendedor vendedor = new Vendedor(nombreVendedor, apellidoVendedor, dniVendedor, legajoVendedor);

        // Obtener datos del cliente
        System.out.print("Ingrese nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese apellido del cliente: ");
        String apellidoCliente = scanner.nextLine();
        System.out.print("Ingrese DNI del cliente: ");
        String dniCliente = scanner.nextLine();
        System.out.print("Ingrese número de cliente: ");
        int numCliente = Integer.parseInt(scanner.nextLine());
        Cliente cliente = new Cliente(nombreCliente, apellidoCliente, dniCliente, numCliente);

        // Crear el carrito
        Carrito carrito = new Carrito();
        carrito.setVendedor(vendedor);
        carrito.setCliente(cliente);
        carrito.setFechaCompra(LocalDate.now());

        // Agregar productos
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese los datos del producto " + (i + 1) + ":");
            System.out.print("Nombre del producto: ");
            String nombreProducto = scanner.nextLine();
            System.out.print("Descripción del producto: ");
            String descripcionProducto = scanner.nextLine();
            System.out.print("Precio del producto: ");
            double precioProducto = Double.parseDouble(scanner.nextLine());
            Producto producto = new Producto(nombreProducto);
            producto.setDescripcion(descripcionProducto);
            producto.setPrecio(precioProducto);
            carrito.getProductos().add(producto);
        }

        // Calcular total de la venta
        double totalVenta = 0;
        for (Producto producto : carrito.getProducto()) {
            totalVenta += producto.getPrecio();
        }

// Mostrar menú de medios de pago
        System.out.println("=== MEDIOS DE PAGO ===");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de débito");
        System.out.println("3. Transferencia bancaria");
        System.out.println("4. Tarjeta de crédito");

        System.out.print("Seleccione el medio de pago: ");
        int opcionPago = Integer.parseInt(scanner.nextLine());

        double totalConDescuento = totalVenta;

        switch (opcionPago) {
            case 1:
                // Efectivo
                totalConDescuento -= totalVenta * 0.1; // Aplicar descuento del 10%
                break;
            case 4:
                // Tarjeta de crédito
                System.out.println("=== PLANES DE PAGO ===");
                System.out.println("1. 1 Pago (sin recargo)");
                System.out.println("2. 3 Pagos (recargo del 10%)");
                System.out.println("3. 6 Pagos (recargo del 25%)");
                System.out.println("4. 12 Pagos (recargo del 50%)");

                System.out.print("Seleccione el plan de pago: ");
                int opcionPlanPago = Integer.parseInt(scanner.nextLine());

                switch (opcionPlanPago) {
                    case 2:
                        // 3 Pagos (recargo del 10%)
                        totalVenta += totalVenta * 0.1; // Recargo del 10%
                        break;
                    case 3:
                        // 6 Pagos (recargo del 25%)
                        totalVenta += totalVenta * 0.25; // Recargo del 25%
                        break;
                    case 4:
                        // 12 Pagos (recargo del 50%)
                        totalVenta += totalVenta * 0.5; // Recargo del 50%
                        break;
                }
                break;
        }

        // Imprimir factura
        System.out.println("======== FACTURA ========");
        System.out.println("Fecha de compra: " + carrito.getFechaCompra());
        System.out.println("Vendedor: " + vendedor.getNombre() + " " + vendedor.getApellido());
        System.out.println("Cliente: " + cliente.getNombre() + " " + cliente.getApellido());
        System.out.println("Productos:");
        for (Producto producto : carrito.getProducto()) {
            System.out.println("  - " + producto.getNombre() + " - $" + producto.getPrecio());
        }
        System.out.println("Total de la venta: $" + totalVenta);

        scanner.close();
    }
}
