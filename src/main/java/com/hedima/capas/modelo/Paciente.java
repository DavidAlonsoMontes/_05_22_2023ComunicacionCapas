package com.hedima.capas.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Paciente {

    private int idPaciente;
    private String nombre;
    private int edad;
}
