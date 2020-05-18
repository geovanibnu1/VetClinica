package helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

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
import task.TaskInterface;

public class Helper {

	//scanner to get user inputs
	Scanner scan = new Scanner(System.in);
	
	//bufferreader to get user inputs
	BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
	
	// List of animals
	List<Dog> dogs = new LinkedList<Dog>();
	List<Cat> cats = new LinkedList<Cat>();
	List<Chinchilla> chinchillas = new LinkedList<Chinchilla>();
	List<Hamster> hamsters = new LinkedList<Hamster>();
	List<Parrot> parrots = new LinkedList<Parrot>();

	// List off staffs
	List<ITNerd> itnerds = new LinkedList<ITNerd>();
	List<Receptionist> receptionists = new LinkedList<Receptionist>();
	List<Nurse> nurses = new LinkedList<Nurse>();
	List<Veterinarian> veterinarians = new LinkedList<Veterinarian>();
	List<TraineeVet> traineesVet = new LinkedList<TraineeVet>();
	
	// list of tasks
	List<TaskInterface> arrayTask = new LinkedList<TaskInterface>();

	//constructor generating the animals and the staff 
	public Helper() {
		generateAnimals();
		generateAdminStaff();
		generateMedicalStaff();
		giveTasks();
		
		//calling the CLI passing this instance off the class
		new ComandLineInterface(this);
	}

	// method to give tasks to admin staff
	private void giveTasks() {
		Random r = new Random();
		
		// simple tasks list can add more if desired
		String[] taskList = {
				"Make phone calls","Filing", "On Holidays",
		};
		
		
		// for loop to give tasks to itnerd
		for(ITNerd itnerds : itnerds) {
			String task = taskList[r.nextInt(taskList.length)];
			arrayTask.add(new TaskInterface(itnerds, task));
		}
		// for loop to give tasks to receptionist
		for(Receptionist rec : receptionists) {
			String task = taskList[r.nextInt(taskList.length)];
			arrayTask.add(new TaskInterface(rec, task));
		}
	}

	// method to generate all the animals
	public void generateAnimals() {
		int d = 0;
		int c = 0;
		int ch = 0;
		int h = 0;
		int p = 0;

		// while loop to generate 200 dogs
		while (d < 200) {
			dogs.add(new Dog(null, 0, null));
			d++;
		}
		// while loop to generate 200 cats
		while (c < 200) {
			cats.add(new Cat(null, 0, null));
			c++;
		}
		// while loop to generate 200 chinchillas
		while (ch < 200) {
			chinchillas.add(new Chinchilla(null, 0, null));
			ch++;
		}
		// while loop to generate 200 hamsters
		while (h < 200) {
			hamsters.add(new Hamster(null, 0, null));
			h++;
		}
		// while loop to generate 200 parrots
		while (p < 200) {
			parrots.add(new Parrot(null, 0, null));
			p++;
		}
	}

