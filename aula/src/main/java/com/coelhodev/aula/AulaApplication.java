package com.coelhodev.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coelhodev.aula.entities.Employee;
import com.coelhodev.aula.services.SalaryService;


@SpringBootApplication

public class AulaApplication implements CommandLineRunner {
	
	@Autowired
	private SalaryService salaryService;
	

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000.0);
		System.out.println(salaryService.netSalary(employee));
		
	}

}
