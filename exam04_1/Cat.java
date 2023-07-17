package exam04_1;


public class Cat {
	
	String name;
	int age;
	String sex;
	
	// 생성자, 인자 리스트가 다르면 구별 가능 ==> 오버로딩(overloading) 생성자
	public Cat() {} // 기본생성자(default constructor) 기본 생성자는 명시적으로 생성자를  안 만든 경우에만 자동생성
	public Cat(String str) {}
	public Cat(int num) {}
	public Cat(String str, int num) {}
	public Cat(int num, String str) {}
	
	/**
	 * 고양이에 대한 정보 입력 함수
	 * @param str 고양이의 이름
	 * @param num 고양이의 나이
	 * @param str2 고양이의 성별
	 */
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex; 
	}
}
