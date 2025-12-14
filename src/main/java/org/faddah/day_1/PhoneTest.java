package org.faddah.day_1;

public class PhoneTest {
  public static void main(String[] args) {
    // Declare and initialize variables
    long phone1 = 1234567890L;
    String phone2 = "(123) 456-7890";
    String phone3 = "123-456-7890";
    String phone4 = "123.456.7890";

    if(phone1 instanceof long) {
      System.out.println("\n\t\tPhone Number 1 is Valid");
    } else {
      System.out.println("\n\t\tPhone Number 1 is NOT a valid Phone Number");
    }

    if(phone2 instanceof String) {
      System.out.println("\t\tPhone Number 2 is Valid");
    } else {
      System.out.println("\t\tPhone Number 2 is NOT a valid Phone Number");
    }

    if(phone3 instanceof String) {
      System.out.println("\t\tPhone Number 3 is Valid\n");
    } else {
      System.out.println("\t\tPhone Number 3 is NOT a valid Phone Number\n");
    }
  }
}
