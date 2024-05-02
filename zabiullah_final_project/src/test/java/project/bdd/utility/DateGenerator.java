package project.bdd.utility;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class DateGenerator {
    public static String getCurrentDate(){
        LocalDate expectedDate = LocalDate.now(ZoneId.of("America/New_York"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return expectedDate.format(formatter);

    }
    public static String getADayAfterCurrentDate(){
        LocalDate expectedDate = LocalDate.now(ZoneId.of("America/New_York"));
        LocalDate dayAfterCurrentDate = expectedDate.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        return dayAfterCurrentDate.format(formatter);
    }
    public static void main(String[] args) {
        System.out.println(getCurrentDate());
        System.out.println(getADayAfterCurrentDate());
    }



}
