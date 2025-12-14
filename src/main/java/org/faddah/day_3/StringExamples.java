void main() {
    System.out.println("\n\n\t\tDay 3 Exercise 1\n");
    String message = "Hello, World!";
    String name = "Alice";
    String empty = "";  // Empty string
    System.out.println("\t\t" + message);
    System.out.println("\t\t" + name);
    System.out.println("\t\t" + empty);

    int number = 42;
    String numberAsString = String.valueOf(number);  // "42"
    System.out.println("\t\t" + numberAsString);

    double price = 19.99;
    String priceAsString = String.valueOf(price);    // "19.99"
    System.out.println("\t\t" + priceAsString);

    String text = "Hello, Java!";

    // Get string length
    int length = text.length();  // 12
    System.out.println("\t\tText: " + text);
    System.out.println("\t\tText length: " + text.length());

    // Get character at specific position
    char firstChar = text.charAt(0);  // 'H'
    char lastChar = text.charAt(text.length() - 1);  // '!'
    System.out.println("\t\tText First Char: " + firstChar);
    System.out.println("\t\tText Last Char: " + lastChar + "\n");

    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = "hello";

    // Compare strings (use .equals() not ==)
    boolean isEqual = str1.equals(str2);     // true
    boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);  // true
    System.out.println("\t\tstr1: " + str1);
    System.out.println("\t\tstr2: " + str2);
    System.out.println("\t\tstr3: " + str3);
    System.out.println("\t\tAre str1 & str2 Equal?: " + isEqual);
    System.out.println("\t\tAre str1 & str3 Equal, Ignoring Case?: " + isEqualIgnoreCase);

    // Check if string starts or ends with specific text
    boolean startsWith = str1.startsWith("He");  // true
    boolean endsWith = str1.endsWith("lo");      // true
    System.out.println("\t\tDoes st1 Starts With the Chars \"He\"?: " + startsWith);
    System.out.println("\t\tDoes st1 Ends With the Chars \"lo\"?: " + endsWith + "\n");

    // String Manipulation
    String original = "  Hello, World!  ";

    // Remove whitespace from beginning and end
    String trimmed = original.trim();  // "Hello, World!"
    System.out.println("\t\tOriginal String: " + original);
    System.out.println("\t\tOriginal String, Trimmed: " + trimmed);

    // Convert to uppercase and lowercase
    String upper = original.toUpperCase();  // "  HELLO, WORLD!  "
    System.out.println("\t\tOriginal String to ALL UPPER CASE: " + upper);
    String lower = original.toLowerCase();  // "  hello, world!  "
    System.out.println("\t\tOriginal String to all lower case: " + lower);

    // Replace characters or substrings
    String replaced = original.replace("World", "Java");  // "  Hello, Java!  "
    System.out.println("\t\tOriginal String with \"World\" replaced with \"Java\": " + replaced + "\n");

    // Finding & Extracting
    String text2 = "Java is awesome!";

    // Find index of character or substring
    int index = text2.indexOf("is");     // 5
    System.out.println("\t\tOriginal Text: " + text2);
    System.out.println("\t\tText's index at \"is\": " + index);
    int lastIndex = text2.lastIndexOf("a");  // 3
    System.out.println("\t\tText's last index of \"a\": " + lastIndex);

    // Extract substring
    String substring = text2.substring(0, 4);  // "Java"
    System.out.println("\t\tOriginal Text's extracted substring of \"Java\": " + substring);
    String fromIndex = text2.substring(5);     // "is awesome!"
    System.out.println("\t\tOriginal Text's extracted substring of \"is awesome!\": " + fromIndex + "\n");

    // String Concatenation
    // Method 1: Using the + Operator
    String firstName = "John";
    String lastName = "Doe";
    System.out.println("\t\tFirst Name: " + firstName);
    System.out.println("\t\tLast Name: " + lastName);
    String fullName = firstName + " " + lastName;  // "John Doe"
    System.out.println("\t\tFull Name: " + fullName);

    int age = 25;
    System.out.println("\t\tAge: " + age);
    String message2 = "Hello, I am " + firstName + " " + lastName + " and I am " + age + " years old.";
    System.out.println("\t\tJohn's Message: " + message2 + "\n");

    // Method 2: Using concat() Method
    String greeting = "Hello";
    String name2 = "World";
    String message3 = greeting.concat(", ").concat(name).concat("!");  // "Hello, World!"
    System.out.println("\t\tGreeting: " + greeting);
    System.out.println("\t\tTo Whom: " + name2);
    System.out.println("\t\tFull Message: " + message3 + "\n");

    // Method 3: Using StringBuilder (For Multiple Concatenations)
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    sb.append(", ");
    sb.append("Java");
    sb.append("!");
    String result = sb.toString();  // "Hello, Java!"
    System.out.println("\t\tStringBuilder Built String is: " + result);
    System.out.println("\t\tStringBuilder without toString(): " + sb + "\n");

    StringBuilder faddahTest = new StringBuilder();
    faddahTest.append("This ");
    faddahTest.append("is ");
    faddahTest.append("Faddah");
    faddahTest.append("'s ");
    faddahTest.append("first ");
    faddahTest.append("StringBuilder ");
    faddahTest.append("Example!");

    System.out.println("faddahTest in Memory Address: " + System.identityHashCode(faddahTest));
    String faddahConcactenatedString = faddahTest.toString();
    System.out.println("faddahTest.toString() or faddahConcactenatedString in Memory Address: " + System.identityHashCode(faddahTest));

    System.out.println("Java Class for faddahTest var: " + faddahTest.getClass());
    System.out.println("Java Class for faddahConcactenatedString var: " + faddahConcactenatedString.getClass());

    boolean faddahTestInstanceOfString = faddahTest instanceof StringBuilder;
    boolean faddahConcactenatedStringInstanceOfString = faddahConcactenatedString instanceof String;

    System.out.println("Is faddahTest an Instance of a StringBuilder?: " + faddahTestInstanceOfString);
    System.out.println("Is faddahConcactenatedString an Instance of a String?: " + faddahConcactenatedStringInstanceOfString);

    System.out.println("The String of faddahTest: " + faddahTest);
    System.out.println("The String of faddahTest.toString() or faddahConcactenatedString: " + faddahConcactenatedString);
}
