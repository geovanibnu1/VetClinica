import staff.ITNerd;
import staff.Receptionist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// so para debug
		ITNerd nerd1 = new ITNerd("", 2, 1);
		
		System.out.println(nerd1.getName().getRandomName());
		
		Receptionist rec1 = new Receptionist("", 2, 1);
		
		System.out.println(rec1.getName().getRandomName());	
	}

}
