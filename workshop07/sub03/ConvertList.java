package workshop07.sub03;

import java.util.ArrayList;

public class ConvertList {
	
	public ArrayList<Integer> convertList(int[] array){
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = array.length - 1; i > 0; i--) {
			list.add(array[i]);
		}
		return list;
	}
}
