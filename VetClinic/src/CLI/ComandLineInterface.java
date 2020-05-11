package CLI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import helper.Helper;

public class ComandLineInterface {

	BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	String option = null;
	int opt = 0;

	

	public ComandLineInterface(Helper helper) {

		System.out.println("Menu: ");
		System.out.println("1 - For Staff Menu");
		System.out.println("0 - For EXIT");
		
		opt = scan.nextInt();
		
		if(opt == 1) {
			staffMenu(helper);
			scan.close();
		}else if(opt == 0){
			System.out.println("Bye!!");
			return;
		}else {
			System.out.println("Sorry, Check your choice again!");
		}

	}

	public void staffMenu(Helper helper) {


		System.out.println("Staff Members Menu, What would you like to do?:  ");
		System.out.println("\n1 For show all staff members: "
				+ "\n2 List staff by Category" +
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
			}else {
				System.out.println("Invalid Option, please enter a valid number option!");
				staffMenu(helper);
			}
		} catch (Exception e) {
			System.out.println("Ops, Something wrong, please check your option!");
		}

	}

}
