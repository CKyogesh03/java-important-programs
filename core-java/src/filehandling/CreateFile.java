package filehandling;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
//note: file handling in java - directly perform actions on files.
//note: serialization,deserialisation in java - store java object to file and vice-versa
public class CreateFile {
    public static void main(String[] args) {
        try {
            File f = new File("filename.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}