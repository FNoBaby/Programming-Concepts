package extraws;

import java.util.Scanner;

public class ExtraWS {

    public boolean isSentenceValid(String sentence) {
        String[] words = sentence.split(" ");
        if(words.length > 2) {
            if(words[0].charAt(0) == words[0].toUpperCase().charAt(0)) {
                char lastChar = words[words.length - 1].charAt(words[words.length - 1].length() - 1);
                if(lastChar == '.' || lastChar == '!' || lastChar == '?') {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        ExtraWS extraWS = new ExtraWS();
        if(extraWS.isSentenceValid(sentence)) {
            System.out.println("The sentence is valid.");
        } else {
            System.out.println("The sentence is invalid.");
        }

        input.close();
    }
    
}
