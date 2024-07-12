package com.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*

Mascotas("/mascota") => debe retornar una lista de mascotas
Mascotas("/mascota/{id}") => debe retornar una mascota
Adoptante(/adoptantes/{user_id}) = debe retornar un adoptante
*/


@SpringBootApplication
public class MascotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MascotasApplication.class, args);
	}

}
