package duck;

abstract public class Duck {
	FlyBehavior flyBehaviour;
	QuackBehaviour quackBehaviour;
	SwimBehaviour swimBehaviour;
	
	public SwimBehaviour getSwimBehaviour() {
		return swimBehaviour;
	}

	public void setSwimBehaviour(SwimBehaviour sm) {
		swimBehaviour = sm;
	}

	public FlyBehavior getFlyBehaviour() {
		return flyBehaviour;
	}
	
	public void setFlyBehaviour(FlyBehavior fb) {
		flyBehaviour = fb;
	}
	
	public QuackBehaviour getQuackBehaviour() {
		return quackBehaviour;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
	
	abstract void display(); //abstract method
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}	
	
	public void performSwim() {
		swimBehaviour.swim();
	}
}
