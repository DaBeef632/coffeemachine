package coffeemachine;

public class Inventory {
		private int water;
		private int milk;
		private int coffeeBeans;
		private int coffeeCup;
		
	public Inventory() {
		this.water = 5000; 
		this.milk = 1250; 
		this.coffeeBeans = 375; 
		this.coffeeCup = 25; 
	}//empty constructor
		
	public void inventoryRefill() {
		this.water = 5000; 
		this.milk = 1250; 
		this.coffeeBeans = 375; 
		this.coffeeCup = 25; 
	}//end inventoryRefill
	
	public void inventoryAdjustment() {
		
	}// end investadjustment

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public int getCoffeeBeans() {
		return coffeeBeans; 
	}

	public void setCoffeeBeans(int coffeeBeans) {
		this.coffeeBeans = coffeeBeans;
	}

	public int getCoffeeCup() {
		return coffeeCup;
	}

	public void setCoffeeCup(int coffeeCup) {
		this.coffeeCup = coffeeCup;
	}
	public void removeCoffeeInv(int cup) {
		
		this.water -= 200 * cup;
		this.milk  -= 50 * cup;
		this.coffeeBeans -= 15 * cup;
		this.coffeeCup -= 1 * cup; 
	}
	
	public int remainingCupsOfCoffee(int cup) {
		return this.coffeeCup;
	}
}
