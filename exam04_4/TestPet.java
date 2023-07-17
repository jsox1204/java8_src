package exam04_4;

public class TestPet {

	public static void main(String[] args) {
		
		Cat cat = new Cat("야옹이", 2, "암컷");
		
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		System.out.println(cat.getSex());
		
		// 하나씩 수정
		cat.setName("망치");
		cat.setAge(3);
		
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		System.out.println(cat.getSex());
		
		// 수정
		cat.setCat(4, "수컷");
		System.out.println(cat.getName());
		System.out.println(cat.getAge());
		System.out.println(cat.getSex());
		
		String result = cat.getCat("나비", 2, "암컷");
		System.out.println(result);
		
		///////////////////////////////////////////////////
		cat.xxx();
		
		System.out.println("end");
		///////////////////////////////////////////////////
		cat.yyy(10);
	}

}
