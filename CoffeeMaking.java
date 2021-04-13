package coffeemachine;

public class CoffeeMaking {
	public static void brewing() {
		System.out.println("Starting to make a coffee\n" + 
				"\n" + 
				"Grinding coffee beans\n" + 
				"\n" + 
				"Boiling water\n" + 
				"\n" + 
				"Mixing boiled water with crushed coffee beans\n" + 
				"\n" + 
				"Pouring coffee into the cup\n" + 
				"\n" + 
				"Pouring some milk into the cup\n" + 
				"\n" + 
				"Coffee is ready!");
	}//end of brewing
	
	public static void brewedCoffee(int cup, Inventory inv) {
		boolean haveEnoughWater = true; 
		boolean haveEnoughMilk = true;
		boolean haveEnoughCoffeeBeans = true;
		boolean haveEnoughCoffeeCup = true; 

		if(200 * cup > inv.getWater()) {
			haveEnoughWater = false;
			System.out.println("Do not have enough water, please refill!");
		}
		if(50 * cup > inv.getMilk()) {
			haveEnoughMilk = false;
			System.out.println("Do not have enough milk, please refill!");
		}
		if(15 * cup > inv.getCoffeeBeans()) {
			haveEnoughCoffeeBeans = false;
			System.out.println("Do not have enough coffee beans, please refill!");
		}
		if(cup > inv.getCoffeeCup()) {
			haveEnoughCoffeeCup = false; 
			System.out.println("Do not have enough coffee cups, please refill!");
		}
		if(haveEnoughWater && haveEnoughMilk && haveEnoughCoffeeBeans && haveEnoughCoffeeCup) {
			brewing();
			
			inv.removeCoffeeInv(cup);
		} 
		
			
	}//end of brewedCoffee
}//end of class
