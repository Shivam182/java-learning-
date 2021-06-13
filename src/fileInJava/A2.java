package fileInJava;

import java.io.File;
import java.io.IOException;

// creating a temporary file 
public class A2 {
    public static void main(String[] args) throws IOException {
        String prefix = "myFile";
        String suffix = ".java";
        File dirPath = new File("pathToLocateFileStoring");

        // create temp file is static method 
        // REMEMBER : 3rd arguement does not takes a string path but takes a new file object already created 
        File f1 = File.createTempFile(prefix, suffix, dirPath);
        // gets path of the temp file
        f1.getAbsolutePath();
    }
}
