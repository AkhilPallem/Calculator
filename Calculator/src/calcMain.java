import java.util.Scanner;

public class calcMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator!");
		System.out.println("For this program we are going to need two numbers from you");
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = myObj.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = myObj.nextDouble();
		calcMethods calculate = new calcMethods(num1, num2);
	
		Scanner new1 = new Scanner(System.in);
		System.out.println("What operator would you like to use: (+, -, %, *): ");
		String operator = new1.nextLine();
		
		if (operator.equals("+")) {
            System.out.println(calculate.add());
        } 
		else if (operator.equals("*")) {
            System.out.println(calculate.multiply());
        } 
		else if (operator.equals("-")) {
            System.out.println(calculate.subtract());
        } 
		else if (operator.equals("%")) {
            System.out.println(calculate.mod());
        }
    }


}

