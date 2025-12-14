void main(String[] args) {
  int age = 65;
  boolean hasLicense = true;
  boolean isStudent = false;

  // Comparison operations
  boolean isAdult = age >= 18;
  boolean canDrive = hasLicense && isAdult;
  boolean isEligible = isStudent || (age >= 18);

  // Display results
  System.out.println("\n\t\t\tDay 2 - Exercise 3: Comparison and Logical Operations\n");
  System.out.println("\t\tAge: " + age);
  System.out.println("\t\tHas License: " + hasLicense);
  System.out.println("\t\tIs Student: " + isStudent);
  System.out.println("\t\tIs Adult: " + isAdult);
  System.out.println("\t\tCan Drive: " + canDrive);
  System.out.println("\t\tIs Eligible: " + isEligible + "\n");
}
