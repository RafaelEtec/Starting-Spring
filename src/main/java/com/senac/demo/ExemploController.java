package com.senac.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exemplo")
public class ExemploController {
    
    @GetMapping("/mensagem1")
    public String saudar1(Model modelo) {
        System.out.println(" |||||||||||||||||||| Coisa ||||||||||||||||||| ");
        return "form";
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
    
    @GetMapping("/exemplo-view-obj")
    public ModelAndView exemplosViewObj() {
        ModelAndView mv = new ModelAndView("mensagem-view");
        mv.addObject("nome", "Rafael Goulart");
        mv.addObject("idade", 20);
        mv.addObject("curso", "TADS");
        return mv;
    }
    
    @GetMapping("/form")
    public ModelAndView formSpring() {
        ModelAndView mv = new ModelAndView("form");
        mv.addObject("test", new Test());
        return mv;
    }
    
    @PostMapping("/salvar")
    public ModelAndView salvar(@ModelAttribute Test dadosRecebidos) {
        
        ModelAndView mv = new ModelAndView("resultado");
        mv.addObject("test", dadosRecebidos);
        return mv;
    }
}