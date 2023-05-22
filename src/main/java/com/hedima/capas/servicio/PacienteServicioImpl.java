package com.hedima.capas.servicio;

import com.hedima.capas.modelo.Paciente;
import com.hedima.capas.repositorio.IPacienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacienteServicioImpl implements IPacienteServicio{
    @Autowired
    private IPacienteRepo repo;
    @Override
    public String obtenerUno(Paciente p1) {
        return repo.obtenerUno(p1);
    }
}
