package com.hedima.capas.controlador;

import com.hedima.capas.modelo.Paciente;
import com.hedima.capas.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PacienteControlador {
    @Autowired
    private IPacienteServicio servicio;

    @GetMapping("")
    public String obtenerUno() {
        Paciente p1 = new Paciente(4,"Eduardo López",35);
        String p = servicio.obtenerUno(p1);
        System.out.println(p);
        return "index";
    }

    public String mostrarFormulario(Model modelo) {
        Paciente p1 = new Paciente();
        modelo.addAttribute("paciente",p1);
        return "fpaciente";
    }
}
