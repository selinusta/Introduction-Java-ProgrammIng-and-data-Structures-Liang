package bolum03;

public class RassalSayiUretme {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			int randNumber = (int) (Math.random() * 2) + 15; 
			// mart.random() i aralikla carpip en dusuk sayiyi ekleyecegiz  
			
			System.out.println(randNumber);
		}

	}

}
