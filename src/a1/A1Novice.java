package a1;

import java.util.Scanner;

public class A1Novice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		// Your code follows here.
		
		int customerCount = scan.nextInt(); // read user input for number of customers
		
		System.out.println();
		
		for(int n=0; n<customerCount; n++) {
			
			double customerTotal = 0;
		
			String firstName = scan.next(); //parses customer's first name and saves it
			
			char firstInitial = firstName.charAt(0);
			
			String lastName = scan.next(); //parses customer's second name and saves it
			
			int uniqueItemCount = scan.nextInt(); //parses number of unique items the customer purchased
			
			int i = 0;
			
			while(i<uniqueItemCount) {
								
				double itemCount = scan.nextInt(); //parses the item amount for an item type and saves it
				
				String itemName = scan.next(); //parses the unique item name and saves it
				
				double itemPrice = scan.nextDouble(); //parses the price for a single quantity of the item type
				
				double itemTotal = itemCount * itemPrice; /*finds the total amount spent by the customer by multiplying the 
				item type price by the number of items purchased */
				
				customerTotal = itemTotal + customerTotal; //adds the total cost of each item to the total amount spent through each iteration
				
				i++;
				
			}
			
			System.out.println(firstInitial + ". " + lastName + ": " + customerTotal);
				
		}
		

		scan.close();
	}
		
}
	
