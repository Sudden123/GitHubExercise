import java.util.Scanner;

public class Minir�knare2 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println("Skriv din f�rsta siffra: ");
		int v�rde1 = a.nextInt();
		System.out.println("Skriv din andra siffra: ");
		int v�rde2 = b.nextInt();
		
		
		System.out.println("Addition: " + Math.addExact(v�rde1, v�rde2));
		System.out.println("Subtraktion: " + Math.subtractExact(v�rde1, v�rde2));
		System.out.println("Multiplikation: " + Math.multiplyExact(v�rde1, v�rde2));
		System.out.println("Division: " + Math.floorDiv(v�rde1, v�rde2));
		
		a.close();
		b.close();
	}

}
