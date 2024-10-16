package worksheet5;

import java.util.Scanner;

public class Worksheet5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. If statements allows for operators which allows for a wider range of checks

        //2. Better Readability and very specific, can be changed to an if - elseif if wanted
        /*3.
            a) True
            b) False
            c) True
            d) True
            e) True
            f) False
         */
 /*4.
            a) True
            b) False
            c) True
            d) True
            e) False
            f) True
         */
        //5
//        
//        System.out.println("Enter the time (24-hr Format)");
//        int time = input.nextInt();
//        
//        if(time >= 1 && time <= 11){
//            System.out.println("Morning");
//        }else if(time == 12){
//            System.out.println("Noon");
//        }else if(time >= 13 && time <= 16){
//            System.out.println("Afternoon");
//        }else if(time >= 17 && time <= 23){
//            System.out.println("Evening");
//        }else if(time == 24){
//            System.out.println("Midnight");
//        }
//--------------------------------------------------------
        //6
        
        System.out.println("Enter 1st Num");
        int num1 = input.nextInt();
        
        System.out.println("Enter 2nd Num");
        int num2 = input.nextInt();
        
        if(num1 > num2){
            System.out.println("Num 1 is greater");
        }else if(num2 > num1){
            System.out.println("Num 2 is greater");
        }else if(num1 == num2){
            System.out.println("They are equal");
        }
    }

}
