/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectop2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Compra {
    private long claveCompra;
    private String fecha;
    private List<medicamento> medicamentos;
    private double total;
    private double precio;
        
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
    public double getPrecio() {
        return precio;
    }
    
    public void agregarMedicamento(medicamento medicamento) {
        medicamentos.add(medicamento);
        total += getPrecio(); 
    }

    public double calcularTotal() {
        return total;
    }

    public List<medicamento> getMedicamentos() {
        return medicamentos;
    }
}

