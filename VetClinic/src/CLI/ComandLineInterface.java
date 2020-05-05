package CLI;

import java.util.Scanner;

import helper.Helper;

public class ComandLineInterface {
	
	Scanner input = new Scanner(System.in);
	
	public ComandLineInterface() {
			
		System.out.println("Menu: ");
		System.out.println("1 - For Staff Menu");
		System.out.println("0 - For EXIT");
		
		if(input.nextInt() == 1) {
			staffMenu(null);
		}else if(input.nextInt() == 0) {
			return;
		}else {
			System.out.println("Invalid Option, please enter a valid number option!");
		}
	}
	
	public void staffMenu(Helper helper) {
		
		
		System.out.println("Staff Members Menu, What would you like to do?:  ");
		System.out.println("\n1 For show all staff members: " +
				"\n0 For exit: ");
		
		if(input.nextInt() == 0) {
			return;
		}else if(input.nextInt() == 1) {
			helper.listAllStaff();
		}else {
			System.out.println("Invalid Option, please enter a valid number option!");
			staffMenu(helper);
		}
	}

}
