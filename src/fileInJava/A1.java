package fileInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1 {
    public static void main(String[] args) throws IOException {
        String completePathString = "";
        File f1 = new File(completePathString);

        // creates a new file and returns true after that
        f1.createNewFile();

        // gives the path of file
        f1.getAbsolutePath();

        // now whenever br will be called to read a buffer , it will automatically call
        // for input fo the user.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // here as br is called it first automatically has the property in its object to
        // give an input option ot user first
        // then read line method reads the buffer written by the user . and stores in j
        // string
        System.out.print("enter file storage path : ");
        String path = br.readLine();
        System.out.print("enter file name : ");
        String fileNamString = br.readLine();
        completePathString = path + fileNamString;
        System.out.println(completePathString);
    }
}
