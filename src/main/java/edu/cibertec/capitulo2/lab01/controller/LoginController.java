package edu.cibertec.capitulo2.lab01.controller;


import edu.cibertec.capitulo2.lab01.dto.UsuarioDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String formLogin(){
        return "login";
    }

    @PostMapping("/login1")
    public String login(Model modelo, @RequestParam("txtUsuario") String username, @RequestParam("txtPassword") String password){
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
            modelo.addAttribute("mensaje", "Dany Cenas");
            return "saludo";
        }
        return "login";
    }

    @PostMapping("/login")
    public String login2(Model modelo, UsuarioDTO usuarioDTO){
        if (usuarioDTO.getUsuario().equalsIgnoreCase("admin") && usuarioDTO.getClave().equalsIgnoreCase("admin")){
            modelo.addAttribute("mensaje", "Dany Cenas");
            return "saludo";
        }
        return "login";
    }
}
