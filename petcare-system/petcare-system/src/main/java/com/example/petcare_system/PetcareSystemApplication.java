package com.example.petcare_system;

import com.example.petcare_system.controller.PetController;
import com.example.petcare_system.model.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetcareSystemApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PetcareSystemApplication.class, args);

		// Get PetController bean from Spring context
		PetController petController = context.getBean(PetController.class);

		// Create and add a new pet
		Pet pet = new Pet("Falco", 3, "Cat");
		Pet pet1 = new Pet("Mo3taz", 180, "Dragon");
		Pet pet2 = new Pet("Nino", 1, "Fish");

		petController.addPet(pet);
		petController.addPet(pet1);
		petController.addPet(pet2);

//		 Print all pets
		System.out.println("Current Pets:");
		for (Pet p : petController.getPets()) {
			System.out.println("- " + p.getName() + ", " + p.getAge() + " years old, Type: " + p.getType());
		}




	}
}
