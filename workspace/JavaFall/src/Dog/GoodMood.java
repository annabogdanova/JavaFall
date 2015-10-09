package Dog;


class GoodMood implements BrainState {

	private final Dog dog;

	GoodMood(Dog dog) {
		this.dog = dog;
	}

	private static final int MAX_STROKES = 3;
	int count;
	
	@Override
	public void feed() {
		this.dog.eat();
		this.dog.wag();
	}

	@Override
	public void stroke() {
		this.dog.wag(); this.dog.bark();
		count++;
		if (count >= MAX_STROKES) {
			this.dog.brainState = new BadMood(this.dog);
		}
	}
	
}