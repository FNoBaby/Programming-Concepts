package worksheet12;

import java.util.Scanner;

public class Worksheet12 {
    public static void main(String[] args) {
        /*
         * 1) For each statement below, mark whether it is true or false.
         * 
         * a) False
         * b) True
         * c) False
         * d) True
         * e) True
         * 
         * 2) Write down the 3 different types of Exceptions found in Java (include
         * Errors), and answer the questions about each:
         * 
         * a) Type 1: Checked Exceptions
         * - What is a Checked Exception?
         * Checked Exceptions are exceptions that are checked at compile time.
         * If a method is capable of causing a checked exception,
         * the method must either handle the exception or declare it in its throws
         * clause.
         * 
         * - Give an example of a Checked Exception:
         * IOException
         * 
         * - What can you do to handle a Checked Exception?
         * You can use try-catch block to handle the exception.
         * 
         * b) Type 2: Unchecked Exceptions
         * - What is an Unchecked Exception?
         * Unchecked Exceptions are exceptions that are not checked at compile time.
         * 
         * - Give an example of an Unchecked Exception:
         * NullPointerException
         * 
         * - What can you do to handle an Unchecked Exception?
         * You can use try-catch block to handle the exception.
         * 
         * c) Type 3: Errors
         * - What is an Error?
         * Errors are exceptional conditions that are external to the application,
         * and that the application usually cannot anticipate or recover from.
         * 
         * - Give an example of an Error:
         * OutOfMemoryError
         * 
         * - What can you do to handle an Error?
         * You can use try-catch block to handle the exception.
         * 
         * 
         * 
         * 3) What exception types can be caught by the following handler?
         * catch (Exception e) {
         * ...
         * }
         * What is wrong with using this type of exception handler?
         * 
         * All exceptions can be caught by the handler.
         * The problem with using this type of exception handler is that it is too
         * general and it can hide the actual cause of the exception.
         */

        // 4)

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of children in the classroom: ");
        int numberOfChildren = input.nextInt();

        System.out.println("Enter the number of available crayons: ");
        int numberOfCrayons = input.nextInt();

        // int crayonsPerChild = numberOfCrayons / numberOfChildren;
        // System.out.println("Each child will get " + crayonsPerChild + " crayons.");

        // ArithmeticException will be thrown if numberOfChildren is 0 or
        // numberOfCrayons is 0

        // Unchecked Exception

        try {
            int crayonsPerChild = numberOfCrayons / numberOfChildren;
            System.out.println("Each child will get " + crayonsPerChild + " crayons.");
        } catch (ArithmeticException e) {
            System.out.println("You must have made a mistake…you cannot have 0 students");
        }

        // 5)

        // System.out.println("Enter a number between 1 and 100: ");
        // byte number = input.nextByte();

        // System.out.println("The number you entered is: " + number);

        // An InputMismatchException will be thrown because the input is out of range.
        // Unchecked Exception

        try {
            System.out.println("Enter a number between 1 and 100: ");
            byte number = input.nextByte();
            System.out.println("The number you entered is: " + number);
        } catch (Exception e) {
            System.out.println("The number you entered is out of range");
        }

        // 6)

        System.out.println("Enter a word: ");
        String word = input.next();

        System.out.println("Enter a number: ");
        int index = input.nextInt();

        // System.out.println("The letter at the index specified is: " +
        // word.charAt(index));

        // StringIndexOutOfBoundsException will be thrown if the index is out of range.
        // Unchecked Exception

        try {
            System.out.println("The letter at the index specified is: " + word.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The index you entered is out of range");
        }

        // 7)

        // for(int i = 1; i <= 100; i++){
        //     System.out.println(i);
        //     Thread.sleep(1000);
        // }

        //The code does not compile because the sleep method throws an InterruptedException.

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        input.close();
    }

}
