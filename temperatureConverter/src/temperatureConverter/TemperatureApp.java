package temperatureConverter;

import java.util.Scanner;

public class TemperatureApp {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of fahrenhit to convert to celsius");
		double fahrenheit=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double temp=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(temp);
	}

	
}