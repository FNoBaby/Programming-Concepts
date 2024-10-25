package worksheet11;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Worksheet11 {

    public String formatDate(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static boolean isLeap(long year) {

        return Year.isLeap(year);
    }

    public static void main(String[] args) {

        Worksheet11 ws11 = new Worksheet11();
        Scanner input = new Scanner(System.in);

        // 1
        System.out.println("Enter Day: ");
        int day = input.nextInt();
        System.out.println("Enter Day: ");
        int month = input.nextInt();
        System.out.println("Enter Day: ");
        int year = input.nextInt();

        System.out.println(ws11.formatDate(day, month, year));

        // -------------------------------------------------------
        // 2

        System.out.println("Enter number of seconds (between 0 and 86400): ");
        int totalSeconds = input.nextInt();

        if (totalSeconds < 0 || totalSeconds > 86400) {
            System.out.println("Invalid input. Please enter a number between 0 and 86400.");
        } else {
            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            LocalTime time = LocalTime.of(hours, minutes, seconds);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H 'hrs,' m 'mins,' s 'secs'");
            System.out.println(time.format(formatter));
        }

        // -------------------------------------------------------
        // 3

        System.out.println("Enter first date:");
        System.out.println("Enter Day: ");
        int day1 = input.nextInt();
        System.out.println("Enter Month: ");
        int month1 = input.nextInt();
        System.out.println("Enter Year: ");
        int year1 = input.nextInt();

        System.out.println("Enter second date:");
        System.out.println("Enter Day: ");
        int day2 = input.nextInt();
        System.out.println("Enter Month: ");
        int month2 = input.nextInt();
        System.out.println("Enter Year: ");
        int year2 = input.nextInt();

        LocalDate date1 = LocalDate.of(year1, month1, day1);
        LocalDate date2 = LocalDate.of(year2, month2, day2);

        // Compare dates
        // .isBefore() returns true if the date is before the date passed as an argument
        // .isAfter() returns true if the date is after the date passed as an argument
        if (date1.isBefore(date2)) {
            System.out.println("The first date comes before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date comes after the second date.");
        } else {
            System.out.println("Both dates are equal.");
        }

        // -------------------------------------------------------
        // 4

        System.out.println("Enter a year:");
        int year4 = input.nextInt();

        boolean isLeapYear = Year.isLeap(year4);

        if (isLeapYear) {
            System.out.println(year4 + " is a leap year. It has 366 days.");
        } else {
            System.out.println(year4 + " is not a leap year. It has 365 days.");
        }

        // -------------------------------------------------------
        // 5

        System.out.println("Enter your date of birth:");
        System.out.println("Enter Day: ");
        int birthDay = input.nextInt();
        System.out.println("Enter Month: ");
        int birthMonth = input.nextInt();
        System.out.println("Enter Year: ");
        int birthYear = input.nextInt();

        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();

        int age = Period.between(birthDate, currentDate).getYears();

        System.out.println("You are " + age + " years old.");

        // -------------------------------------------------------
        // 6

        String targetSentence = "she sells sea shells on the sea shore";
        System.out.println("Please enter the sentence: \"she sells sea shells on the sea shore\"");

        long startTime = System.currentTimeMillis();
        String userSentence = input.nextLine();
        long endTime = System.currentTimeMillis();

        if (targetSentence.equalsIgnoreCase(userSentence)) {
            long timeTaken = endTime - startTime;
            System.out.println("Correct! It took you " + timeTaken + " milliseconds to enter the sentence.");
        } else {
            System.out.println("Incorrect sentence. Please try again.");
        }

        input.close();
    }

}
