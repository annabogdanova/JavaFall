package JavaTaskOOP;

public class RiceCooker extends Household implements Coockable{

	@Override
	public void cook() {
		if (super.isInOutlet)
			System.out.println("rice cooking");
		else
			System.out.println("turn on the rice cooker");
	}

}
