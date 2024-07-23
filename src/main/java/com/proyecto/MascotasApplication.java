package com.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class MascotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MascotasApplication.class, args);
                
                          BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String plainPassword = "123456";
        String encodedPassword = passwordEncoder.encode(plainPassword);
        
        System.out.println("Contraseña en texto plano: " + plainPassword);
        System.out.println("Contraseña encriptada: " + encodedPassword);
        
	}

}
