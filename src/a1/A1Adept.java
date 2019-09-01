package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		/*creates an instance for two arrays that will hold the price/type data
		and help it persist past the for loop */
		String[] groceryTypesArray;
		double[] groceryPricesArray;
		String [] custNamesArray;
		
		//parses the line for number of grocery types and saves it
		int totalGroceryTypes = scan.nextInt();
		
		for(int n=0; n<totalGroceryTypes; n++) {
			
			String groceryType = scan.next(); //parses line for grocery type and saves it
			double groceryPrice = scan.nextDouble(); //parses line for grocery price and saves it
			
			//creates arrays to hold the grocery types and their respective prices in the store
			groceryTypesArray = new String[totalGroceryTypes];
			groceryPricesArray = new double[totalGroceryTypes];
			
			//iterates arrays to hold the grocery types and prices of the store
			groceryTypesArray[0 + n] = groceryType;
			groceryPricesArray[0 + n] = groceryPrice;
			
		}
		
		int customerCount = scan.nextInt(); //parses line for the # of customers
		
		String[] custNamesArray; 
		double[] customerTotalArray;
		
		for(int i=0; i<customerCount; i++) {
			
			double customerTotal = 0;
			double itemTotal = 0;
			
			String custFirstName = scan.next(); //parses line for customer's first name and saves it
			String custLastName = scan.next(); //parses line for customer's last name and saves it
			
			custNamesArray[0 + i] = custFirstName + custLastName; //creates an array that saves customer's names through each iteration
			
			int custGroceryTypeTotal = scan.nextInt(); //parses line for total unique groceries purchased by each customer and saves it
			
			for(int n=0; n<custGroceryTypeTotal; n++) {
			
				int custTotalOneType = scan.nextInt(); 
				String custItemType = scan.next();
			
				int arrayIndex = Arrays.asList(groceryTypesArray).indexOf(custItemType);
			
				double itemPrice = groceryPricesArray[arrayIndex];
			
				itemTotal = itemPrice * custTotalOneType;
			
				customerTotal = itemTotal + customerTotal;
				
				customerTotalArray[0 + i] = customerTotal; 
			
				
				//All the arrays correspond to the same customer object at the same index
			
			}
			
		}
		
		double max = 0;
		int n = 0;
		 
		while(n<customerTotalArray.length) {
			
			if(customerTotalArray[n]>max) {
				max = customerTotalArray[n];
		
		}
			
			n++;	
		
			}
		
		double min = 0;
		int i = 0;
		
		while(i<customerTotalArray.length) {
			
			if(customerTotalArray[i]<min) {
				min = customerTotalArray[n];
		
		
		
	}
		i++;
	
		
	}
		
		double customerTotal = 0;
		
		for(int p=0; p<customerTotalArray.length; p++) {
			
			customerTotal = customerTotalArray[p] + customerTotal;
				
		}
		
		double customerAvg = customerTotal/customerCount;
		
		String maxCustomerName = custNamesArray[n];
		String minCustomerName = custNamesArray[i];
		
		System.out.println("Biggest")
		
		scan.close();
	}
}
	

