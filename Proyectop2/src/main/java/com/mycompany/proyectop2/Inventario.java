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
public class Inventario {
    private List<medicamento> medicamentos;

    public Inventario() {
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    public void eliminarMedicamento(int id) {
        this.medicamentos.removeIf(med -> med.getId() == id);
    }

    public void modificarMedicamento(int id, medicamento nuevoMedicamento) {
        for (int i = 0; i < this.medicamentos.size(); i++) {
            if (this.medicamentos.get(i).getId() == id) {
                this.medicamentos.set(i, nuevoMedicamento);
                break;
            }
        }
    }

    public List<medicamento> consultarMedicamentos() {
        return this.medicamentos;
    }
}
