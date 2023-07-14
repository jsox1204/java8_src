package workshop;

public class Test08 {

	public static void main(String[] args) {
		
		for(int n = 1; n <= 100; n++) {
			System.out.print(n);
			if(n % 3 == 0) {
				System.out.print(" " + "foo");
			}
			
			if(n % 5 == 0) {
				System.out.print(" " + "bar");
			}
			
			if(n % 7 == 0) {
				System.out.print(" " + "baz");
			}
			System.out.println("");
		}
	}

}
