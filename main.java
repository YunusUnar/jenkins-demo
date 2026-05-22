import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Java Calculator ===");
        
        // User se pehla number lena
        System.out.print("Pehla number enter karein: ");
        double num1 = scanner.nextDouble();
        
        // User se operator lena (+, -, *, /)
        System.out.print("Operator enter karein (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // User se doosra number lena
        System.out.print("Doosra number enter karein: ");
        double num2 = scanner.nextDouble();
        
        double result;

        // Operator ke mutabiq calculation karna
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
                
            case '/':
                // Check karna ke zero se divide na ho raha ho
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Zero (0) se divide nahi kiya ja sakta!");
                }
                break;
                
            default:
                System.out.println("Error: Ghalat operator enter kiya hai!");
                break;
        }
        
        System.out.println("==============================");
        scanner.close();
    }
}
