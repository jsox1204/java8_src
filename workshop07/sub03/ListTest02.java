package workshop07.sub03;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest02 {

	public static void main(String[] args) {
		
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		
		ConvertList convert = new ConvertList();
		
		ArrayList<Integer> list = convert.convertList(array);
		
		Iterator<Integer> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
