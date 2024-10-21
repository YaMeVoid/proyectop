/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Proyectop2;
import java.util.*;

/**
 *
 * @author Alumno
 */
public class Proyecto {

class Medicamento {
    private String claveMedicamento;
    private String nombre;
    private String descripcion;
    private double precio;

    public Medicamento(String claveMedicamento, String nombre, String descripcion, double precio) {
        this.claveMedicamento = claveMedicamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getClaveMedicamento() {
        return claveMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String obtenerDetalles() {
        return "Clave: " + claveMedicamento + ", Nombre: " + nombre + ", Descripción: " + descripcion + ", Precio: " + precio;
    }
}
class Compra {
    private long claveCompra;
    private String fecha;
    private List<Medicamento> medicamentos;
    private double total;

    public Compra(long claveCompra, String fecha) {
        this.claveCompra = claveCompra;
        this.fecha = fecha;
        this.medicamentos = new ArrayList<>();
        this.total = 0.0;
    }

    public long getClaveCompra() {
        return claveCompra;
    }

    public String getFecha() {
        return fecha;
    }

    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
        total += medicamento.getPrecio(); // Asumiendo que el precio es por unidad
    }

    public double calcularTotal() {
        return total;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}
class Inventario {
    private long claveInventario;
    private String tipoEntradaSalida; // "entrada" o "salida"
    private int stock;
    private double precioUnidad;
    private String fechaMovimiento;
    private List<Medicamento> medicamentos;

    public Inventario(long claveInventario, String tipoEntradaSalida, int stock, double precioUnidad, String fechaMovimiento) {
        this.claveInventario = claveInventario;
        this.tipoEntradaSalida = tipoEntradaSalida;
        this.stock = stock;
        this.precioUnidad = precioUnidad;
        this.fechaMovimiento = fechaMovimiento;
        this.medicamentos = new ArrayList<>();
    }

    public long getClaveInventario() {
        return claveInventario;
    }

    public String getTipoEntradaSalida() {
        return tipoEntradaSalida;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
        // Aquí podrías actualizar el stock o realizar otras operaciones
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }
}
class Venta {
    private long claveVenta;
    private String fechaVenta;
    private String metodoPago;

    public Venta(long claveVenta, String fechaVenta, String metodoPago) {
        this.claveVenta = claveVenta;
        this.fechaVenta = fechaVenta;
        this.metodoPago = metodoPago;
    }

    public long getClaveVenta() {
        return claveVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void realizarVenta(Compra compra) {
        // Aquí se implementaría la lógica para registrar la venta y actualizar el inventario
        System.out.println("Venta registrada: " + claveVenta + ", Fecha: " + fechaVenta + ", Método de pago: " + metodoPago);
        System.out.println("Medicamentos vendidos:");
        for (Medicamento medicamento : compra.getMedicamentos()) {
            System.out.println(medicamento.obtenerDetalles());
        }
        System.out.println("Total de la venta: $" + compra.calcularTotal());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear un inventario
        Inventario inventario = new Inventario(1, "entrada", 0, 0.0, "2023-10-01");
        
        // Agregar algunos medicamentos al inventario
        Medicamento medicamento1 = new Medicamento("MED001", "Paracetamol", "Antipirético y analgésico", 10.50);
        Medicamento medicamento2 = new Medicamento("MED002", "Ibuprofeno", "Antiinflamatorio", 15.75);
        
        inventario.agregarMedicamento(medicamento1);
        inventario.agregarMedicamento(medicamento2);
        
        // Mostrar medicamentos en el inventario
        System.out.println("Medicamentos en el inventario:");
        for (Medicamento m : inventario.getMedicamentos()) {
            System.out.println(m.obtenerDetalles());
        }
        
        // Crear una compra
        System.out.print("\nIngrese la clave de la compra: ");
        long claveCompra = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese la fecha de la compra (YYYY-MM-DD): ");
        String fechaCompra = scanner.nextLine();
        
        Compra compra = new Compra(claveCompra, fechaCompra);
        
        // Simular agregar medicamentos a la compra
        System.out.println("\nAgregando medicamentos a la compra...");
        compra.agregarMedicamento(medicamento1);
        compra.agregarMedicamento(medicamento2);
        
        // Calcular total de la compra
        double totalCompra = compra.calcularTotal();
        System.out.println("Total de la compra: $" + totalCompra);
        
        // Realizar una venta
        System.out.print("Ingrese la clave de la venta: ");
        long claveVenta = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Ingrese la fecha de la venta (YYYY-MM-DD): ");
        String fechaVenta = scanner.nextLine();
        System.out.print("Ingrese el método de pago (efectivo/tarjeta): ");
        String metodoPago = scanner.nextLine();
        
        Venta venta = new Venta(claveVenta, fechaVenta, metodoPago);
        venta.realizarVenta(compra);
        
        // Cerrar el scanner
        scanner.close();
    }
}
}