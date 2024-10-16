package worksheet7;

import java.util.Scanner;

public class Worksheet7 {

    public static int addInt(int num1, int num2) {
        return num1 + num2;
    }

    public static boolean checkLogin(String username, String password) {
        if (username.equals("admin") && password.equals("123")) {
            return true;
        }
        return false;
    }

    public static char getFirstChar(String text) {
        return text.charAt(0);
    }

    //3.
    public static void alarm(int c) {
        for (int i = 0; i < c; i++) {
            System.out.println("Alarm!");
        }
    }

    //4.
    public static int sum100() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //5.
    public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Is Even";
        }
        return "Is Odd";
    }

    //6.
    public static boolean multiple(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        }
        return false;
    }

    //7.
    public static float average(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0f;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1.
            a) True
            b) True
            c) True
            d) True
            e) False
            f) False
            g) False
            h) False
         */
 /*2.
            a) 
            b) 
            c) 
            d) 
            e) 
            f) 
         */
        //3.
//        System.out.println("Input the Number of times to print: ");
//        int count = input.nextInt();
//        alarm(count);
        //4.
//        System.out.println(sum100());
        //5.
//        System.out.println("Enter an number to check if Even");
//        int num = input.nextInt();
//        System.out.println(isEven(num));
        //6.
//        System.out.println("Enter num 1");
//        int num1 = input.nextInt();
//        System.out.println("Enter num 2");
//        int num2 = input.nextInt();
//        System.out.println(multiple(num1 , num2));
//        if(multiple(num1 , num2)){
//            System.out.println("Is Multiple");
//        }else{
//            System.out.println("Is Not Multiple");
//        }
        //7.
//        System.out.print("Enter the first integer: ");
//        int firstNumber = input.nextInt();
//
//        System.out.print("Enter the second integer: ");
//        int secondNumber = input.nextInt();
//
//        System.out.print("Enter the third integer: ");
//        int thirdNumber = input.nextInt();
//
//        float result = average(firstNumber, secondNumber, thirdNumber);
//        System.out.println("The average of the three numbers is: " + result);
        //8.
        
        input.close();
    }

}
