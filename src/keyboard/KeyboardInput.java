package keyboard;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your number");
		int number=input.nextInt();
		System.out.println("enter your name");
		String name=input.next();
		System.out.println("enter your media");
		double media=input.nextDouble();
		System.out.println(number+"  "+name+" "+media);
		input.close();

	}

}
