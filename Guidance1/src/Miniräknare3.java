import java.util.Scanner;

public class Miniräknare3 {

	public static void main(String[] args) {
		
		
		
		while(true) {
			
			Scanner a = new Scanner(System.in);
			Scanner b = new Scanner(System.in);
			
			System.out.print("Skriv din första siffra: ");
			double värde1 = a.nextInt();
			System.out.print("Skriv din andra siffra: ");
			double värde2 = b.nextInt();
			
			System.out.println("Välj operation: ");
			System.out.println("1. Addition:\n2. Subtraktion:\n3. Multiplikation:\n4. Division:\n5. Avsluta: ");
						
			Scanner val = new Scanner(System.in);
			
			int operation = val.nextInt();
			
			double sum = värde1+värde2;
			double sub = värde1-värde2;
			double mul = värde1*värde2;
			double div = värde1/värde2;
			
			if(operation == 1) {
				
				System.out.println("Svar: " + sum);
				//System.out.println("Använd förra svaret som första tal? Tryck 1 ");
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
				
				System.out.println("Miniräknare har stängts av");
				System.exit(0);
			}
			val.close();
			a.close();
			b.close();
		}

	}

}
