package com.Skilldistillery.app;

import java.util.Scanner;

public class MakeChange {

	double itemPrice;
	double payment;
	double numPenny = 0;
	double numNickel = 0;
	double numDime = 0;
	double numQuarter = 0;
	double numDollar = 0;
	double numFiveDollar =0;
	double numTwentyDollar =0;
	double changeNeed =0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Story one, price of item from user, store as item price
		System.out.println("Price of item?");
		double itemPrice = scan.nextDouble();
		System.out.println("Price you entered: " + itemPrice);
		
		//Story two, money given by customer, store as payment
		System.out.println("Payment amount?");
		double payment = scan.nextDouble();
		System.out.println("Cash given: " + payment);
		
		//Story three, check to see if price is < payment, display
		if ( itemPrice > payment ) {
			System.out.println("ERROR. Insufficient payment");
			
		} 
		else if (itemPrice <= payment) {
			double change = (payment - itemPrice);
			System.out.println("Change: " + change);

			double changeInCents = (change *100);
		
			while (changeInCents >0) {
				if (changeInCents >= 2000) {
					double numTwenties = (changeInCents / 2000);
					changeInCents -= 2000;
					System.out.println("Twenties:" + numTwenties );
				}
				else if(changeInCents>= 1000) { 
					double numTenDollars = (changeInCents / 1000);
					changeInCents -= 1000;
					System.out.println("Tens:" + numTenDollars );
				}
				else if(changeInCents>= 500) { 
					double numFiveDollars = (changeInCents / 500);
					changeInCents -= 500;
					System.out.println("Fives:" + numFiveDollars );
				}
				else if(changeInCents>= 100) { 
					double numDollars = (changeInCents / 100);
					changeInCents -= 100;
					System.out.println("Dollars:" + numDollars );
				}
				else if(changeInCents >= 25) { 
					double numQuarters = (changeInCents / 25);
					changeInCents -= 25;
					System.out.println("Quarters:" + numQuarters );
				}
				else if(changeInCents >= 10 ) { 
					double numDimes = (changeInCents / 10);
					changeInCents -= 10;
					System.out.println("Dimes:" + numDimes );
				}
				else if(changeInCents >= 5) { 
					double numNickels = (changeInCents / 5);
					changeInCents -= 5;
					System.out.println("Nickels:" + numNickels );
				}
				else if (changeInCents >= 1) { 
					double numPennies = (changeInCents / 1);
					changeInCents -= 1;
					System.out.println( "Pennies:" + numPennies );
				}
							}// close while
		} // close else if
		
	} //main method
	
} //class close curlys
		
		
	//IM SO CLOSEE.
// My program fulfills the required parameters, just not the exact way
//... please go easy on me.
		
		
	
	


