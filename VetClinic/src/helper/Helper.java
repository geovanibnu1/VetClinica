package helper;

import java.util.LinkedList;
import java.util.List;

import CLI.ComandLineInterface;
import animal.Cat;
import animal.Chinchilla;
import animal.Dog;
import animal.Hamster;
import animal.Parrot;
import staff.ITNerd;
import staff.Nurse;
import staff.Receptionist;
import staff.TraineeVet;
import staff.Veterinarian;

public class Helper {
	
	// List of animals
	List<Dog> dogs = new LinkedList<Dog>();
	List<Cat> cats = new LinkedList<Cat>();
	List<Chinchilla> chinchillas = new LinkedList<Chinchilla>();
	List<Hamster> hamsters = new LinkedList<Hamster>();
	List<Parrot> parrots = new LinkedList<Parrot>();
	
	//	List off staffs
	List<ITNerd> itnerds = new LinkedList<ITNerd>();
	List<Receptionist> receptionists = new LinkedList<Receptionist>();
	List<Nurse> nurses = new LinkedList<Nurse>();
	List<Veterinarian> veterinarians = new LinkedList<Veterinarian>();
	List<TraineeVet> traineesVet = new LinkedList<TraineeVet>();
	
	
	
	public Helper() {
		generateAnimals();
		generateAdminStaff();
		generateMedicalStaff();
		new ComandLineInterface(this);
	}
	
	public void test() {
		for(Dog dog : dogs) {
			System.out.println("---------------------------------------");
			System.out.println(dog.getAnimalKind());
			System.out.println(dog.getName().getRandomName());
			System.out.println(dog.getAge());
			System.out.println(dog.getMedicalCondition().getRandomCondition());
		}
		
		
	}

	public void generateAnimals() {
		int d = 0;
		int c = 0;
		int ch = 0;
		int h = 0;
		int p = 0;
		
		while(d < 200 ) {
			dogs.add(new Dog(null, 0, null));
			d++;
		}
		
		while(c < 200 ) {
			cats.add(new Cat(null, 0, null));
			c++;
		}
		
		while(ch < 200 ) {
			chinchillas.add(new Chinchilla(null, 0, null));
			ch++;
		}
		
		while(h < 200 ) {
			hamsters.add(new Hamster(null, 0, null));
			h++;
		}
		
		while(p < 200 ) {
			parrots.add(new Parrot(null, 0, null));
			p++;
		}
	}
	
	public void generateAdminStaff() {
		for(int i = 0; i < 10; i++) {
			if(i < 5) {
				itnerds.add(new ITNerd(null, 0, 1));
			}else if(i >= 5 && i < 10) {
				receptionists.add(new Receptionist(null, 0, 2));
			}
		}
	}

	public void generateMedicalStaff() {
		for(int i = 0; i < 30; i++) {
			if(i < 10) {
				nurses.add(new Nurse(null, 0, 1));
			}else if(i >= 10 && i < 20) {
				veterinarians.add(new Veterinarian(null, 0, 2));
			}else if(i >= 20 && i < 30) {
				traineesVet.add(new TraineeVet(null, 0, 2));
			}
		}
	}

	public void listAllStaff() {
		for(Nurse nurses : nurses) {
			System.out.println("---------------------------------------");
			System.out.println(nurses.getName().getRandomName());
			System.out.println(nurses.getStaffNumber());
			System.out.println(nurses.getClass().getSimpleName());
		}
		
		for(Veterinarian veterinarians : veterinarians) {
			System.out.println("---------------------------------------");
			System.out.println(veterinarians.getName().getRandomName());
			System.out.println(veterinarians.getStaffNumber());
			System.out.println(veterinarians.getClass().getSimpleName());
		}
		
		for(TraineeVet traineesVet : traineesVet) {
			System.out.println("---------------------------------------");
			System.out.println(traineesVet.getName().getRandomName());
			System.out.println(traineesVet.getStaffNumber());
			System.out.println(traineesVet.getClass().getSimpleName());
		}
		
		for(ITNerd itnerds : itnerds) {
			System.out.println("---------------------------------------");
			System.out.println(itnerds.getName().getRandomName());
			System.out.println(itnerds.getStaffNumber());
			System.out.println(itnerds.getClass().getSimpleName());
		}
		
		for(Receptionist receptionist : receptionists) {
			System.out.println("---------------------------------------");
			System.out.println(receptionist.getName().getRandomName());
			System.out.println(receptionist.getStaffNumber());
			System.out.println(receptionist.getClass().getSimpleName());
		}
	}

	public void listVeterinariam() {
		for(Veterinarian veterinarians : veterinarians) {
			System.out.println("---------------------------------------");
			System.out.println(veterinarians.getName().getRandomName());
			System.out.println(veterinarians.getStaffNumber());
			System.out.println(veterinarians.getClass().getSimpleName());
		}
		
	}

	public void listNurse() {
		for(Nurse nurses : nurses) {
			System.out.println("---------------------------------------");
			System.out.println(nurses.getName().getRandomName());
			System.out.println(nurses.getStaffNumber());
			System.out.println(nurses.getClass().getSimpleName());
		}
		
	}

	public void listTraineeVet() {
		for(TraineeVet traineesVet : traineesVet) {
			System.out.println("---------------------------------------");
			System.out.println(traineesVet.getName().getRandomName());
			System.out.println(traineesVet.getStaffNumber());
			System.out.println(traineesVet.getClass().getSimpleName());
		}
		
	}

	public void listItNerd() {
		for(ITNerd itnerds : itnerds) {
			System.out.println("---------------------------------------");
			System.out.println(itnerds.getName().getRandomName());
			System.out.println(itnerds.getStaffNumber());
			System.out.println(itnerds.getClass().getSimpleName());
		}
		
	}

	public void listReceptionist() {
		for(Receptionist receptionist : receptionists) {
			System.out.println("---------------------------------------");
			System.out.println(receptionist.getName().getRandomName());
			System.out.println(receptionist.getStaffNumber());
			System.out.println(receptionist.getClass().getSimpleName());
		}
		
	}
	
}
