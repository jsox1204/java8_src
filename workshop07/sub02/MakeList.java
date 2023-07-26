package workshop07.sub02;
import java.util.ArrayList;
import java.util.Random;

public class MakeList {

	ArrayList<Integer> list;
	
	public MakeList() {
		
	}

	public void makeArrayList(int size) {
		Random rand = new Random();
		list = new ArrayList<>();
		
		 for(int i = 0; i < size; i++) {
			 int num = rand.nextInt(10) + 10;
			 list.add(num);
		 }
	}
	
	public double getAverage() {
		double sum = 0;
		for (Integer num : list) {
			sum += num;
		}
		return sum / list.size();
	}
	
	public ArrayList<Integer> getList(){
		return list;
	}
}
