package workshop05.sub06;

public class StudentTest {

	public static void main(String[] args) {
	
		Student[] studentArray = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 171, 81);
		studentArray[1] = new Student("한사람", 13, 183, 72);
		studentArray[2] = new Student("임걱정", 16, 175, 65);
		
		double totalAge = 0.0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;
		
		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
		for(Student stu:studentArray) {
			System.out.println(stu.getName() + "\t" + stu.getAge() + "\t" + stu.getHeight() + "\t" + stu.getWeight());
			totalAge += stu.getAge();
			totalHeight += stu.getHeight();
			totalWeight += stu.getWeight();
		}
		
		System.out.println("나이의 평균:" + (totalAge / studentArray.length));
		System.out.printf("나이의 평균: %.2f \n", (totalAge / studentArray.length));
		System.out.printf("신장의 평균:%.2f \n", (totalHeight / studentArray.length));
		System.out.println(String.format("몸무게의 평균: %.2f \n", (totalWeight / studentArray.length)));
	}

}
