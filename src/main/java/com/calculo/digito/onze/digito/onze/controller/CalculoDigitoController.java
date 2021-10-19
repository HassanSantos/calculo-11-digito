package com.calculo.digito.onze.digito.onze.controller;

import com.calculo.digito.onze.digito.onze.service.CalculoDigitoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculoDigitoController {
    @Autowired
    CalculoDigitoService calculoDigitoService;
    
    @PostMapping(path = "/calculo")
    public Integer calcularDigitoOnze(@RequestBody Integer numero){
        return calculoDigitoService.calcularDigitoOnze(numero);
    }
}
