import java.util.Scanner;

public class Miniräknare4 {

	public static void main(String[] args) {
		
		System.out.println("Calculator v. 3.0");
        while(true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 = Add\n2 = Subtract\n3 = Multiply\n4 = Divide\n5 = Exit");
            System.out.println("Please choose one of the operations: ");
            
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            switch(operation) {
            case 1:
                System.out.println("Please input the first value:");
                int firstValue = scanner.nextInt();
                System.out.println("Please input the second value:");
                int secondValue = scanner.nextInt();
                int thirdValue = firstValue + secondValue;
                System.out.println(firstValue + " plus " + secondValue + " is " + thirdValue + ".");
                break;
                
            case 2:             
                System.out.println("Please input the first value:");
                firstValue = scanner.nextInt();
                System.out.println("Please input the second value:");
                secondValue = scanner.nextInt();
                thirdValue = firstValue - secondValue;
                System.out.println(firstValue + " minus " + secondValue + " is " + thirdValue + ".");
                break;
                
            case 3:             
                System.out.println("Please input the first value:");
                firstValue = scanner.nextInt();
                System.out.println("Please input the second value:");
                secondValue = scanner.nextInt();
                thirdValue = firstValue * secondValue;
                System.out.println(firstValue + " multiplied by " + secondValue + " is " + thirdValue + ".");
                break;
                
            case 4:             
                System.out.println("Please input the first value:");
                firstValue = scanner.nextInt();
                System.out.println("Please input the second value:");
                secondValue = scanner.nextInt();
                double dividedValue = (double)firstValue / (double)secondValue;
                System.out.println(firstValue + " divided by " + secondValue + " is " + dividedValue + ".");
                break;
                
            case 5:
                scanner.close();
                System.out.println("Bye!");
                System.exit(0);
                
            default: 
                System.out.println("Please choose a number between 1 and 5.");
                break;
            }
        }

	}

}
