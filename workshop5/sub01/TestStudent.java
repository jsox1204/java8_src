package workshop5.sub01;

public class TestStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student("Kim", 100, 90, 95, 89);
		Student student2 = new Student("Lee", 60, 70, 99, 98);
		Student student3 = new Student("Park", 68, 86, 60, 40);
		
		System.out.println(student1.getName() + " 평균:" + student1.getAvg() + " 학점:" + student1.getGrade());
		System.out.println(student2.getName() + " 평균:" + student2.getAvg() + " 학점:" + student2.getGrade());
		System.out.println(student3.getName() + " 평균:" + student3.getAvg() + " 학점:" + student3.getGrade());
	}

}
