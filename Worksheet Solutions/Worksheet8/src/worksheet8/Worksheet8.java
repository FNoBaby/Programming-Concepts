package worksheet8;

import java.util.Scanner;
import java.util.Arrays;

public class Worksheet8 {

    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        //Replace all would replace all "oldWord" found in the sentence with "newWord"
        return sentence.replaceAll(oldWord, newWord);
    }

    public static void countCharacters(String input) {
        int digitCount = 0;
        int letterCount = 0;

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (Character.isLetter(ch)) {
                letterCount++;
            }
        }

        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of letters: " + letterCount);
    }

    public static String removeNonLetters(String input) {
        StringBuilder cleanedString = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                cleanedString.append(ch);
            }
        }

        return cleanedString.toString();
    }

    public static String validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 8) {
            return "Invalid phone number length. It should be 8 digits.";
        }

        for (char ch : phoneNumber.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return "Invalid phone number. It should contain only digits.";
            }
        }

        String prefix = phoneNumber.substring(0, 2);
        switch (prefix) {
            case "21":
                return "Go Fixed";
            case "27":
                return "Melita Fixed";
            case "79":
                return "Go Mobile";
            case "99":
                return "Vodafone";
            default:
                return "Other";
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
            1. Strings are Objects rather than primitive data types
        
            2.
            a) 24
            b) this is a short sentence
            c) false
            d) true
            e) false
            f) This is a shopt sentence
            g) (space)
            h) 3
            i) is 
            j) short sentence
            k) 10 (starting index is 7)
        
            3.
            a) hill
            b) 4 (indexOf() char not found, returns -1)
            c) FranklinRoosevelt
         */

        //----------------------------------------------------------
        //4
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        if (word.length() < 2) {
            System.out.println("The word entered has only 1 character.");
        } else {
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            System.out.println("First letter: " + firstLetter);
            System.out.println("Last letter: " + lastLetter);
        }

        //----------------------------------------------------------
        //5
        System.out.print("Enter an email address: ");
        String email = input.nextLine();

        if (isValidEmail(email)) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is invalid.");
        }

        //----------------------------------------------------------
        //6
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter the word to be replaced: ");
        String oldWord = input.nextLine();
        System.out.print("Enter the replacement word: ");
        String newWord = input.nextLine();
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + modifiedSentence);

        //----------------------------------------------------------
        //7
        System.out.print("Enter a string: ");
        String in = input.nextLine();
        countCharacters(in);

        //----------------------------------------------------------
        //8
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String result = removeNonLetters(str);
        System.out.println("Cleaned string: " + result);

        //----------------------------------------------------------
        //9
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

        //----------------------------------------------------------
        //10
        System.out.print("Enter an 8-digit telephone number: ");
        String phoneNumber = input.nextLine();
        String res = validatePhoneNumber(phoneNumber);
        System.out.println(res);
    }

}
