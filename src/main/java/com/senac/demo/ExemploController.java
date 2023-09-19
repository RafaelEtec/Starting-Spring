package com.senac.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exemplo")
public class ExemploController {
    
    @GetMapping("/mensagem1")
    public String saudar1(Model modelo) {
        System.out.println(" |||||||||||||||||||| Coisa ||||||||||||||||||| ");
        return "mensagem-view";
    }
    
    @GetMapping("/mensagem2")
    public ModelAndView saudar2() {
        return new ModelAndView("mensagem-view");
    }
    
    @GetMapping("/exemplo-request-param")
    public ModelAndView exemploRequestParam (
            @RequestParam(value = "param1str", required = true, defaultValue = "Rafael Goulart") String param1,
            @RequestParam(value = "param2int", required = false, defaultValue = "1910") int param2) {
        ModelAndView resposta = new ModelAndView("view-exemplo");
        System.out.println(param1 + "\t" + param2);
        return resposta;
    }
    
    
}