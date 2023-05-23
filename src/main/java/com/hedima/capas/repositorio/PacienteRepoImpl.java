package com.hedima.capas.repositorio;

import com.hedima.capas.modelo.Paciente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PacienteRepoImpl implements IPacienteRepo{

    List<Paciente> pacientes = new ArrayList<>();
    @Override
    public String obtenerUno(Paciente p) {
        return p.toString();
    }

    @Override
    public Paciente altaPaciente(Paciente p) {
        pacientes.add(p);
        return p;
    }

    @Override
    public List<Paciente> mostrarTodos() {
        return pacientes;
    }

    @Override
    public Paciente mostrarUno(int idPaciente) {
        return null;
    }
}
