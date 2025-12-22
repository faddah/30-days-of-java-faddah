import java.util.Scanner;

public class NameFormatter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n\t\t\t=== Name Formatter ===\n");

    System.out.print("\t\tEnter your first name: ");
    String firstName = scanner.nextLine();

    System.out.print("\t\tEnter your last name: ");
    String lastName = scanner.nextLine();

    // Format the name in different ways
    String fullName = firstName + " " + lastName;
    String formalName = lastName + ", " + firstName;
    String initials = firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    String upperFullName = fullName.toUpperCase();

    System.out.println("\n\t\t\t=== Formatted Names ===\n");
    System.out.println("\t\tFull Name: " + fullName);
    System.out.println("\t\tFormal Name: " + formalName);
    System.out.println("\t\tInitials: " + initials);
    System.out.println("\t\tUppercase: " + upperFullName);

    scanner.close();
  }
}