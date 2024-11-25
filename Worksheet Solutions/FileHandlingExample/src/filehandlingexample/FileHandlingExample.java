package filehandlingexample;

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandlingExample {
    public static String readTextFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(filePath)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return content.toString();
    }

    public static ArrayList<String> getFileList(String directory) {
        ArrayList<String> files = new ArrayList<>();
        try {
            File folder = new File(directory);
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    files.add(file.getAbsolutePath());
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading directory: " + e.getMessage());
        }
        return files;
    }

    public static ArrayList<String> filterTxt(ArrayList<String> allFiles) {
        ArrayList<String> txtFiles = new ArrayList<>();
        for (String file : allFiles) {
            if (file.endsWith(".txt")) {
                txtFiles.add(file);
            }
        }
        return txtFiles;
    }

    public static void writeToTextFile(String filePath, String toWrite) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(toWrite.replace("\n", "\r\n"));
        } catch (Exception e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        /*
         * Create the following methods (use try-catch when needed):
         * public static String readTextFile(String filePath)
         * 
         * This method should read the contents of the indicated file, and return the
         * contents as a String. It should also add "\n" after each line it reads.
         * Finally, it should display a friendly error message in a message box in case
         * an exception occurs.
         * 
         * public static ArrayList<String> getFileList (String directory)
         * 
         * This method should return a list containing the paths of all the files in a
         * given directory. Finally, it should display a friendly error message in a
         * message box in case an exception occurs.
         * 
         * public static ArrayList<String> filterTxt (ArrayList<String> allFiles)
         * 
         * This method should go through the file names in the given ArrayList, and
         * return another ArrayList containing only those files which are text files.
         * 
         * public static void writeToTextFile(String filePath, String toWrite)
         * 
         * This method write the given String into the file indicated by the given path.
         * This is done after replacing occurances of "\n" with "\r\n". If the file does
         * not yet exist it is created. If it exists, it is overwritten.
         * 
         * 
         * Manually download and save this file to your computer:
         * https://example-files.online-convert.com/document/txt/example.txt
         * Use some of the methods above (and other code) to create the following
         * program:
         * 1. Open and read the file you just downloaded
         * 2. Count the number of "Doe" found in the file
         * 3. Create a new file called result.txt and inside it write the count you just
         * calculated.
         * 
         * Example.txt
         * The names "John Doe" for males, "Jane Doe" or "Jane Roe" for females, or
         * "Jonnie Doe" and "Janie Doe" for children, or just "Doe"
         * non-gender-specifically are used as placeholder names for a party whose true
         * identity is unknown or must be withheld in a legal action, case, or
         * discussion. The names are also used to refer to acorpse or hospital patient
         * whose identity is unknown. This practice is widely used in the United States
         * and Canada, but is rarely used in other English-speaking countries including
         * the United Kingdom itself, from where the use of "John Doe" in a legal
         * context originates. The names Joe Bloggs or John Smith are used in the UK
         * instead, as well as in Australia and New Zealand.
         * 
         * John Doe is sometimes used to refer to a typical male in other contexts as
         * well, in a similar manner to John Q. Public, known in Great Britain as Joe
         * Public, John Smith or Joe Bloggs. For example, the first name listed on a
         * form is often John Doe, along with a fictional address or other fictional
         * information to provide an example of how to fill in the form. The name is
         * also used frequently in popular culture, for example in the Frank Capra film
         * Meet John Doe. John Doe was also the name of a 2002 American television
         * series.
         * 
         * Similarly, a child or baby whose identity is unknown may be referred to as
         * Baby Doe. A notorious murder case in Kansas City, Missouri, referred to the
         * baby victim as Precious Doe. Other unidentified female murder victims are
         * Cali Doe and Princess Doe. Additional persons may be called James Doe, Judy
         * Doe, etc. However, to avoid possible confusion, if two anonymous or unknown
         * parties are cited in a specific case or action, the surnames Doe and Roe may
         * be used simultaneously; for example, "John Doe v. Jane Roe". If several
         * anonymous parties are referenced, they may simply be labelled John Doe #1,
         * John Doe #2, etc. (the U.S. Operation Delego cited 21 (numbered) "John Doe"s)
         * or labelled with other variants of Doe / Roe / Poe / etc. Other early
         * alternatives such as John Stiles and Richard Miles are now rarely used, and
         * Mary Major has been used in some American federal cases.
         */

        // File path to example.txt
        String filePath = "example.txt";
        // File Content as String
        String content = readTextFile(filePath);

        int count = 0;
        // target represents what should be counted
        String target = "Doe";

        // .split("\\s+") splits the content by whitespace
        // whitespace includes spaces, tabs, and newlines
        for (String word : content.split("[\\s,./ \"]+")) {
            if (word.contains(target)) {
                count++;
            }
        }
        // Path to result.txt
        String resultFilePath = "result.txt";

        // File content to write
        writeToTextFile(resultFilePath, "Count of 'Doe': " + count);
    }
}
