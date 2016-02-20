package com.hotmail.kitai974.Tempconverter;

public class Converter {

	public static double Celcius(double temp){
		double result = ((temp -32) * 5/9) ;
		return result;
	}
	
	public static double Fahrenheit(double temp){
		double result = temp * 9/5 + 32;
		return result;
	}
	
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
	
}
