package edu.cibertec.capitulo2.lab01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaludoController {

    @RequestMapping(value = "/saludo")
    public String saludo(Model modelo){
        modelo.addAttribute("mensaje", "Dany Cenas");
        return "saludo";
    }
}
