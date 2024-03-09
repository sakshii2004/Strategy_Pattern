package duck;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
		swimBehaviour = new SwimSwim();
	}

	@Override
	void display() {
		System.out.println("This is a Redhead Duck . . . ");
	}

}
