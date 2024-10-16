package worksheet6;

import java.util.Scanner;
import java.util.Random;

public class Worksheet6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
//---------------------------------------------------------
        //1
//        for(int i = 0 ; i <= 100 ; i++){
//            if(i%2 == 0){
//                System.out.println(i);
//            }
//        }
//---------------------------------------------------------
        //2
//        final int maxNum = 100;
//        int num = 0;
//        while (num >= 10 || num <= 50) {
//            System.out.println("Enter a Number between 10 and 50");
//            num = input.nextInt();
//        }
//
//        for (int i = num; i <= maxNum; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//---------------------------------------------------------
        //3
//        String username;
//        int password;
//
//        do {
//            System.out.print("Enter username: ");
//            username = input.nextLine();
//
//            System.out.print("Enter password: ");
//            password = input.nextInt();
//
//            if (!username.equals("admin") || password != 123) {
//                System.out.println("Incorrect username or password. Try again.\n");
//            }
//
//        } while (!username.equals("admin") || password != 123);
//        System.out.println("Login successful!");
//---------------------------------------------------------
        //4
//        int number;
//
//        do {
//            System.out.print("Enter a number: ");
//            number = input.nextInt();
//        } while (number <= 0);
//
//        System.out.println("You entered a positive number: " + number);
//---------------------------------------------------------
        //5
//        String moreStudents;
//        int studentCount = 0;
//
//        do {
//            System.out.print("Enter student's name: ");
//            String studentName = input.nextLine();
//
//            System.out.print("Enter student's age: ");
//            int studentAge = input.nextInt();
//            input.nextLine();  // Consume the newline
//
//            studentCount++;
//
//            System.out.print("Do you want to enter more students? (Y/N): ");
//            moreStudents = input.nextLine();
//        } while (moreStudents.equalsIgnoreCase("Y"));
//
//        System.out.println("You have entered " + studentCount + " students.");
//---------------------------------------------------------
        //6
//        int randomNumber = random.nextInt(10) + 1;
//        int userGuess;
//        int chances = 3;
//
//        System.out.println("Guess the number between 1 and 10. You have 3 chances.");
//
//        for (int i = 0; i < chances; i++) {
//            System.out.print("Enter your guess: ");
//            userGuess = input.nextInt();
//
//            if (userGuess == randomNumber) {
//                System.out.println("Congratulations! You guessed the correct number.");
//                input.close();
//                return;
//            } else {
//                System.out.println("Incorrect guess. Try again.");
//            }
//        }
//
//        System.out.println("Sorry! The correct number was " + randomNumber + ". You lose.");
//---------------------------------------------------------
        //7
        // a)
//        for (int i = 0; i < 1; i++) {
//            System.out.print("*******");
//        }
//        System.out.println();

        // b)
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // c)
//        for (int i = 4; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//---------------------------------------------------------
        //8
        /*
            a) 123
            b) 5 4 3 (loop stops before 2)
            c) 1 3 4 (loop skips 2)
            d) 3
            e) 1 2 3 4
         */
//---------------------------------------------------------
        //9
//        int[] values = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            values[i] = input.nextInt();
//        }
//
//        int min = values[0];
//        int max = values[0];
//
//        for (int i = 1; i < values.length; i++) {
//            if (values[i] < min) {
//                min = values[i];
//            }
//            if (values[i] > max) {
//                max = values[i];
//            }
//        }
//
//        System.out.println("Lowest value: " + min);
//        System.out.println("Highest value: " + max);
    }
}
