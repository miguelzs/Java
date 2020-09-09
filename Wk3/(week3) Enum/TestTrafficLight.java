public class TestTrafficLight {
	public static void main(String[] args) {
		TrafficLight tl1 = TrafficLight.GREEN;
		System.out.print(tl1.getDescription());
		switch (tl1) {
			case RED:
				System.out.println(" !!!");
				break;
			case GREEN:
				System.out.println(", Lucky you!");	
				break;
			default:
				System.out.println(" it is about to change. ");	
		}
	}
}