package AmountDue;

import java.util.*;


public class RunAmountDue {
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		double amountDue;
		
		int ans;
		
		System.out.println("Press any of the following then enter values separated by spaces:");
		
		System.out.println("1 - Price only");
		
		System.out.println("2 - Price and quantity");
		
		System.out.println("3 - Price, quantity, and discount amount");
		
		ans = sn.nextInt();
		
		if(ans == 1) {
			amountDue = AmountDue.computeAmountDue(sn.nextDouble());
			System.out.println("Amount due is " + amountDue);
		}
		
		else if(ans == 2) {
			amountDue = AmountDue.computeAmountDue(sn.nextDouble(), sn.nextDouble());
			System.out.println("Amount due is " + amountDue);
		}
		
		else if(ans == 3) {
			amountDue = AmountDue.computeAmountDue(sn.nextDouble(), sn.nextDouble(), sn.nextDouble());
			System.out.println("Amount due is " + amountDue);
			
		}
		
		else {
			System.out.println("Invalid input!");
		}
		
		
	}

}
