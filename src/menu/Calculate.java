package menu;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s="y";
		do {
		System.out.println("please add a number");
		float firstNum=input.nextFloat();
		System.out.println("add second number");
		float seconfNum=input.nextFloat();
		System.out.println("select one of mach operation:(+,-,/,*):");
		String operation=input.next();
		switch(operation){
		case "+": float sum=firstNum+seconfNum;
		System.out.println("firstNum+seconfNum:"+sum);
		break;
		case "-":float minus=firstNum-seconfNum;
		System.out.println("firstNum-seconfNum:"+minus);
		break;
		case "*":float multiply=firstNum*seconfNum;
		System.out.println("firstNum*seconfNum:"+multiply);
		break;
		case "/":float divid=firstNum/seconfNum;
		System.out.println("firstNum/seconfNum:"+divid);
		}
		System.out.println("do you want perform other operation:(y/n)");
		s=input.next();
		}while(s.equals("y"));
		System.out.println("tank you for using this calculator , see you next time");
		input.close();
		
	}
				}
