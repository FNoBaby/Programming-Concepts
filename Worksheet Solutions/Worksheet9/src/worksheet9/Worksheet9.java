package worksheet9;

import java.util.Scanner;
import java.util.Random;

public class Worksheet9 {

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int findPosition(int key, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
           1.
            a) No
            b) No
            c) Yes
            d) No
            e) Yes
            f) No
        
           2.
            a) Yes
            b) No
            c) Yes
            d) Yes
            e) No
        
           3. 20/3 -> 6.66**
        
           4.
            a) 20
            b) 20
            c) 25
            d) x = 23 , y = 25
            e) x = 21 , y = 11
        
         */
        //--------------------------------------------------------------
        //5
        int[] a = {-2, 4, 0, -5, 7, 9, -8, 5, 6, -3};

        // a) 
        for (int i = 0; i < a.length; i++) {
            a[i] += 1;
        }

        System.out.println("Array after adding 1 to each element:");
        printArray(a);

        // b)
        int negativeCount = 0;
        for (int num : a) {
            if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Number of negative numbers: " + negativeCount);

        // c) 
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("Array b (copy of a):");
        printArray(b);

        // d)
        System.out.println("Array a in reverse order:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // e)
        int countInRange = 0;
        for (int num : a) {
            if (num >= 0 && num <= 10) {
                countInRange++;
            }
        }
        System.out.println("Number of elements between 0 and 10 inclusive: " + countInRange);

        //----------------------------------------------------
        //6
        int[] numbers = {10, 20, 30, 40, 50, 60};

        int key1 = 30;
        int position1 = findPosition(key1, numbers);
        System.out.println("Position of " + key1 + ": " + position1);

        int key2 = 25;
        int position2 = findPosition(key2, numbers);
        System.out.println("Position of " + key2 + ": " + position2);

        //----------------------------------------------------
        //7
        // Arrays for card numbers and suits
        String[] numberss = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};

        String[] generatedCards = new String[4];

        Random random = new Random();

        // Generate 4 random cards
        for (int i = 0; i < 4; i++) {
            int randomNumberIndex = random.nextInt(numberss.length);
            int randomSuitIndex = random.nextInt(suits.length);

            String card = numberss[randomNumberIndex] + " of " + suits[randomSuitIndex];
            generatedCards[i] = card;
        }

        System.out.println("Generated Card Combinations:");
        for (String card : generatedCards) {
            System.out.println(card);
        }

        //----------------------------------------------------
        //8
        int[] frequency = new int[6];

        Random random2 = new Random();

        int rolls = 10000;

        for (int i = 0; i < rolls; i++) {
            int dieFace = random2.nextInt(6) + 1;
            frequency[dieFace - 1]++;
        }

        System.out.println("Die Roll Frequencies for " + rolls + " rolls:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println((i + 1) + ": " + frequency[i]);
        }

        //----------------------------------------------------
        //Extra Example
        /*
            Rules for a Valid Array
            1. Must have between 5 or 10 elements
            2. First item needs to be Zero
            3. Each item can be 1/2/3 bigger than previous element
            4. The last element must be odd
        
        */
        
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        
        System.out.println(validArray(nums));
    }
    
    public static boolean validArray(int[] num){
        if(num.length >= 5 && num.length <= 10){
            if(num[0] == 0){
                for(int i = 1 ; i < num.length ; i++){
                    if((num[i-1] <= num[i]) || (num[i-1] > (num[i] + 3))) {
                        return false;
                    }
                }
                
                if(num[num.length-1]%2 != 0){
                    return true;
                }
            }
        }
        return false;
    }

}
