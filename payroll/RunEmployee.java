package payroll;

import java.util.*;

public class RunEmployee{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Employee e = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		PartTimeEmployee pt = new PartTimeEmployee();
		
		String name,status;
		double rph, mts;
		int hours;
		
		System.out.println("Enter name: ");
		name = sn.nextLine();
		e.setName(name);
		
		System.out.println("Press F for Full Time or P for Part Time");
		status = sn.nextLine();
			
		if(status.equalsIgnoreCase("F")) {
			System.out.print("Enter your montlhy salary: ");
			mts = sn.nextDouble();
			
			ft.setMonthlySalary(mts);
			ft.setName(name);		
			ft.Name();
		
			System.out.println("Monthly Salary: " + ft.getMonthlySalary());
		}
		
		else if(status.equalsIgnoreCase("P")) {
			System.out.println("Enter rate per hour and no. of hours worked separated by space: ");
			System.out.println("Sample: 107.50 13");	
			rph = sn.nextDouble();
			hours = sn.nextInt();
			
			pt.setWage(rph, hours);	
			pt.setName(name);		
			pt.Name();
			
			System.out.printf("Wage: " + "%.2f%n", pt.getWage());
		}
		
	}

}