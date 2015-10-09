package Dog;


class BadMood implements BrainState {

	private final Dog dog;

	BadMood(Dog dog) {
		this.dog = dog;
	}

	@Override
	public void feed() {
		this.dog.eat();
		this.dog.brainState = new GoodMood(this.dog);
	}

	@Override
	public void stroke() {
		this.dog.bite();
	}
	
}