package coffeemachine;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
		
		int cup = 25; 
		boolean repeat = true;
		Inventory inv = new Inventory();
		Scanner input = new Scanner(System.in);
		while(repeat) {
		
		System.out.println("Please Select 1, 2, 3, 4");
		System.out.println(" 1-Coffee, 2-Espresso, 3-Latte, 4-Cold Brew, 5-Refill?");
		int selection = input.nextInt();
		
		switch (selection) {
		case 1 : 
			System.out.println("You Selected coffee!");
			//CoffeeMaking.brewing();
			//CoffeeMaking.brewedCoffee(cup, inv);
			
			break;
		case 2 : 
			System.out.println("You Selected Espresso!");
			CoffeeMaking.brewing();
			break;
		case 3 : 
			System.out.println("You Selected Latte!");
			CoffeeMaking.brewing();
			break;
		case 4 : 
			System.out.println("You Selected Cold Brew!");
			CoffeeMaking.brewing();
			break;
		case 5 :
			System.out.println("Business is booming!");
			inv.inventoryRefill();
			System.out.println("Coffee Machine is refilled!");
			
			continue;
			
		default : 
			System.out.println("Oh my, You did not select 1, 2, 3, 4, 5");
			
		}//end of swit1ch
		System.out.println("How many cups do you want?");
		selection =input.nextInt(); 
		System.out.println("-----------------");
		//System.out.println("We can make " + inv.remainingCupsOfCoffee(cup)-selection+ " cups");
		System.out.println("-----------------");
		CoffeeMaking.brewedCoffee(selection, inv);
		}//end of while loop
	}//end of main
}//end of class
