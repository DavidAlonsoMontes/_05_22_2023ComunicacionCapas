package com.hedima.capas.controlador;

import com.hedima.capas.modelo.Paciente;
import com.hedima.capas.servicio.IPacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
    @GetMapping("/pacientes/formulario")
    public String mostrarFormulario(Model modelo) {
        Paciente p1 = new Paciente();
        modelo.addAttribute("paciente",p1);
        return "fpaciente";
    }
    @PostMapping("pacientes/paciente/nuevo")
    public String altaPaciente(Paciente p1) {
        Paciente p2 = servicio.altaPaciente(p1);
        return "index";
    }

    @GetMapping("/pacientes/mostrar")
    public String mostrarTodos(Model modelo){
        //LLamada a servicio
        List<Paciente> pacientes = servicio.mostrarTodos();
        modelo.addAttribute("Paciente", pacientes);
        return "mostrartodos";
    }
}






