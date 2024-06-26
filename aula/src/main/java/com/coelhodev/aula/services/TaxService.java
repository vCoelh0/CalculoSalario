package com.coelhodev.aula.services;

import org.springframework.stereotype.Service;

@Service
public class TaxService {
    
    //função
    public double tax(double amount){
        return amount * 0.2;
    }
    
}
