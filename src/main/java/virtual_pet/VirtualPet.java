package virtual_pet;

public class VirtualPet {

	private String petName;
	private String petDescription;
	private  int hunger;
	private  int thirst;
	private  int energy;
	

	public VirtualPet(String nameChoice, String descriptionChoice) {
		
		this.petName = nameChoice;
		this.petDescription = descriptionChoice;

		this.hunger = 25;
		this.thirst = 20;
		this.energy = 15;
	}

	public String getName() {
		return petName;
	}
	
	public String getDescription() {
		return petDescription;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getEnergy() {
		return energy;
	}


	public void reduceEnergy() {
		int activity = 10;
		if (energy >= activity) {
			energy -= activity;
		} else {
			energy = 0;
		}
	}

	public void reduceHunger() {
		int food = 7;
		if (hunger >= food ) {
			hunger -= food;
		} else {
			energy = 0;
		}
	}

	public void reduceThirst() {
		int water = 12;
		if (thirst >= water ) {
			thirst -= water;
		} else {
			thirst = 0;
		}
	}

	public void tick() {
		hunger ++;
		energy ++;
		thirst ++;
	}

	public String status() {
		return petName + " | " + petDescription + " | Hunger: " + hunger + " | Energy: " + energy + " | Thirst: " + thirst;
	}
}
