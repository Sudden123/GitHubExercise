import java.util.Scanner;

public class Minir�knare3 {

	public static void main(String[] args) {
		
		
		
		while(true) {
			
			Scanner a = new Scanner(System.in);
			Scanner b = new Scanner(System.in);
			
			System.out.print("Skriv din f�rsta siffra: ");
			double v�rde1 = a.nextInt();
			System.out.print("Skriv din andra siffra: ");
			double v�rde2 = b.nextInt();
			
			System.out.println("V�lj operation: ");
			System.out.println("1. Addition:\n2. Subtraktion:\n3. Multiplikation:\n4. Division:\n5. Avsluta: ");
						
			Scanner val = new Scanner(System.in);
			
			int operation = val.nextInt();
			
			double sum = v�rde1+v�rde2;
			double sub = v�rde1-v�rde2;
			double mul = v�rde1*v�rde2;
			double div = v�rde1/v�rde2;
			
			if(operation == 1) {
				
				System.out.println("Svar: " + sum);
				//System.out.println("Anv�nd f�rra svaret som f�rsta tal? Tryck 1 ");
			}
			
			if(operation == 2) {
				
				System.out.println("Svar: " + sub);
				
			}
			
			if(operation == 3) {
				
				System.out.println("Svar: " + mul);
				
			}
			
			if(operation == 4) {
				
				System.out.println("Svar: " + div);
			}
			
			if(operation > 5) {
				
				System.out.println("Ej giltigt val: ");
			}
			
			if(operation == 5) {
				
				System.out.println("Minir�knare har st�ngts av");
				System.exit(0);
			}
			val.close();
			a.close();
			b.close();
		}

	}

}
