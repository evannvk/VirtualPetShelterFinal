package virtual_pet;

import java.util.Scanner;

public class VirtualPetShelterApp {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String playerChoice;
		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		virtualPetShelter.addPet(new VirtualPet("Bob","Ferocious parrot"));
		System.out.println("Welcome to the local Virtual Pet Shelter! Here are the pets in the shelter:");
		printPets(virtualPetShelter);
			
		System.out.println("What would you like to do?");
		System.out.println("1. Give the pets some food");
		System.out.println("2. Give the pets some water");
		System.out.println("3. Play with the pets");
		System.out.println("4. Adopt a pet");
		System.out.println("5. Bring in a pet off the street and into the shelter.");
		System.out.println("6. Quit the game.");
		playerChoice = input.nextLine();
		
		while (!playerChoice.contentEquals("6")) {			
			if (playerChoice.contentEquals("1")) {
				System.out.println("You gave the pets some food!");
				virtualPetShelter.reduceHungerAll();
				virtualPetShelter.tickAll();
			} else if (playerChoice.contentEquals("2")) {
				System.out.println("You gave the pets some water!");
				virtualPetShelter.reduceThirstAll();
				virtualPetShelter.tickAll();
			} else if (playerChoice.contentEquals("3")) {
				System.out.println("You gave Dave a toy to play with!");
				System.out.println(virtualPetShelter.allPets());
				virtualPetShelter.tickAll();
			} else if (playerChoice.contentEquals("4")) {
				System.out.println("You chose to adopt a pet! Enter the name of the pet you want to adopt:");
				virtualPetShelter.adoptPetOut(input.nextLine());
				virtualPetShelter.tickAll();
			} else if (playerChoice.contentEquals("5")) {
				System.out.println("You chose to take in a homeless pet! Please enter a name for this pet:");
				String petName = input.nextLine();
				System.out.println("Now enter a description for this pet:");
				String petDescription = input.nextLine();
				virtualPetShelter.addPet(new VirtualPet(petName, petDescription));
				virtualPetShelter.tickAll();
			} else { 
				System.out.println("Goodbye!");
				System.exit(0);
			}
			
			System.out.println("Welcome to the local Virtual Pet Shelter! Here are the pets in the shelter:");
			printPets(virtualPetShelter);
				
			System.out.println("What would you like to do?");
			System.out.println("1. Give the pets some food");
			System.out.println("2. Give the pets some water");
			System.out.println("3. Play with the pets");
			System.out.println("4. Adopt a pet");
			System.out.println("5. Bring in a pet off the street and into the shelter.");
			System.out.println("6. Quit the game.");
			playerChoice = input.nextLine();
			
		}
		
		input.close();
	}

	private static void printPets(VirtualPetShelter virtualPetShelter) {

		System.out.println(virtualPetShelter.givePetStatuses());
	}
}