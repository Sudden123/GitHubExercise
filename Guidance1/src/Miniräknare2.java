import java.util.Scanner;

public class Miniräknare2 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println("Skriv din första siffra: ");
		int värde1 = a.nextInt();
		System.out.println("Skriv din andra siffra: ");
		int värde2 = b.nextInt();
		
		
		System.out.println("Addition: " + Math.addExact(värde1, värde2));
		System.out.println("Subtraktion: " + Math.subtractExact(värde1, värde2));
		System.out.println("Multiplikation: " + Math.multiplyExact(värde1, värde2));
		System.out.println("Division: " + Math.floorDiv(värde1, värde2));
		
		a.close();
		b.close();
	}

}
