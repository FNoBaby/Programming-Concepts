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
//---------------------------------------------------------
// 6B
//---------------------------------------------------------
        //1
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 10; i >= 1; i--) {
//            System.out.print(i + " ");
//        }
//---------------------------------------------------------
        //2
//        System.out.print("Enter the minimum number: ");
//        int min = input.nextInt();
//
//        System.out.print("Enter the maximum number: ");
//        int max = input.nextInt();
//
//        int sum = 0;
//
//        for (int i = min; i <= max; i++) {
//            sum += i;
//        }
//
//        System.out.println("The sum of numbers between " + min + " and " + max + " is: " + sum);
//---------------------------------------------------------
        //3
//        int total = 0;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter a number (-1 to stop): ");
//            int number = input.nextInt();
//
//            if (number == -1) {
//                break;
//            }
//
//            total += number;
//        }
//
//        System.out.println("The total is: " + total);
//---------------------------------------------------------
        //4
//        int count = 0;
//
//        System.out.println("Enter a set of words. Press * to stop.");
//
//        while (true) {
//            String word = input.nextLine();
//
//            if (word.equals("*")) {
//                break;
//            }
//
//            count++;
//        }
//
//        System.out.println("You entered " + count + " words.");
//---------------------------------------------------------
        //5
//        int choice;
//
//        do {
//            System.out.println("Menu");
//            System.out.println("1.Phone Book");
//            System.out.println("2.Messages");
//            System.out.println("3.Games");
//            System.out.println("4.Quit");
//            System.out.print("Enter choice: ");
//            choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("You chose Phone Book");
//                    break;
//                case 2:
//                    System.out.println("You chose Messages");
//                    break;
//                case 3:
//                    System.out.println("You chose Games");
//                    break;
//                case 4:
//                    System.out.println("Exiting the program.");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        } while (choice != 4);
//---------------------------------------------------------
        //6
//        int roomNumber;
//
//        while (true) {
//            System.out.print("Enter Room No: ");
//            roomNumber = input.nextInt();
//
//            if (roomNumber >= 1 && roomNumber <= 200) {
//                System.out.println("Room number is valid. Goodbye!");
//                break;
//            } else {
//                System.out.println("Room number must be between 1 and 200.");
//            }
//        }
//---------------------------------------------------------
    }
}
