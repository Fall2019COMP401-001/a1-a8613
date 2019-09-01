package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//parses the line for number of grocery types and saves it
		int totalGroceryTypes = scan.nextInt();
		int i = 0;
		int n = 0;
		
		int maxIndex = 0;
		int minIndex = 0;
		
		String[] groceryTypesArray = new String[totalGroceryTypes];
		double[] groceryPricesArray = new double[totalGroceryTypes];
		String[] custNamesArray = new String[totalGroceryTypes];
	
		for(int t=0; t<totalGroceryTypes; t++) {
			
			String groceryType = scan.next(); //parses line for grocery type and saves it
			double groceryPrice = scan.nextDouble(); //parses line for grocery price and saves it
			
			//iterates arrays to hold the grocery types and prices of the store
			groceryTypesArray[0 + t] = groceryType;
			groceryPricesArray[0 + t] = groceryPrice;
			
			
		}
		
		int customerCount = scan.nextInt(); //parses line for the # of customers

		double[] customerTotalArray = new double[customerCount];
		
		
		for(int k=0; k<customerCount; k++) {
			
			double itemTotal = 0;
			double customerTotal = 0;
			
			String custFirstName = scan.next(); //parses line for customer's first name and saves it
			String custLastName = scan.next(); //parses line for customer's last name and saves it
			
			custNamesArray[0 + k] = custFirstName + " " + custLastName; //creates an array that saves customer's names through each iteration
			
			int custGroceryTypeTotal = scan.nextInt(); //parses line for total unique groceries purchased by each customer and saves it
			
			for(int f=0; f<custGroceryTypeTotal; f++) {
			
				int custTotalOneType = scan.nextInt(); 
				String custItemType = scan.next();
			
				int arrayIndex = Arrays.asList(groceryTypesArray).indexOf(custItemType);
			
				double itemPrice = groceryPricesArray[arrayIndex];
			
				itemTotal = itemPrice * custTotalOneType;
				
				customerTotal = itemTotal + customerTotal;
				
				//All the arrays correspond to the same customer object at the same index
			
			}
			
			customerTotalArray[0 + k] = customerTotal;
			
			
		}
		
		double max = customerTotalArray[0];
		double min = customerTotalArray[0];
			
			for(int r=0; r<customerTotalArray.length; r++) {
				
				if(customerTotalArray[r]>max) {
					max = customerTotalArray[r];
					maxIndex = r;
		
			}

			}
			
			
			for(int v = 0; v<customerTotalArray.length; v++) {
				
				if(customerTotalArray[v]<min) {
					min = customerTotalArray[v];
					minIndex = v;
			
		}
			
		}
			
			double allCustomerTotal = 0;
			
			for(int p=0; p<customerTotalArray.length; p++) {
				
				allCustomerTotal = customerTotalArray[p] + allCustomerTotal; 
		}
		
			double customerAvg = allCustomerTotal/customerCount;
			
			String maxCustomerName = custNamesArray[maxIndex];
			String minCustomerName = custNamesArray[minIndex];
			
			System.out.println("Biggest: " + maxCustomerName + " (" + String.format("%,.2f", max) + ")");
			System.out.println("Smallest: " + minCustomerName + " (" + String.format("%,.2f", min) + ")");
			System.out.println("Average: " + String.format("%,.2f", customerAvg));
			
			scan.close();
				
		}
		
	
	}

	

