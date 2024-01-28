package filehandling;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        try {
            File f = new File("filename.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {       //s.hasNext
                String data = s.nextLine(); //s.next - for access every word
                System.out.println(data);
            }
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
