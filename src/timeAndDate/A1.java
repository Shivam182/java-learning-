package timeAndDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date is : " + date);

        // takes a string pattern as a param and will format once format method is
        // called according tot he given string pattern.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss aa");

        // it needed to be a string because format method returns a string and takes a
        // date object as a param. 
        String timeString = simpleDateFormat.format(date);
        System.out.println(timeString + " time string ");
    }
}