	// method to generate admin staff
	public void generateAdminStaff() {
		//for loop to generate 5 itnerds and 5 receptionists
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				itnerds.add(new ITNerd(null, 0, 1));
			} else if (i >= 5 && i < 10) {
				receptionists.add(new Receptionist(null, 0, 2));
			}
		}
	}

	//	method to generate medical staff
	public void generateMedicalStaff() {
		//for loop to generate all the medical staff 10 of each
		for (int i = 0; i < 30; i++) {
			if (i < 10) {
				nurses.add(new Nurse(null, 0, 1));
			} else if (i >= 10 && i < 20) {
				veterinarians.add(new Veterinarian(null, 0, 2));
			} else if (i >= 20 && i < 30) {
				traineesVet.add(new TraineeVet(null, 0, 2));
			}
		}
	}

	//method to list all the staff
	public void listAllStaff() {
		for (Nurse nurses : nurses) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + nurses.getName());
			System.out.println("Staff-Number: " + nurses.getStaffNumber());
			System.out.println("Position: " + nurses.getClass().getSimpleName());
		}

		for (Veterinarian veterinarians : veterinarians) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + veterinarians.getName());
			System.out.println("Staff-Number: " + veterinarians.getStaffNumber());
			System.out.println("Position: " + veterinarians.getClass().getSimpleName());
		}

		for (TraineeVet traineesVet : traineesVet) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + traineesVet.getName());
			System.out.println("Staff-Number: " + traineesVet.getStaffNumber());
			System.out.println("Position: " + traineesVet.getClass().getSimpleName());
		}

		for (ITNerd itnerds : itnerds) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + itnerds.getName());
			System.out.println("Staff-Number: " + itnerds.getStaffNumber());
			System.out.println("Position: " + itnerds.getClass().getSimpleName());
		}

		for (Receptionist receptionist : receptionists) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + receptionist.getName());
			System.out.println("Staff-Number: " + receptionist.getStaffNumber());
			System.out.println("Position: " + receptionist.getClass().getSimpleName());
		}
	}

	//method to list veterinarians
	public void listVeterinariam() {
		for (Veterinarian veterinarians : veterinarians) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + veterinarians.getName());
			System.out.println("Staff-Number: " + veterinarians.getStaffNumber());
			System.out.println("Position: " + veterinarians.getClass().getSimpleName());
		}

	}
	//method to list nurses
	public void listNurse() {
		for (Nurse nurses : nurses) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + nurses.getName());
			System.out.println("Staff-Number: " + nurses.getStaffNumber());
			System.out.println("Position: " + nurses.getClass().getSimpleName());
		}

	}
	//method to list traineevet
	public void listTraineeVet() {
		for (TraineeVet traineesVet : traineesVet) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + traineesVet.getName());
			System.out.println("Staff-Number: " + traineesVet.getStaffNumber());
			System.out.println("Position: " + traineesVet.getClass().getSimpleName());
		}

	}
	//method to list itnerds
	public void listItNerd() {
		for (ITNerd itnerds : itnerds) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + itnerds.getName());
			System.out.println("Staff-Number: " + itnerds.getStaffNumber());
			System.out.println("Position: " + itnerds.getClass().getSimpleName());
		}

	}
	//method to list receptionists
	public void listReceptionist() {
		for (Receptionist receptionist : receptionists) {
			System.out.println("---------------------------------------");
			System.out.println("Name: " + receptionist.getName());
			System.out.println("Staff-Number: " + receptionist.getStaffNumber());
			System.out.println("Position: " + receptionist.getClass().getSimpleName());
		}

	}
	//method to list all animals
	public void listAllAnimals() {
		for (Dog dog : dogs) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + dog.getName());
			System.out.println("Animal Age: " + dog.getAge());
			System.out.println("Animal Kind:" + dog.getClass().getSimpleName());
			System.out.println("Medical Condition: " + dog.getMedicalCondition().getRandomCondition());
		}
		
		for (Cat cat : cats) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + cat.getName());
			System.out.println("Animal Age: " + cat.getAge());
			System.out.println("Animal Kind:" + cat.getClass().getSimpleName());
			System.out.println("Medical Condition: " + cat.getMedicalCondition().getRandomCondition());
		}
		
		for (Chinchilla chinchilla : chinchillas) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + chinchilla.getName());
			System.out.println("Animal Age: " + chinchilla.getAge());
			System.out.println("Animal Kind:" + chinchilla.getClass().getSimpleName());
			System.out.println("Medical Condition: " + chinchilla.getMedicalCondition().getRandomCondition());
		}
		
		for (Hamster hamster : hamsters) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + hamster.getName());
			System.out.println("Animal Age: " + hamster.getAge());
			System.out.println("Animal Kind:" + hamster.getClass().getSimpleName());
			System.out.println("Medical Condition: " + hamster.getMedicalCondition().getRandomCondition());
		}
		
		for (Parrot parrot : parrots) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + parrot.getName());
			System.out.println("Animal Age: " + parrot.getAge());
			System.out.println("Animal Kind:" + parrot.getClass().getSimpleName());
			System.out.println("Medical Condition: " + parrot.getMedicalCondition().getRandomCondition());
		}

	}

	//method to list dogs
	public void listDog() {
		for (Dog dog : dogs) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + dog.getName());
			System.out.println("Animal Age: " + dog.getAge());
			System.out.println("Animal Kind:" + dog.getClass().getSimpleName());
			System.out.println("Medical Condition: " + dog.getMedicalCondition().getRandomCondition());
		}
		
	}
	//method to list cats
	public void listCat() {
		for (Cat cat : cats) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + cat.getName());
			System.out.println("Animal Age: " + cat.getAge());
			System.out.println("Animal Kind:" + cat.getClass().getSimpleName());
			System.out.println("Medical Condition: " + cat.getMedicalCondition().getRandomCondition());
		}
		
	}

	//method to list chinchillas
	public void listChinchilla() {
		for (Chinchilla chinchilla : chinchillas) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + chinchilla.getName());
			System.out.println("Animal Age: " + chinchilla.getAge());
			System.out.println("Animal Kind:" + chinchilla.getClass().getSimpleName());
			System.out.println("Medical Condition: " + chinchilla.getMedicalCondition().getRandomCondition());
		}
		
	}
	//method to list hamsters
	public void listHamster() {
		for (Hamster hamster : hamsters) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + hamster.getName());
			System.out.println("Animal Age: " + hamster.getAge());
			System.out.println("Animal Kind:" + hamster.getClass().getSimpleName());
			System.out.println("Medical Condition: " + hamster.getMedicalCondition().getRandomCondition());
		}
		
	}
	//method to list parrots
	public void listParrot() {
		for (Parrot parrot : parrots) {
			System.out.println("---------------------------------------");
			System.out.println("PET Name: " + parrot.getName());
			System.out.println("Animal Age: " + parrot.getAge());
			System.out.println("Animal Kind:" + parrot.getClass().getSimpleName());
			System.out.println("Medical Condition: " + parrot.getMedicalCondition().getRandomCondition());
		}
		
	}

	//method to list staff by name
	public void selectStaffByName() {
		
		int opt;
		int positionNumber = 1;
		// array list to keep just the staff names
		List<String> staffs = new LinkedList<>();
		
		// fgor loops to get names from all staff members
		for(Nurse nurseName : nurses) {
			staffs.add(nurseName.getName());
		}
		
		for(ITNerd itnerdName : itnerds) {
			staffs.add(itnerdName.getName());
		}
		
		for(Receptionist receptionistName : receptionists) {
			staffs.add(receptionistName.getName());
	}
	
		for(TraineeVet traineeVetName : traineesVet) {
			staffs.add(traineeVetName.getName());
	}
		
		for(Veterinarian veterinarianName : veterinarians) {
		staffs.add(veterinarianName.getName());
	}
		
		for(int i = 0; i < staffs.size(); i++) {
			System.out.println("\n" + positionNumber + "-" + staffs.get(i));
			positionNumber++;
		}
		
		System.out.println("Enter the Staff Name: ");
		try {
			String inputedName = input.readLine();
			
			for(Veterinarian vet : veterinarians) {
				if(inputedName.equals(vet.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + vet.getName());
					System.out.println("Staff-Number: " + vet.getStaffNumber());
					System.out.println("Job: " + vet.getClass().getSimpleName());
					System.out.println("Slary Level: " + vet.getSalaryLevel());
				}
			}
			
			for(Nurse nurse : nurses) {
				if(inputedName.equals(nurse.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + nurse.getName());
					System.out.println("Staff-Number: " + nurse.getStaffNumber());
					System.out.println("Job: " + nurse.getClass().getSimpleName());
					System.out.println("Slary Level: " + nurse.getSalaryLevel());
				}
			}
			
			for(TraineeVet tvet : traineesVet) {
				if(inputedName.equals(tvet.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + tvet.getName());
					System.out.println("Staff-Number: " + tvet.getStaffNumber());
					System.out.println("Job: " + tvet.getClass().getSimpleName());
					System.out.println("Slary Level: " + tvet.getSalaryLevel());
				}
			}
			for(ITNerd itnerd : itnerds) {
				if(inputedName.equals(itnerd.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + itnerd.getName());
					System.out.println("Staff-Number: " + itnerd.getStaffNumber());
					System.out.println("Job: " + itnerd.getClass().getSimpleName());
					System.out.println("Slary Level: " + itnerd.getSalaryLevel());
				}
			}
			for(Receptionist rec : receptionists) {
				if(inputedName.equals(rec.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + rec.getName());
					System.out.println("Staff-Number: " + rec.getStaffNumber());
					System.out.println("Job: " + rec.getClass().getSimpleName());
					System.out.println("Slary Level: " + rec.getSalaryLevel());
				}
			}
		} catch (IOException e) {
			System.out.println("Enter the name properly!");
			selectStaffByName();
			e.printStackTrace();
		}
		
		
		
	}

	//method to list animal by name
	public void selectAnimalByName() {
		int opt;
		int positionNumber = 1;
		List<String> animals = new LinkedList<>();
		
		for(Cat cat : cats) {
			animals.add(cat.getName());
		}
		
		for(Chinchilla chin : chinchillas) {
			animals.add(chin.getName());
		}
		for(Dog dog : dogs) {
			animals.add(dog.getName());
		}
		for(Hamster ham : hamsters) {
			animals.add(ham.getName());
		}
		for(Parrot parr : parrots) {
			animals.add(parr.getName());
		}
		
		
		for(int i = 0; i < animals.size(); i++) {
			System.out.println("\n" + positionNumber + "-" + animals.get(i));
			positionNumber++;
		}
		
		System.out.println("Enter the Animal Name: ");
		try {
			String inputedName = input.readLine();
			
			for(Cat cat : cats) {
				if(inputedName.equals(cat.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + cat.getName());
					System.out.println("Age: " + cat.getAge());
					System.out.println("Medical Condition: " + cat.getMedicalCondition());
				}
			}
			
			for(Chinchilla chin : chinchillas) {
				if(inputedName.equals(chin.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + chin.getName());
					System.out.println("Age: " + chin.getAge());
					System.out.println("Medical Condition: " + chin.getMedicalCondition());
				}
			}
			
			for(Dog dog : dogs) {
				if(inputedName.equals(dog.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + dog.getName());
					System.out.println("Age: " + dog.getAge());
					System.out.println("Medical Condition: " + dog.getMedicalCondition());
				}
			}
			
			for(Hamster ham : hamsters) {
				if(inputedName.equals(ham.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + ham.getName());
					System.out.println("Age: " + ham.getAge());
					System.out.println("Medical Condition: " + ham.getMedicalCondition());
				}
			}
			
			for(Parrot parr : parrots) {
				if(inputedName.equals(parr.getName())) {
					System.out.println("---------------------------------------");
					System.out.println("Name: " + parr.getName());
					System.out.println("Age: " + parr.getAge());
					System.out.println("Medical Condition: " + parr.getMedicalCondition());
				}
			}
			
			
		} catch (IOException e) {
			System.out.println("Enter the name properly!");
			selectStaffByName();
			e.printStackTrace();
		}
		
	}

	
	// list admin staff performing a certain task
	public void selectTask() {
		int opt;
		int positionNumber = 1;
		
		// list of tasks
		List<String> tasks = new LinkedList<>();
		
		for(TaskInterface tas : arrayTask) {
			tasks.add(tas.getTask());
		}
		
		
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println("\n" + positionNumber + "-" + tasks.get(i));
			positionNumber++;
		}
		
		System.out.println("Enter the task Name: ");
		try {
			String inputedName = input.readLine();
			
			for(TaskInterface tas2 : arrayTask) {
				if(inputedName.equals(tas2.getTask())) {
					System.out.println("-------------------------------------------");
					System.out.println("Task: " + tas2.getTask());
					System.out.println("Staff Member: " + tas2.getStaff().getName());
				}
			}
			
		} catch (IOException e) {
			System.out.println("Enter the name properly!");
			selectStaffByName();
			e.printStackTrace();
		}
		
	}
	


}
