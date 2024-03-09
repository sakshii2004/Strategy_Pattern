package duck;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
		swimBehaviour = new SwimSwim();
	}

	@Override
	void display() {
		System.out.println("This is a Mallard Duck . . . ");
	}

}
