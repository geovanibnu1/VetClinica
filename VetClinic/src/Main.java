import animal.Dog;
import animal.Hamster;
import staff.ITNerd;
import staff.Receptionist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// so para debug
		ITNerd nerd1 = new ITNerd(null, 2, 1);
		
		System.out.println(nerd1.getName().getRandomName());
		
		Receptionist rec1 = new Receptionist(null, 2, 1);
		
		System.out.println(rec1.getName().getRandomName());	
		
		
		Dog dog1 = new Dog(null, 1, null);
		
		System.out.println(dog1.getName().getRandomName());
		System.out.println(dog1.getMedicalCondition().getRandomCondition());
		
		Hamster ham1 = new Hamster(null, 1, null);
		
		System.out.println(ham1.getName().getRandomName());
		System.out.println(ham1.getMedicalCondition().getRandomCondition());
	}

}
