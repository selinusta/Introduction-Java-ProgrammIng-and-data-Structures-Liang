package bolum02;

public class Literaller {

	public static void main(String[] args) {
		
		int i = 5;
		
		double d = 5;
		
		byte b = 100;
		short s = 32000;
		
		float f = 1.0F;
		
		System.out.println(1D / 3);
		System.out.println(1F / 3);
		
		long l = 3_000_000_000_000_000L;
		System.out.println(3_000_000_000_000_000L);
		
		i = 0B11111111111111111111111111111111;
		System.out.println(i);
		i = 0XFFFFFFFF;
		System.out.println(i);
		
		System.out.println(0B1111); // Displays 15 
		System.out.println(0XFFFF); // Displays 65535

	}

}
