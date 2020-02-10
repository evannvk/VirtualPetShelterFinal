package virtual_pet;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {
	
	VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
	VirtualPet virtualPet = new VirtualPet("", "");

	VirtualPetShelter underTest;

	@SuppressWarnings("deprecation")
	@Test
	public void shouldAddNewPet() {
		VirtualPet virtualPet = new VirtualPet("", "");
		virtualPetShelter.addPet(virtualPet);
		Collection<VirtualPet> check = virtualPetShelter.allPets();
		
		assertThat(check, contains(virtualPet));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldAddMulitplePets() {
		VirtualPet virtualPet1 = new VirtualPet("Bob","");
		VirtualPet virtualPet2 = new VirtualPet("Phil","");
		virtualPetShelter.addPet(virtualPet1);
		virtualPetShelter.addPet(virtualPet2);
		Collection<VirtualPet> check = virtualPetShelter.allPets();
		
		assertThat(check, containsInAnyOrder(virtualPet1, virtualPet2));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldRemovePetFromShelter() {
		VirtualPet virtualPet1 = new VirtualPet("Bob","");
		VirtualPet virtualPet2 = new VirtualPet("Phil","");
		virtualPetShelter.addPet(virtualPet1);
		virtualPetShelter.addPet(virtualPet2);
		Collection<VirtualPet> check = virtualPetShelter.allPets();
		virtualPetShelter.adoptPetOut("Phil");
		assertThat(check, contains(virtualPet1));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldDecreaseHunger() {
		int hungerBefore = virtualPet.getHunger();
		underTest.reduceHungerAll();
		int hungerAfter = virtualPet.getHunger();
		assertThat(hungerBefore - hungerAfter, is(18));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldDecreaseThirst() {
		int thirstBefore = virtualPet.getThirst();
		underTest.reduceThirstAll();
		int thirstAfter = virtualPet.getThirst();
		assertThat(thirstBefore - thirstAfter, is(8));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void shouldDecreaseEnergy() {
		int energyBefore = virtualPet.getEnergy();
		underTest.reduceEnergyAll();
		int energyAfter = virtualPet.getEnergy();
		assertThat(energyBefore - energyAfter, is(18));
	}
}	
	