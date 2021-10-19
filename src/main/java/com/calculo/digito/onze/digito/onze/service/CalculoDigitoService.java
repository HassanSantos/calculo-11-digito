package com.calculo.digito.onze.digito.onze.service;

import java.util.ArrayDeque;
import java.util.Deque;

import org.springframework.stereotype.Service;

@Service
public class CalculoDigitoService {

    private Integer base = 2;

    private Integer peso = 0;

    private Integer resultado = 0;

    public Integer calcularDigitoOnze(Integer num) {
        Integer fim = 0;
        String str = num.toString();
        Integer maisUm = 1 + Integer.parseInt(str.substring(0, str.length() - 1));
        str = maisUm.toString();
        peso = 1 + str.length();

        Deque<Integer> pilha = createDeque(str);

        pilha.forEach(this::comparValor);

        fim = (resultado * 10) % 11;
        fim = fim <= 9 ? fim : 0;

        return Integer.parseInt(str + fim.toString());

    }

    public void comparValor(Integer numero) {
        resultado += (numero * base);
        base++;
        base = base <= peso ? base : 2;
    }

    public Deque<Integer> createDeque(String str) {
        Deque<Integer> pilha = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            String letra = String.valueOf(str.charAt(i));
            pilha.push(Integer.parseInt(letra));
        }
        return pilha;
    }
}
