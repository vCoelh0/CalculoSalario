package com.coelhodev.aula.services;

import org.springframework.stereotype.Service;

@Service
public class PensioService {
    
    public double discount(double amount){
        return amount * 0.1;
        
       
    }
    
}
