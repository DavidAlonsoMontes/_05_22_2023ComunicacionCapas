package com.hedima.capas.servicio;

import com.hedima.capas.modelo.Paciente;
import com.hedima.capas.repositorio.IPacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicioImpl implements IPacienteServicio{
    @Autowired
    private IPacienteRepo repo;
    @Override
    public String obtenerUno(Paciente p1) {
        return repo.obtenerUno(p1);
    }

    @Override
    public Paciente altaPaciente(Paciente p) {
//        Paciente p2 = repo.altaPaciente(p);
        return repo.altaPaciente(p);
    }

    @Override
    public List<Paciente> mostrarTodos() {
        return repo.mostrarTodos();
    }

    @Override
    public Paciente mostrarUno(int idPaciente) {
        return repo.mostrarUno(idPaciente);
    }
}
