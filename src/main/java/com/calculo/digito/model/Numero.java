package com.calculo.digito.model;

import java.util.function.Predicate;

public class Numero {
    
    private Long nNum;

    public Numero(Long num) {
        this.nNum = num;
    }

    public Long getNum() {
        return nNum;
    }

    public void setNum(Long num) {
        this.nNum = num;
    }

    Predicate<Numero> isValid = prod -> (prod.getNum() == 0);
}
