package com.coelhodev.aula.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coelhodev.aula.entities.Employee;

@Service
public class SalaryService {

     @Autowired   
     private TaxService taxService;
     
     @Autowired
     private PensioService pensioService; 
     
    
     
         public double netSalary(Employee employee){
         return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
                 - pensioService.discount(employee.getGrossSalary());
    }
}
