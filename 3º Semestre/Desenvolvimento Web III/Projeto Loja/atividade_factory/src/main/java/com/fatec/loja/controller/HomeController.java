package com.fatec.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamento")
public class HomeController{
    @GetMapping("/")
    public String departamento(){
        return "departamento";
    }

    @GetMapping("/suplementos")
    public String suplementos(){
        return "suplementos";
    }

    @GetMapping("/livro")
    public String livro(){
        return "livro";
    }

    @GetMapping("/eletronicos")
    public String eletronicos(){
        return "eletronicos";
    }
}