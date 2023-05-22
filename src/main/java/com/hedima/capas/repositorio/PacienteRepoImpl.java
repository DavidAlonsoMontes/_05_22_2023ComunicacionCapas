package com.hedima.capas.repositorio;

import com.hedima.capas.modelo.Paciente;
import org.springframework.stereotype.Component;

@Component
public class PacienteRepoImpl implements IPacienteRepo{
    @Override
    public String obtenerUno(Paciente p) {
        return p.toString();
    }
}
