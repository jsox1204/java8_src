package workshop;

public class Test02 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int n = 1;n <= 20; n++) {
			if(n % 2 != 0) {
				if(n % 3 != 0) {
					sum += n;
				}
			}
		}
		System.out.println("sum = " + sum);
	}

}
