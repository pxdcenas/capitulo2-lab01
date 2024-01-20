package edu.cibertec.capitulo2.lab01.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
public class FormularioController {

    @GetMapping("/formulario")
    public String formulario() {
        return "formulario";
    }

    @PostMapping("/registrar")
    public String registrar(HttpServletRequest request, Model modelo) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String comments = request.getParameter("comments");
        String gender = request.getParameter("gender");
        String[] languages = request.getParameterValues("languages");
        String country = request.getParameter("country");

        modelo.addAttribute("username", username);
        modelo.addAttribute("password", password);
        modelo.addAttribute("comments", comments);
        modelo.addAttribute("gender", gender);
        modelo.addAttribute("languages", Arrays.asList(languages));
        modelo.addAttribute("country", country);

        return "formulario";
    }
}
