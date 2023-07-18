package workshop05.sub04;

public class Company {

	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {
		
	}

	public Company(double salary) {
		this.salary = salary;
	}

	public double getIncome() {
		income = salary * 12;
		return income;
	}

	public double getAfterTaxIncome() {
		getIncome();
		afterTaxIncome = income * 0.9;
		return afterTaxIncome;
	}

	public double getBonus() {
		bonus = (salary * 0.2) * 4;
		return bonus;
	}

	public double getAfterTaxBonus() {
		getBonus();
		afterTaxBonus = bonus * 0.945;
		return afterTaxBonus;
	}
}
