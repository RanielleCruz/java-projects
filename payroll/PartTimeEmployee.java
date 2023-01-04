package payroll;

public class PartTimeEmployee extends Employee {
	private double ratePerHour;
	private int hoursWorked;
	private double wage;
	
	public void setWage(double ratePerHour, int hoursWorked) {
		this.ratePerHour = ratePerHour;
		this.hoursWorked = hoursWorked;
		
		wage = this.ratePerHour * this.hoursWorked;
		
	}
	
	public double getWage() {
		return wage;
	}	

}
