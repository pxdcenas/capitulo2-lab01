package edu.cibertec.capitulo2.lab01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class IndexController {

    //@RequestMapping(value = "/saludo", method = RequestMethod.GET)
    //@RequestMapping({"a", "b", "c"})
    @RequestMapping("/abc")
    public String saludo() {
        return "saludo";
    }

    @RequestMapping("/xyz")
    public String xyz() {
        return "xyz";
    }
}
