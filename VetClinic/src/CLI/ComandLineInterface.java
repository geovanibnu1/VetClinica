package CLI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import helper.Helper;

public class ComandLineInterface {

	// buffer reader to get inputs from the user
	BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
	// scanner to get user inputs
	Scanner scan = new Scanner(System.in);
	
	String option = null;
	int opt = 0;

	

	public ComandLineInterface(Helper helper) {
// menu of options for the user
		System.out.println("Menu: ");
		System.out.println("1 - For Staff Menu");
		System.out.println("2 - For Animal Menu");
		System.out.println("0 - For EXIT");
		
		opt = scan.nextInt();
		
		if(opt == 1) {
			staffMenu(helper);
			scan.close();
		}else if(opt == 0){
			System.out.println("Bye!!");
			return;
		}else if(opt == 2){
			AnimalMenu(helper);
		}else {
			System.out.println("Sorry, Check your choice again!");
		}

	}

	// staff menu 
	public void staffMenu(Helper helper) {


		System.out.println("Staff Members Menu, What would you like to do?:  ");
		System.out.println("\n1 For show all staff members: "
				+ "\n2 List staff by Category: "
				+ "\n3 List Staff Member by Name: "
				+ "\n4 List Staff by task: " +
				"\n0 For exit: ");

		opt = scan.nextInt();
		try {
			if(opt == 1) {
				helper.listAllStaff();
				staffMenu(helper);
				scan.close();
			}else if(opt == 0) {
				System.out.println("Bye!");
				return;
			}else if(opt == 2) {
				System.out.println("Select Which Category!");
				System.out.println("1 For Veterinariam!"
						+ "\n2 For Nurse"
						+ "\n3 For TraineeVet"
						+ "\n4 For ITNerd"
						+ "\n5 For Receptionist");
				opt = scan.nextInt();
				if(opt == 1) {
					helper.listVeterinariam();
					staffMenu(helper);
				}else if(opt == 2) {
					helper.listNurse();
					staffMenu(helper);
				}else if(opt == 3) {
					helper.listTraineeVet();
					staffMenu(helper);
				}else if(opt == 4) {
					helper.listItNerd();
					staffMenu(helper);
				}else if(opt == 5) {
					helper.listReceptionist();
					staffMenu(helper);
				}
			}else if(opt == 3) {
				System.out.println("Select Staff Member Name: ");
				helper.selectStaffByName();
				staffMenu(helper);
			}else if(opt == 4){
				System.out.println("Select task by Name: ");
				helper.selectTask();
				staffMenu(helper);
			}else {
				System.out.println("Invalid Option, please enter a valid number option!");
				staffMenu(helper);
			}
		} catch (Exception e) {
			System.out.println("Ops, Something wrong, please check your option!");
		}

	}

	// animal menu
	public void AnimalMenu(Helper helper) {


		System.out.println("Animals Menu, What would you like to do?:  ");
		System.out.println("\n1 For show all animals: "
				+ "\n2 List animals by Category"
				+ "\n3 List animal by name" +
				"\n0 For exit: ");

		opt = scan.nextInt();
		try {
			if(opt == 1) {
				helper.listAllAnimals();
				AnimalMenu(helper);
				scan.close();
			}else if(opt == 0) {
				System.out.println("Bye!");
				return;
			}else if(opt == 2) {
				System.out.println("Select Which Category!");
				System.out.println("1 For Dog!"
						+ "\n2 For Cat"
						+ "\n3 For Chinchilla"
						+ "\n4 For Hamster"
						+ "\n5 For Parrot");
				opt = scan.nextInt();
				if(opt == 1) {
					helper.listDog();
					AnimalMenu(helper);
				}else if(opt == 2) {
					helper.listCat();
					AnimalMenu(helper);
				}else if(opt == 3) {
					helper.listChinchilla();
					AnimalMenu(helper);
				}else if(opt == 4) {
					helper.listHamster();
					AnimalMenu(helper);
				}else if(opt == 5) {
					helper.listParrot();
					AnimalMenu(helper);
				}
			}else if(opt == 3){
				System.out.println("Select animal by Name: ");
				helper.selectAnimalByName();
				AnimalMenu(helper);
			}else {
				System.out.println("Invalid Option, please enter a valid number option!");
				AnimalMenu(helper);
			}
		} catch (Exception e) {
			System.out.println("Ops, Something wrong, please check your option!");
		}

	}
}
