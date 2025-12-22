package org.faddah.day_5;

import java.util.Scanner;

public class StringAnalyzer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n\t\t\t=== String Analyzer ===");
    System.out.print("\t\tEnter a sentence: ");
    String sentence = scanner.nextLine();

    // Analyze the string
    int length = sentence.length();
    String upperCase = sentence.toUpperCase();
    String lowerCase = sentence.toLowerCase();
    String trimmed = sentence.trim();

    System.out.println("\n\t\t\t=== Analysis Results ===");
    System.out.println("\n\t\tOriginal: '" + sentence + "'");
    System.out.println("\t\tLength: " + length + " characters");
    System.out.println("\t\tUppercase: " + upperCase);
    System.out.println("\t\tLowercase: " + lowerCase);
    System.out.println("\t\tTrimmed: '" + trimmed + "'\n");

    // Check for specific words
    if (sentence.toLowerCase().contains("java")) {
      System.out.println("\t\tContains 'Java': Yes\n");
    } else {
      System.out.println("\t\tContains 'Java': No\n");
    }

    scanner.close();
  }
}