package exam10_2;

import java.util.ArrayList;
import java.util.List;

// <? extends E> 특정 클래스와 그 자식만 저장하도록 강제
// <? super E> 특정 클래스와 그 부모만 저장하도록 강제

class Person{}
class Man extends Person{}
class Woman extends Person{}

public class GenericsTest4 {

	public static void main(String[] args) {
		
		// Man만 저장
		List<Man> list = new ArrayList<>();
		list.add(new Man());
		list.add(new Man());
		printData(list);
		printData2(list);
		
		// Woman만 저장
		List<Woman> list2 = new ArrayList<>();
		list2.add(new Woman());
		list2.add(new Woman());
		printData(list2);
//		printData2(list2); // error
		
		// String만 저장
		List<String> list3 = new ArrayList<>();
		list3.add("홍길동1");
		list3.add("홍길동2");
//		printData(list3); // error
//		printData2(list3); // error
		
		// Woman만 저장
		List<Person> list4 = new ArrayList<>();
		list4.add(new Person());
		list4.add(new Person());
		printData(list4);
		printData2(list4);
	}
	
	// Person 및 자식만 저장하도록 강제
	public static void printData(List<? extends Person> xxx) {
		
	}
	
	public static void printData2(List<? super Man> xxx) {
		
	}
}
