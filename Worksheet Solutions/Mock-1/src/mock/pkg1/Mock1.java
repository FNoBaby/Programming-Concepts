package mock.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mock1 {
    public void printPyramid(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int sumOfArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int averageOfArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }

    public int largestOfArray(int[] nums) {
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public int smallestOfArray(int[] nums) {
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mock1 mock = new Mock1();

        // 1
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        mock.printPyramid(num);

        // 2
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter a list names of your friends (type 'stop' to end input):");
        while (true) {
            System.out.println("Name:");
            String str = input.next();
            if (str.equals("quit")) {
                int loc = 0;
                for (String name : list) {
                    if (name.length() > list.get(loc).length()) {
                        loc = list.indexOf(name);
                    }
                }

                System.out.println("You entered " + list.size() + " names. The longest is " + list.get(loc) + ".");
                break;
            }
            list.add(str);
        }

        // 3
        int[] nums = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("Sum of the numbers: " + mock.sumOfArray(nums));
        System.out.println("Average of the numbers: " + mock.averageOfArray(nums));
        System.out.println("Largest of the numbers: " + mock.largestOfArray(nums));
        System.out.println("Smallest of the numbers: " + mock.smallestOfArray(nums));

        input.close();
    }

}
