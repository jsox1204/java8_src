package edu;

public class Exercise01 {

	public static void main(String[] args) {
		
		String account = "01-123-456"; // 은행 계좌번호
		long balance = 0; // 잔액
		long deposit = 0; // 입급액
		long withdraw = 0; // 출금액
		double rate = 3.3; // 은행 이율
		double interest = 0.0; // 이자 금액
		
		deposit = 5000000000L;
		balance += deposit;
		withdraw = 2000000000L;
		balance -= withdraw;
		interest = balance * rate;
		balance += interest;
		
		System.out.println(String.format("계좌 %s의 잔액은 %d입니다.", account, balance));
	}

}
