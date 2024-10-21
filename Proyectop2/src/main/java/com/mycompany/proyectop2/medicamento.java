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
}
