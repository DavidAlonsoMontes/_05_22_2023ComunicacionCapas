package com.hedima.capas.repositorio;

import com.hedima.capas.modelo.Paciente;

import java.util.List;

public interface IPacienteRepo {
    String obtenerUno(Paciente p);

    Paciente altaPaciente(Paciente p);

    List<Paciente> mostrarTodos();
}
