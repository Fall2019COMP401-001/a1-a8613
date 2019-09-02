package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {
	
	public static boolean contains(final int[] array, final int item) {
	    for (final int i : array) {
	        if (i == item) {
	            return true;
	        }
	    }
	    return false;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalGroceryTypes = scan.nextInt(); //parses line for the # of grocery types
		
		//initializes arrays for the # of times each item was purchased
		int[] purchasesPerItem = new int[totalGroceryTypes];
		
		//creates array to hold the types of groceries
		String[] groceryTypesArray = new String[totalGroceryTypes];
		
		//creates array to hold the # of customer's that bought a unique item type
		int customersPerItem[] = new int[totalGroceryTypes]; 
	
		for(int t=0; t<totalGroceryTypes; t++) {
			
			String groceryType = scan.next(); //parses line for grocery type and saves it
			double groceryPrice = scan.nextDouble(); //moves the scanner past the grocery price - it's unneeded here
			
			//iterates arrays to hold the grocery types in the store
			groceryTypesArray[0 + t] = groceryType;
			
			
		}	
		
		int customerCount = scan.nextInt(); //parses line for the # of customers
		
		
		for(int k=0; k<customerCount; k++) {
	
			String custFirstName = scan.next(); //parses line for customer's first name and saves it
			String custLastName = scan.next(); //parses line for customer's last name and saves it
		
			int customerGroceryTypeTotal = scan.nextInt(); //parses line for total unique groceries purchased by each customer and saves i
			
			int index;
			int[] indexArray = new int[customerGroceryTypeTotal];
			
			for(int f=0; f<customerGroceryTypeTotal; f++) {
			
				//parses line for the number of items purchased by the customer for that item type
				int customerTotalOneType = scan.nextInt();
				String custItemType = scan.next(); //parses line for the unique item type
							
				//Finds the array index for the specific item type
				index = Arrays.asList(groceryTypesArray).indexOf(custItemType);
				
				if(contains(indexArray, index)) {
					
					//Adds to the purchases per item by a customer
					purchasesPerItem[index] = purchasesPerItem[index] + customerTotalOneType;
				
					if(index == 0) {
						indexArray[f] = index;
						
						customersPerItem[index] = customersPerItem[index] + 1;
					}
				}
				
				else {
					
					indexArray[f] = index;
					
					customersPerItem[index] = customersPerItem[index] + 1;
					
					//Adds to the purchases per item by a customer
					purchasesPerItem[index] = purchasesPerItem[index] + customerTotalOneType;
					
				}
					
					
	
			}
					
					
				
				
				//All the arrays correspond to the same (item type) object at each index
		
		}
	
	

			
		
		
		
		
		for(int n=0; n<groceryTypesArray.length; n++) {
			
			if(purchasesPerItem[n]<1) {
				System.out.println("No customers bought " + groceryTypesArray[n]) ;
			
			}
			
				else {
					System.out.println(customersPerItem[n] + " customers bought " + purchasesPerItem[n] + " " + groceryTypesArray[n]);
				}
			
		}	
		
				
	
		
		
	

		scan.close();
}
}





