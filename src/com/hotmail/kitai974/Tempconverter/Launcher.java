package com.hotmail.kitai974.Tempconverter;

import java.util.Scanner;
import com.hotmail.kitai974.Tempconverter.Converter;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("! Convertisseur Celcius Fahrenheit !");
		System.out.println("------------------------------------");
		System.out.println("Celcius to Fahrenheit tape 1");
		System.out.println("Fahrenheit to Celcius tape 2");
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		if (choise == 1){
			System.out.println("Please type the value to convert :");
			sc.nextLine();
			double input = sc.nextDouble();			
			System.out.println(input + " Celcius = " + Converter.arrondi(Converter.Fahrenheit(input),2)+ " Fahrenheit");
		}		
		else if (choise == 2){
			System.out.println("Please type the value to convert :");
			sc.nextLine();
			double input = sc.nextDouble();
			System.out.println(input + " Fahrenheit = " + Converter.arrondi(Converter.Celcius(input),2)+ " Celcius");
		}	
	}

}
