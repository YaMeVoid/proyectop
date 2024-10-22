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
public class Venta {
      private List<Compra> compras;

    public Venta() {
        this.compras = new ArrayList<>();
    }

    public void agregarCompra(Compra compra) {
        this.compras.add(compra);
    }

    public double calcularTotalVentas() {
        double total = 0;
        for (Compra compra : this.compras) {
            total += compra.calcularTotal();
        }
        return total;
    } 
}
