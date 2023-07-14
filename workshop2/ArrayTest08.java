package workshop2;

public class ArrayTest08 {
	public static void main(String[] args) {
		
		int [] score= {99,34,67,22,11,9};
		int maxScore = 0;
		int minScore = 10000;
		
		for(int x: score) {
			if(x > maxScore) {
				maxScore = x;
			}
			
			if(x < minScore) {
				minScore = x;
			}
		}
		System.out.println("최대값:" + maxScore);
		System.out.println("최소값:" + minScore);
	}
}
	