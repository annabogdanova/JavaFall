package JavaTaskOOP;

public class Household extends Appliances{

	boolean isInOutlet;
	
	@Override
	void turnon() {
		isInOutlet = true;
		System.out.println("household app is turned on");
	}

}
