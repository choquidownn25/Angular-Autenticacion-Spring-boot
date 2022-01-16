package com.example.angular.controller;

import com.example.angular.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @GetMapping(value = "/test/{personName}")
    public ResponseEntity<Response> test(@PathVariable("personName") String personName){
        return new ResponseEntity<Response>(new Response("Hola "+ personName +" Bienbenido"), HttpStatus.OK);
    }
}
