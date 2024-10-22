/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop2;
import java.util.List;
/**
 *
 * @author Alumno
 */
public class medicamento {

    private int id;
    private String nombre;
    private double precio;
    private int cantidad;
   

    public medicamento(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public static void main(String[] args) {
         Inventario inventario = new Inventario();
        Compra compra = new Compra();
        Venta venta = new Venta();

        // Agregar medicamentos al inventario
        medicamento medicamento1 = new medicamento(1, "Medicamento 1", 10.99, 5);
        medicamento medicamento2 = new medicamento(2, "Medicamento 2", 5.99, 10);
        inventario.agregarMedicamento(medicamento1);
        inventario.agregarMedicamento(medicamento2);

        // Realizar una compra
        compra.agregarMedicamento(medicamento1);
        compra.agregarMedicamento(medicamento2);

        // Agregar la compra a la venta
        venta.agregarCompra(compra);

        // Consultar el total de ventas
        double totalVentas = venta.calcularTotalVentas(); 
    }
}


    
        


