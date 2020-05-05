package helper;

import java.util.LinkedList;
import java.util.List;

import animal.Cat;
import animal.Chinchilla;
import animal.Dog;
import animal.Hamster;
import animal.Parrot;

public class Helper {
	
	List<Dog> dogs = new LinkedList<Dog>();
	List<Cat> cats = new LinkedList<Cat>();
	List<Chinchilla> chinchillas = new LinkedList<Chinchilla>();
	List<Hamster> hamsters = new LinkedList<Hamster>();
	List<Parrot> parrots = new LinkedList<Parrot>();
	
	public Helper() {
		generateAnimals();
		test();
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

}
