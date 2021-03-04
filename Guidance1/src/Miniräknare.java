
public class Miniräknare {

	public static void main(String[] args) {
		
		int a = 70;
		int b = 7;
		
		
		System.out.println("Addition: " + Math.addExact(a, b));
		System.out.println("Subtraktion: " + Math.subtractExact(a, b));
		System.out.println("Multiplikation: " + Math.multiplyExact(a, b));
		System.out.println("Division: " + Math.floorDiv(a, b));
		
	}

}
