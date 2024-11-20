package filehandling;

// Importing the File class
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {
    public static void main(String[] args) {
        System.out.println("File Handling in Java");

        // File Handling in Java
        // File Handling is a process of performing operations on a file.
        // A file can be read, write, create, and delete using File Handling in Java.

        // Java File Class
        // The File class is an abstract representation of file and directory pathnames.
        // It provides methods for creating, deleting, and renaming files and
        // directories.
        // It also provides methods for retrieving file information.

        // Java File Handling Classes
        // Java provides various classes for file handling.
        // Some of the commonly used classes are:
        // 1. File Class
        // 2. FileInputStream Class
        // 3. FileOutputStream Class
        // 4. BufferedInputStream Class
        // 5. BufferedOutputStream Class
        // 6. DataInputStream Class
        // 7. DataOutputStream Class
        // 8. FileReader Class
        // 9. FileWriter Class
        // 10. BufferedReader Class
        // 11. BufferedWriter Class

        // Java File Class
        // The File class is used to create objects that provide access to the files and
        // directories of a local file system.
        // The File class is present in the java.io package.
        // It provides the methods for renaming, deleting, and obtaining the properties
        // of a file or directory.

        // Java File Class Constructors
        // 1. File(String pathname): Creates a new File instance by converting the given
        // pathname string into an abstract pathname.
        // 2. File(String parent, String child): Creates a new File instance from a
        // parent pathname string and a child pathname string.
        // 3. File(File parent, String child): Creates a new File instance from a parent
        // abstract pathname and a child pathname string.

        // Java File Class Methods
        // 1. createNewFile(): This method is used to create a new file.
        // 2. delete(): This method is used to delete a file or directory.
        // 3. exists(): This method is used to check whether the file or directory
        // exists.
        // 4. getName(): This method is used to get the name of the file or directory.
        // 5. getParent(): This method is used to get the pathname string of the parent
        // directory of the file or directory.
        // 6. getPath(): This method is used to get the pathname string of the file or
        // directory.
        // 7. isDirectory(): This method is used to check whether the file is a
        // directory.
        // 8. isFile(): This method is used to check whether the file is a file.
        // 9. list(): This method is used to get the list of files and directories in
        // the specified directory.
        // 10. mkdir(): This method is used to create a directory.
        // 11. renameTo(File dest): This method is used to rename the file or directory.
        // 12. length(): This method is used to get the size of the file in bytes.

        // Java File Example
        // Let's create a new file using the File class.
        // We will use the createNewFile() method to create a new file.
        // The createNewFile() method returns true if the file is created successfully,
        // otherwise false.
        // The following example creates a new file named "test.txt" in the current
        // directory.

        // Creating a new file
        File file = new File("test.txt");

        // Checking if the file exists
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // The above code creates a new file named "test.txt" in the current directory.
        // If the file is created successfully, it will print "File created: test.txt".
        // If the file already exists, it will print "File already exists.".

        // Java File Example
        // Let's create a new directory using the File class.   
        // We will use the mkdir() method to create a new directory.
        // The mkdir() method returns true if the directory is created successfully, otherwise false.
        // The following example creates a new directory named "test" in the current directory.

        // Creating a new directory
        File directory = new File("test");

        // Checking if the directory exists
        if (directory.mkdir()) {
            System.out.println("Directory created: " + directory.getName());
        } else {
            System.out.println("Directory already exists.");
        }

        // The above code creates a new directory named "test" in the current directory.
        // If the directory is created successfully, it will print "Directory created: test".
        // If the directory already exists, it will print "Directory already exists.".

        // Java File Example
        // Let's list the files and directories in a directory using the File class.
        // We will use the list() method to get the list of files and directories in the specified directory.
        // The list() method returns an array of strings containing the names of the files and directories.
        // The following example lists the files and directories in the current directory.

        // Listing files and directories
        File currentDirectory = new File(".");
        String[] files = currentDirectory.list();

        // Displaying the files and directories
        System.out.println("Files and directories in the current directory:");
        for (String fileOrDirectory : files) {
            System.out.println(fileOrDirectory);
        }
        
        // The above code lists the files and directories in the current directory.
        // It uses the list() method to get the list of files and directories.
        // It then iterates over the array of strings and prints the names of the files and directories.

        // Java File Example
        // Let's rename a file using the File class.
        // We will use the renameTo() method to rename the file.
        // The renameTo() method renames the file to the specified destination file.
        // The following example renames the file "test.txt" to "newtest.txt".
        
        // Renaming a file
        File oldFile = new File("test.txt");
        File newFile = new File("newtest.txt");

        // Renaming the file
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }

        // The above code renames the file "test.txt" to "newtest.txt".
        // It uses the renameTo() method to rename the file.
        // If the file is renamed successfully, it will print "File renamed successfully.".
        // If the file renaming fails, it will print "Failed to rename the file.".

        // Java File Example
        // Let's delete a file using the File class.
        // We will use the delete() method to delete the file.
        // The delete() method deletes the file or directory.
        // The following example deletes the file "newtest.txt".

        // Deleting a file
        File fileToDelete = new File("newtest.txt");

        // Deleting the file
        if (fileToDelete.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }

        // The above code deletes the file "newtest.txt".
        // It uses the delete() method to delete the file.
        // If the file is deleted successfully, it will print "File deleted successfully.".
        // If the file deletion fails, it will print "Failed to delete the file.".

        // Java File Example
        // Let's get the properties of a file using the File class.
        // We will use the methods of the File class to get the properties of a file.
        // The following example gets the properties of the file "test.txt".

        // Getting the properties of a file
        File fileProperties = new File("test.txt");

        // Getting the properties
        System.out.println("File name: " + fileProperties.getName());
        System.out.println("File path: " + fileProperties.getPath());
        System.out.println("File parent: " + fileProperties.getParent());
        System.out.println("File exists: " + fileProperties.exists());
        System.out.println("File is directory: " + fileProperties.isDirectory());
        System.out.println("File is file: " + fileProperties.isFile());
        System.out.println("File size in bytes: " + fileProperties.length());

        // The above code gets the properties of the file "test.txt".
        // It uses the methods of the File class to get the name, path, parent, existence, directory status, file status, and size of the file.
        // It then prints the properties of the file.

        // Java File Example
        // Let's check if a file exists using the File class.
        // We will use the exists() method to check if the file exists.
        // The exists() method returns true if the file exists, otherwise false.
        // The following example checks if the file "test.txt" exists.

        // Checking if a file exists
        File fileToCheck = new File("test.txt");

        // Checking if the file exists
        if (fileToCheck.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        // The above code checks if the file "test.txt" exists.
        // It uses the exists() method to check if the file exists.
        // If the file exists, it will print "File exists.".
        // If the file does not exist, it will print "File does not exist.".

        // Java File Example
        // Let's get the list of files and directories in a directory using the File class.
        // We will use the listFiles() method to get the list of files and directories in the specified directory.
        // The listFiles() method returns an array of File objects representing the files and directories.
        // The following example gets the list of files and directories in the current directory.

        // Getting the list of files and directories
        File currentDir = new File(".");
        File[] filesAndDirs = currentDir.listFiles();

        // Displaying the files and directories
        System.out.println("Files and directories in the current directory:");
        for (File fileOrDir : filesAndDirs) {
            System.out.println(fileOrDir.getName());
        }

        // The above code gets the list of files and directories in the current directory.
        // It uses the listFiles() method to get the list of files and directories.
        // It then iterates over the array of File objects and prints the names of the files and directories.

        // Java File Example
        // Let's get the size of a file using the File class.
        // We will use the length() method to get the size of the file in bytes.
        // The length() method returns the size of the file in bytes.
        // The following example gets the size of the file "test.txt".

        // Getting the size of a file
        File fileToGetSize = new File("test.txt");

        // Getting the size of the file
        long fileSize = fileToGetSize.length();
        System.out.println("File size in bytes: " + fileSize);

        // The above code gets the size of the file "test.txt".
        // It uses the length() method to get the size of the file in bytes.
        // It then prints the size of the file.

        // Java File Example
        // Let's get the list of root directories using the File class.
        // We will use the listRoots() method to get the list of root directories.
        // The listRoots() method returns an array of File objects representing the root directories.
        // The following example gets the list of root directories.

        // Getting the list of root directories
        File[] rootDirs = File.listRoots();

        // Displaying the root directories
        System.out.println("Root directories:");
        for (File rootDir : rootDirs) {
            System.out.println(rootDir.getAbsolutePath());
        }

        // The above code gets the list of root directories.
        // It uses the listRoots() method to get the list of root directories.
        // It then iterates over the array of File objects and prints the absolute paths of the root directories.

        // Java File Example
        // Let's get the parent directory of a file using the File class.
        // We will use the getParentFile() method to get the parent directory of the file.
        // The getParentFile() method returns a File object representing the parent directory.
        // The following example gets the parent directory of the file "test.txt".

        // Getting the parent directory of a file
        File fileToGetParent = new File("test.txt");

        // Getting the parent directory
        File parentDir = fileToGetParent.getParentFile();
        System.out.println("Parent directory: " + parentDir.getName());

        // The above code gets the parent directory of the file "test.txt".
        // It uses the getParentFile() method to get the parent directory.
        // It then prints the name of the parent directory.

        // Java File Example
        // Let's get the name of a file using the File class.
        // We will use the getName() method to get the name of the file.
        // The getName() method returns the name of the file.
        // The following example gets the name of the file "test.txt".

        // Getting the name of a file
        File fileToGetName = new File("test.txt");

        // Getting the name of the file
        String fileName = fileToGetName.getName();
        System.out.println("File name: " + fileName);

        // The above code gets the name of the file "test.txt".
        // It uses the getName() method to get the name of the file.
        // It then prints the name of the file.

        // Java File Example
        // Let's get the path of a file using the File class.
        // We will use the getPath() method to get the path of the file.
        // The getPath() method returns the path of the file.
        // The following example gets the path of the file "test.txt".

        // Getting the path of a file
        File fileToGetPath = new File("test.txt");

        // Getting the path of the file
        String filePath = fileToGetPath.getPath();
        System.out.println("File path: " + filePath);

        // The above code gets the path of the file "test.txt".
        // It uses the getPath() method to get the path of the file.
        // It then prints the path of the file.

        // Java File Example
        // Let's check if a file is a directory using the File class.
        // We will use the isDirectory() method to check if the file is a directory.
        // The isDirectory() method returns true if the file is a directory, otherwise false.
        // The following example checks if the file "test.txt" is a directory.

        // Checking if a file is a directory
        File fileToCheckDir = new File("test.txt");

        // Checking if the file is a directory
        if (fileToCheckDir.isDirectory()) {
            System.out.println("File is a directory.");
        } else {
            System.out.println("File is not a directory.");
        }

        // The above code checks if the file "test.txt" is a directory.
        // It uses the isDirectory() method to check if the file is a directory.
        // If the file is a directory, it will print "File is a directory.".
        // If the file is not a directory, it will print "File is not a directory.".

        // Java File Example
        // Let's check if a file is a file using the File class.
        // We will use the isFile() method to check if the file is a file.
        // The isFile() method returns true if the file is a file, otherwise false.
        // The following example checks if the file "test.txt" is a file.

        // Checking if a file is a file
        File fileToCheckFile = new File("test.txt");

        // Checking if the file is a file
        if (fileToCheckFile.isFile()) {
            System.out.println("File is a file.");
        } else {
            System.out.println("File is not a file.");
        }

        // The above code checks if the file "test.txt" is a file.
        // It uses the isFile() method to check if the file is a file.
        // If the file is a file, it will print "File is a file.".
        // If the file is not a file, it will print "File is not a file.".

        // Java File Example
        // Let's read the contents of a file using the File class.
        // We will use the FileReader class to read the contents of the file.
        // The FileReader class is used to read character files.
        // The following example reads the contents of the file "test.txt".

        // Reading the contents of a file
        File fileToRead = new File("test.txt");

        // Reading the contents of the file
        try {
            FileReader fileReader = new FileReader(fileToRead);
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // The above code reads the contents of the file "test.txt".
        // It uses the FileReader class to read the contents of the file.
        // It then reads the characters from the file and prints them to the console.

        // Java File Example
        // Let's write to a file using the File class.
        // We will use the FileWriter class to write to the file.
        // The FileWriter class is used to write character files.
        // The following example writes the text "Hello, World!" to the file "test.txt".

        // Writing to a file
        File fileToWrite = new File("test.txt");

        // Writing to the file
        try {
            FileWriter fileWriter = new FileWriter(fileToWrite);
            fileWriter.write("Hello, World!");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // The above code writes the text "Hello, World!" to the file "test.txt".
        // It uses the FileWriter class to write to the file.
        // It then writes the text to the file and prints "Successfully wrote to the file." if successful.

        // Java File Handling
        // File Handling in Java is a powerful feature that allows you to perform various operations on files and directories.
        // You can create, read, write, delete, and manipulate files using the File class and other file handling classes in Java.
        // File Handling is essential for working with files and directories in Java applications.
    }
}
