import java.util.Scanner;
import java.util.InputMismatchException;

public class Day4CodingChallenge {
  public static void main(String[] args) {
    // Create Scanner
    try { Scanner scanner = new Scanner(System.in);
      // Prompt and read principal, rate, time (years)
      System.out.println("\n\t\t\t=== Compound Interest Calculator ===\n");
      System.out.print("\t\tEnter principal amount: ");
      double principal = scanner.nextDouble();

      System.out.print("\t\tEnter annual interest rate (as decimal): ");
      double rate = (scanner.nextDouble()) / 100.0;

      System.out.print("\t\tEnter time period (years): ");
      double time = scanner.nextDouble();

      // Compute finalAmount = principal * Math.pow(1 + rate, time)
      double finalAmount = principal * Math.pow(1 + rate, time);

      // Compute interestEarned = finalAmount - principal
      double interestEarned = finalAmount - principal;

      // Print results with 2 decimal places
      System.out.printf("\n\t\tFinal Amount: $%.2f%n", finalAmount);
      System.out.printf("\t\tInterest Earned: $%.2f%n%n", interestEarned);

      scanner.close();
    } catch(InputMismatchException e) {
      System.out.println("Error: Invalid input: " + e.getMessage());
    }
  }
}