package JavaTaskOOP;

public class CoffeeMaker extends Household implements Coockable{

	@Override
	public void cook() {
		if (super.isInOutlet)
			System.out.println("coffee making");
	}

}
