package com.calculo.digito.onze.digito.onze.service;

import java.util.function.Predicate;

import com.calculo.digito.model.Numero;

public class VerificarNumero {

    Predicate<Numero> isValid = prod -> (prod.getNum() == 0);

    public Boolean verificarNumero(Long n){

        Numero num = new Numero(n);

       return isValid.test(num);


    }
}
