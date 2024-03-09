package duck;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Duck Quacks *quack quack* ");
	}

}
