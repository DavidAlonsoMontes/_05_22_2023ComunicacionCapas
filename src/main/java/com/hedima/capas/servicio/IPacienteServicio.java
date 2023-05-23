package com.hedima.capas.servicio;

import com.hedima.capas.modelo.Paciente;

import java.util.List;

public interface IPacienteServicio {
    String obtenerUno(Paciente p1);
    Paciente altaPaciente(Paciente p);

    List<Paciente> mostrarTodos();

    Paciente mostrarUno(int idPaciente);
}
