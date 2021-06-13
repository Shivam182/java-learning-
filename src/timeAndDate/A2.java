package timeAndDate;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// diffrent types of date formats 
/**
 * 1. yyyy-mm-dd
 * 2. DD/MM/YYYY
 * 3. dd MM YYYY
 */


public class A2 {
    
    public static void main(String[] args) {
        
        // this prints yyyy-mm-dd format
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate + " only for date of now " );

        Date date  =new Date();
        System.out.println(date  + " an object of Date class containing date + currTime");


        // this prints yyyy-mm-mm + Time till milliseconds
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime + " only for complete date of now called a static ");

        // NOTE : IF U USE "yy/dd/mm" then it will print minutes instead of months 
        DateTimeFormatter dateTimeFormatter  = DateTimeFormatter.ofPattern("yy/dd/MM hh:mm:ss:ms");
        String string = dateTimeFormatter.format(localDateTime);
        System.out.println(string + " custom fromat everything ");

        
    }
}
