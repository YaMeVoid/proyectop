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
    private List<medicamento> medicamentosComprados;

    public Compra() {
        this.medicamentosComprados = new ArrayList<>();
    }

    public void agregarMedicamento(medicamento medicamento) {
        this.medicamentosComprados.add(medicamento);
    }

    public double calcularTotal() {
        double total = 0;
        for (medicamento medicamento : this.medicamentosComprados) {
            
        }
        return total;
    }
}

