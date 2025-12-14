void main() {
  String text = "Hello Java World";

  System.out.println("\n\t\t\t=== Coding Challenge String Analysis ===\n");
  // Display the original text
  System.out.println("\t\tOriginal text: " + text);
  // Get the length of the string
  System.out.println("\t\tLength: " + text.length());
  // Get the first and last characters
  System.out.println("\t\tFirst character: " + text.charAt(0));
  System.out.println("\t\tLast character: " + text.charAt(text.length() - 1));
  // Convert to uppercase and lowercase
  System.out.println("\t\tUppercase: " + text.toUpperCase());
  System.out.println("\t\tLowercase: " + text.toLowerCase());
  // Check if it contains "Java"
  System.out.println("\t\tContains 'Java': " + text.contains("Java"));
  // Check if it starts with "Hello"
  System.out.println("\t\tStarts with 'Hello': " + text.startsWith("Hello"));
  // Check if it ends with "World"
  System.out.println("\t\tEnds with 'World': " + text.endsWith("World") + "\n");
  // Display all results
}
