package duck;

public class FlyWithWings implements FlyBehavior {
	
	@Override
	public void fly() {
		System.out.println("The duck is flying with wings! *flap flap* ");
	}
	
}
