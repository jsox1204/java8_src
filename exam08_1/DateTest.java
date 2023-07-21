package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws Exception {

		// 날짜 데이터
		
		Date d = new Date();
		
		System.out.println(d); // d.toString(), 재정의
		
		// java.text.SimpleDateFormat 클래스와 병행하여 사용
		// 가. Date 타입 ---> String
		/*
		 * 날짜 포맷
		 * 년도 : yyyy
		 * 월: 	MM
		 * 일: 	dd
		 * 시간:	HH
		 * 분: 	mm
		 * 초:	ss
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss E");
		String result = sdf.format(d);
		System.out.println(result);
		
		// 나. String --> Date
		String s = "2023년05월13일";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		Date d2 = sdf2.parse(s);
		System.out.println(d2);
		
		// date를 Calendar로
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
	}

}
