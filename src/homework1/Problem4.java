package homework1;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Name:");
		String name = input.next();
		System.out.print("Enter Age: ");
		int age = input.nextInt();
		System.out.printf("Hello, my name is %s and I am %s years old", name, age);
		input.close();
	}

}
