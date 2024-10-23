package worksheet10;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Worksheet10 {

    public static void removeZeros(ArrayList<Integer> list) {
        //Lambda Expression
        list.removeIf(num -> num == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
           1.
            a) Yes
            b) Yes
            c) No
            d) Yes
            e) No
        
           2.
            a) Integer
            b) Character
            c) Boolean
            d) Float
            e) Double
        
           3.
            a) B
            b) C
            c) IndexOutOfBoundsException
        
            
         */
        //---------------------------------------------------------
        //4
        ArrayList<Integer> myNums = new ArrayList<>();

        // a) 
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(100) + 1;
            myNums.add(randomNumber);
        }

        // b)
        for (int i = 0; i < myNums.size(); i++) {
            myNums.set(i, myNums.get(i) + 1);
        }

        // c)
        int evenCount = 0;
        for (int num : myNums) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);

        // d)
        System.out.print("Elements in reverse order: ");
        for (int i = myNums.size() - 1; i >= 0; i--) {
            System.out.print(myNums.get(i) + " ");
        }
        System.out.println();

        // e)
        boolean containsFifty = myNums.contains(50);
        System.out.println("Does the list contain the number 50? " + containsFifty);

        // f)
        myNums.clear();
        System.out.println("Size of the ArrayList after clearing: " + myNums.size());

        //---------------------------------------------------------
        //5
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Please enter 10 names:");

        for (int i = 0; i < 10; i++) {
            String name = input.nextLine();
            if (names.contains(name)) {
                System.out.println("The name '" + name + "' already exists. Please enter a different name.");
            } else {
                names.add(name);
            }
        }

        System.out.println("\nUnique names entered:");
        for (String name : names) {
            System.out.println(name);
        }

        //---------------------------------------------------------
        //6
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(0);
        numbers.add(2);
        numbers.add(0);
        numbers.add(3);
        numbers.add(0);
        numbers.add(4);

        System.out.println("\nNumbers before removing zeros: " + numbers);
        removeZeros(numbers);
        System.out.println("Numbers after removing zeros: " + numbers);
    }
}
