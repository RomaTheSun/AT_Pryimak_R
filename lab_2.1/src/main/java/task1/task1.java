package task1;

public class task1 {
    public static void main(String[] args) {
        char a = 'a';

        boolean isDigit = Character.isDigit(a);
        System.out.println(a + " is a digit: " + isDigit);

        boolean isLetter = Character.isLetter(a);
        System.out.println(a + " is a letter: " + isLetter);

        char upperCase = Character.toUpperCase(a);
        System.out.println("Uppercase of " + a + " is: " + upperCase);

        char lowerCase = Character.toLowerCase(upperCase);
        System.out.println("Lowercase of " + upperCase + " is: " + lowerCase);
    }
}


//V 10: Character Operations
//Objective: To understand and use primitive char type in Java.
//Instructions:
//Declare a char variable.
//Use Character methods (e.g., isDigit, isLetter, toUpperCase, toLowerCase) to manipulate the char.
//Print the result of each operation to the console.
