package Dog;

public class Dog {

	public BrainState brainState = new BadMood(Dog.this);
	
	
	public void feed() {
		System.out.println("--> feed dog");
		brainState.feed();
	}

	public void stroke() {
		System.out.println("--> stroke dog");
		brainState.stroke();
	}
	
	// private body methods
	
	void bite() {
		System.out.println("bites");
	}

	void bark() {
		System.out.println("barks");
	}

	void eat() {
		System.out.println("eats");
	}

	void wag() {
		System.out.println("wags");
	}

}
