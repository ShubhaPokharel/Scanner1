import java.util.Scanner;

class Main{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter first number:");
	int num1 = s.nextInt();

	System.out.println("Enter second number:");
	int num2 = s.nextInt();

	int res;
	res = num1 + num2;
	System.out.println("Result: " + res);
	}
}