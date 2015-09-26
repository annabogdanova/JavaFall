package JavaTaskOOP;

public class HouseUser {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		RiceCooker riceCooker = new RiceCooker();
		
		laptop.turnon();
		
		Coockable[] things = {coffeeMaker, riceCooker};
		
		collect(things);
		riceCooker.turnon();
		riceCooker.cook();
	}

	private static void collect(Coockable[] things) {
		for (Coockable coockable : things) {
			coockable.cook();
		}
	}
}
