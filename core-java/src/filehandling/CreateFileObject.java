package filehandling;

import java.io.File;

public class CreateFileObject {
    public static void main(String[] args) {
        File f=new File("filename.txt");
        System.out.println(f);
        //note: file created only if we use createNewFile(). then file name and path is taken from this file object.
    }
}
