package com.hotmail.kitai974.Tempconverter;

import java.util.Scanner;
import com.hotmail.kitai974.Tempconverter.*;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------");
		System.out.println("Convertisseur Celcius Fahrenheit");
		System.out.println("--------------------------------");
		System.out.println("Celcius to Fahrenheit tape 1");
		System.out.println("Fahrenheit to Celcius tape 2");
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		if (choise == 1){
			System.out.println("Please type the value to convert :");
			sc.nextLine();
			double input = sc.nextDouble();			
			System.out.println(input + " Celcius = " + Fahrenheit(input)+ " Fahrenheit");
		}		
		else if (choise == 2){
			System.out.println("Please type the value to convert :");
			sc.nextLine();
			double input = sc.nextDouble();			
			System.out.println(input + " Fahrenheit = " + Celcius(input)+ " Celcius");
		}	
	}

	public static double Celcius(double temp){
		double result = (temp -32) * (5/9) ;
		return result;
	}
	
	public static double Fahrenheit(double temp){
		double result = temp * 9/5 + 32;
		return result;
	}
}
