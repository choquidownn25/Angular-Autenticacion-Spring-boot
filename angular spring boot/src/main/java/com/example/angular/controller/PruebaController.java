package com.example.angular.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {
    @GetMapping("/nombre")
    public String nombreSitio(){
        return "Tutorial yo Androide";

    }
    @GetMapping("/descripcion")
    public String descripcionSitio(){
        return "Tutorial yo Androide sobre api rest con Spring Boot";

    }
}
