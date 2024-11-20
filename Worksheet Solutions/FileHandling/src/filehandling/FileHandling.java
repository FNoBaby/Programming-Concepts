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
        // 1. File Class: It is used to create objects that provide access to the files
        // and directories of a local file system.

        // 2. FileInputStream Class: It is used to read data from a file as a stream of
        // bytes.

        // 3. FileOutputStream Class: It is used to write data to a file as a stream of
        // bytes.

        // 4. BufferedInputStream Class: It is used to read data from a file as a stream
        // of bytes with buffering.

        // 5. BufferedOutputStream Class: It is used to write data to a file as a stream
        // of bytes with buffering.

        // 6. DataInputStream Class: It is used to read primitive data types from an
        // input stream.

        // 7. DataOutputStream Class: It is used to write primitive data types to an
        // output stream.

        // 8. FileReader Class: It is used to read data from a file as a stream of
        // characters.

        // 9. FileWriter Class: It is used to write data to a file as a stream of
        // characters.

        // 10. BufferedReader Class: It is used to read data from a file as a stream of
        // characters with buffering.

        // 11. BufferedWriter Class: It is used to write data to a file as a stream of
        // characters with buffering.

        // 12. RandomAccessFile Class: It is used to read and write data to a file
        // randomly.

        // 13. Scanner Class: It is used to read data from various input sources like
        // files, strings, and streams.

        // 14. PrintWriter Class: It is used to write formatted data to a file.

        // Java File Handling Operations
        // Java File Handling allows you to perform various operations on files and
        // directories.
        // Some of the common file handling operations are:
        // 1. Creating a File: You can create a new file using the createNewFile() method
        // of the File class.

        // 2. Deleting a File: You can delete a file using the delete() method of the
        // File class.

        // 3. Renaming a File: You can rename a file using the renameTo() method of the
        // File class.

        // 4. Checking if a File Exists: You can check if a file exists using the exists()
        // method of the File class.

        // 5. Getting the Name of a File: You can get the name of a file using the getName()
        // method of the File class.

        // 6. Getting the Path of a File: You can get the path of a file using the getPath()
        // method of the File class.

        // 7. Getting the Parent Directory of a File: You can get the parent directory of a
        // file using the getParentFile() method of the File class.

        // 8. Getting the Size of a File: You can get the size of a file in bytes using the
        // length() method of the File class.

        // 9. Checking if a File is a Directory: You can check if a file is a directory using
        // the isDirectory() method of the File class.

        // 10. Checking if a File is a File: You can check if a file is a file using the isFile()
        // method of the File class.

        // 11. Listing Files and Directories: You can get the list of files and directories in a
        // directory using the list() method of the File class.

        // 12. Creating a Directory: You can create a new directory using the mkdir() method of
        // the File class.

        // 13. Getting the List of Files and Directories: You can get the list of files and
        // directories in a directory using the listFiles() method of the File class.

        // 14. Reading the Contents of a File: You can read the contents of a file using the
        // FileReader class.

        // 15. Writing to a File: You can write to a file using the FileWriter class.

        // 16. Getting the List of Root Directories: You can get the list of root directories
        // using the listRoots() method of the File class.


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

        // Java FileInputStream Class
        // The FileInputStream class is used to read data from a file as a stream of bytes.
        // It is used for reading raw bytes of data, such as image data, audio data, etc.
        // The FileInputStream class is present in the java.io package.
        // It extends the InputStream class.

        // Java FileInputStream Class Constructors
        // 1. FileInputStream(String name): Creates a new FileInputStream by opening a
        // connection to the file specified by the name parameter.
        // 2. FileInputStream(File file): Creates a new FileInputStream by opening a
        // connection to the file specified by the file parameter.

        // Java FileInputStream Class Methods
        // 1. read(): This method is used to read the next byte of data from the input
        // stream.
        // 2. close(): This method is used to close the input stream.

        // Java FileOutputStream Class
        // The FileOutputStream class is used to write data to a file as a stream of bytes.
        // It is used for writing raw bytes of data, such as image data, audio data, etc.
        // The FileOutputStream class is present in the java.io package.
        // It extends the OutputStream class.

        // Java FileOutputStream Class Constructors
        // 1. FileOutputStream(String name): Creates a new FileOutputStream by opening a
        // connection to the file specified by the name parameter.
        // 2. FileOutputStream(File file): Creates a new FileOutputStream by opening a
        // connection to the file specified by the file parameter.

        // Java FileOutputStream Class Methods
        // 1. write(int b): This method is used to write the specified byte to the output
        // stream.
        // 2. close(): This method is used to close the output stream.

        // Java FileReader Class
        // The FileReader class is used to read data from a file as a stream of characters.
        // It is used for reading character files, such as text files.
        // The FileReader class is present in the java.io package.
        // It extends the InputStreamReader class.

        // Java FileReader Class Constructors
        // 1. FileReader(String fileName): Creates a new FileReader by opening a
        // connection to the file specified by the fileName parameter.
        // 2. FileReader(File file): Creates a new FileReader by opening a connection to
        // the file specified by the file parameter.

        // Java FileReader Class Methods
        // 1. read(): This method is used to read the next character of data from the
        // input stream.
        // 2. close(): This method is used to close the input stream.

        // Java FileWriter Class
        // The FileWriter class is used to write data to a file as a stream of characters.
        // It is used for writing character files, such as text files.
        // The FileWriter class is present in the java.io package.
        // It extends the OutputStreamWriter class.

        // Java FileWriter Class Constructors
        // 1. FileWriter(String fileName): Creates a new FileWriter by opening a
        // connection to the file specified by the fileName parameter.
        // 2. FileWriter(File file): Creates a new FileWriter by opening a connection to
        // the file specified by the file parameter.

        // Java FileWriter Class Methods
        // 1. write(String str): This method is used to write a string to the output
        // stream.
        // 2. close(): This method is used to close the output stream.

        // Java BufferedInputStream Class
        // The BufferedInputStream class is used to read data from a file as a stream of
        // bytes with buffering.
        // It is used for reading raw bytes of data, such as image data, audio data, etc.

        // Java BufferedInputStream Class Constructors
        // 1. BufferedInputStream(InputStream in): Creates a new BufferedInputStream by
        // wrapping the specified input stream.
        // 2. BufferedInputStream(InputStream in, int size): Creates a new
        // BufferedInputStream by wrapping the specified input stream and setting the
        // buffer size.

        // Java BufferedInputStream Class Methods
        // 1. read(): This method is used to read the next byte of data from the input
        // stream.
        // 2. close(): This method is used to close the input stream.

        // Java BufferedOutputStream Class
        // The BufferedOutputStream class is used to write data to a file as a stream of
        // bytes with buffering.
        // It is used for writing raw bytes of data, such as image data, audio data, etc.

        // Java BufferedOutputStream Class Constructors
        // 1. BufferedOutputStream(OutputStream out): Creates a new BufferedOutputStream
        // by wrapping the specified output stream.
        // 2. BufferedOutputStream(OutputStream out, int size): Creates a new
        // BufferedOutputStream by wrapping the specified output stream and setting the
        // buffer size.

        // Java BufferedOutputStream Class Methods
        // 1. write(int b): This method is used to write the specified byte to the output
        // stream.
        // 2. close(): This method is used to close the output stream.

        // Java DataInputStream Class
        // The DataInputStream class is used to read primitive data types from an input
        // stream.
        // It is used for reading primitive data types, such as int, float, double, etc.

        // Java DataInputStream Class Constructors
        // 1. DataInputStream(InputStream in): Creates a new DataInputStream by wrapping
        // the specified input stream.

        // Java DataInputStream Class Methods
        // 1. readInt(): This method is used to read an integer from the input stream.
        // 2. readFloat(): This method is used to read a float from the input stream.
        // 3. readDouble(): This method is used to read a double from the input stream.
        // 4. close(): This method is used to close the input stream.

        // Java DataOutputStream Class
        // The DataOutputStream class is used to write primitive data types to an output
        // stream.
        // It is used for writing primitive data types, such as int, float, double, etc.

        // Java DataOutputStream Class Constructors
        // 1. DataOutputStream(OutputStream out): Creates a new DataOutputStream by
        // wrapping the specified output stream.

        // Java DataOutputStream Class Methods
        // 1. writeInt(int i): This method is used to write an integer to the output
        // stream.
        // 2. writeFloat(float f): This method is used to write a float to the output
        // stream.
        // 3. writeDouble(double d): This method is used to write a double to the output
        // stream.
        // 4. close(): This method is used to close the output stream.

        // Java RandomAccessFile Class
        // The RandomAccessFile class is used to read and write data to a file randomly.
        // It is used for reading and writing data at any position in the file.
        // The RandomAccessFile class is present in the java.io package.

        // Java RandomAccessFile Class Constructors
        // 1. RandomAccessFile(String name, String mode): Creates a new RandomAccessFile
        // by opening a connection to the file specified by the name parameter in the
        // mode specified by the mode parameter.
        // 2. RandomAccessFile(File file, String mode): Creates a new RandomAccessFile by
        // opening a connection to the file specified by the file parameter in the mode
        // specified by the mode parameter.

        // Java RandomAccessFile Class Methods
        // 1. read(): This method is used to read the next byte of data from the input
        // stream.
        // 2. write(int b): This method is used to write the specified byte to the output
        // stream.
        // 3. seek(long pos): This method is used to set the file-pointer offset.
        // 4. close(): This method is used to close the input and output streams.

        // Java Scanner Class
        // The Scanner class is used to read data from various input sources like files,
        // strings, and streams.
        // It is used for reading input data in a formatted way.
        // The Scanner class is present in the java.util package.

        // Java Scanner Class Constructors
        // 1. Scanner(File source): Creates a new Scanner by parsing the specified file.
        // 2. Scanner(String source): Creates a new Scanner by parsing the specified
        // string.
        // 3. Scanner(InputStream source): Creates a new Scanner by parsing the specified
        // input stream.

        // Java Scanner Class Methods
        // 1. next(): This method is used to read the next token from the input source.
        // 2. nextInt(): This method is used to read the next integer from the input
        // source.
        // 3. nextDouble(): This method is used to read the next double from the input
        // source.
        // 4. close(): This method is used to close the input source.

        // Java PrintWriter Class
        // The PrintWriter class is used to write formatted data to a file.
        // It is used for writing formatted data, such as text data, to a file.
        // The PrintWriter class is present in the java.io package.

        // Java PrintWriter Class Constructors
        // 1. PrintWriter(String fileName): Creates a new PrintWriter by opening a
        // connection to the file specified by the fileName parameter.
        // 2. PrintWriter(File file): Creates a new PrintWriter by opening a connection to
        // the file specified by the file parameter.

        // Java PrintWriter Class Methods
        // 1. print(String s): This method is used to write a string to the output stream.
        // 2. println(String s): This method is used to write a string followed by a
        // newline character to the output stream.
        // 3. close(): This method is used to close the output stream.

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
    }
}
