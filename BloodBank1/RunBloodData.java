package BloodBank1;

import java.util.*;

class BloodData{
	
	private static String bloodType;
	private static String rhFactor;
	
	BloodData(){
		bloodType = "O";
		rhFactor = "+";
	}
	
	BloodData(String bt, String rh){
		bloodType = bt;
		rhFactor = rh;
	}
	
	public void setBloodType(String bt) {
		bloodType = bt;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	public void setRhFactor(String rh) {
		rhFactor = rh;
	}
	
	public String getRhFactor() {
		return rhFactor;
	}
	
	public static void display() {
		System.out.println("Enter blood type of patient: ");
		System.out.println("Enter the Rhesus factor (+ or -): ");
		System.out.println(bloodType + rhFactor + " is addded to the blood bank." + "\n");	
	
	}
}

public class RunBloodData {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String input1, input2;
		
		BloodData bd = new BloodData();
		
		bd.display();
		
		System.out.print("Enter blood type of patient: ");
		input1 = sn.nextLine();
		bd.setBloodType(input1);
		
		System.out.print("Enter the Rhesus factor (+ or -): ");
		input2 = sn.nextLine();
		bd.setRhFactor(input2);

		System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
	}

}
