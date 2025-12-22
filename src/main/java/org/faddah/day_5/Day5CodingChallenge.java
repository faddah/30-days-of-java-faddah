package org.faddah.day_5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Day5CodingChallenge {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("\n\t\t\t=== Phone Number Validator ===\n");
      System.out.print("\t\tEnter phone number: ");
      String phoneNumber = scanner.nextLine();

      String cleanPhoneNumber = phoneNumber.replaceAll("[^0-9]", "");
      int phoneLength = cleanPhoneNumber.length();
      if(phoneLength == 10) {
        String areaCode = cleanPhoneNumber.substring(0, 3);
        String middlePart = cleanPhoneNumber.substring(3, 6);
        String lastPart = cleanPhoneNumber.substring(6);
        System.out.println("\n\t\tFormatted: (" + areaCode + ") " + middlePart + "-" + lastPart);
      } else {
        System.out.println("\n\t\tInvalid Phone Number. Must be 10 digits.\n");
      }
    } catch(InputMismatchException e) {
      System.out.println("\n\t\tError: Invalid input: " + e.getMessage());
    }
  }
}
