import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n\t\t\t=== Temperature Converter ===\n");

    System.out.print("\t\tEnter temperature in Celsius: ");
    double celsius = scanner.nextDouble();

    // Convert to Fahrenheit: F = C × 9/5 + 32
    double fahrenheit = celsius * 9.0 / 5.0 + 32;

    // Convert to Kelvin: K = C + 273.15
    double kelvin = celsius + 273.15;

    // Display results
    System.out.println("\n\t\t\t=== Temperature Conversions ===\n");
    System.out.printf("\t\tCelsius: %.2f°C%n", celsius);
    System.out.printf("\t\tFahrenheit: %.2f°F%n", fahrenheit);
    System.out.printf("\t\tKelvin: %.2f K%n\n", kelvin);

    scanner.close();
  }
}