package animal;

import java.util.Random;

public class MedicalConditionGenerator {
	
	// Array of illness
		private String[] condition = {"Sars", "Corona", "Covid", "Peste", "Fever"};
		
		public MedicalConditionGenerator() {
			// TODO Auto-generated constructor stub
		}
		
		public String getRandomCondition() {
			//return a random name
			
			Random r = new Random();
			
			//pick a animal condition
			String illness = condition[r.nextInt(condition.length)];
			
			return ( illness );
			
		}

}
