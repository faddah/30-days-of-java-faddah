void main(String[] args) {
    String text = "Java Programming is Fun!";

    System.out.println("\n\t\t\t=== String Analysis ===");
    System.out.println("\t\tOriginal text: " + text);
    System.out.println("\t\tLength: " + text.length());
    System.out.println("\t\tFirst character: " + text.charAt(0));
    System.out.println("\t\tLast character: " + text.charAt(text.length() - 1));
    System.out.println("\t\tUppercase: " + text.toUpperCase());
    System.out.println("\t\tLowercase: " + text.toLowerCase());
    System.out.println("\t\tContains 'Java': " + text.contains("Java"));
    System.out.println("\t\tStarts with 'Java': " + text.startsWith("Java"));
    System.out.println("\t\tEnds with 'Fun!': " + text.endsWith("Fun!") + "\n");
}
  