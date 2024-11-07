package az.eolymptasks;

import java.util.Scanner;

    public class season {
        public static void main(String[]  args) {
            Scanner scanner = new Scanner (System.in);

            System.out.println("Enter the number between 1-12");
            int monthNumber = scanner.nextInt();

            String month;
            String season;

            if (monthNumber == 1) {
                month = "January";
                season = "Winter";
            } else if (monthNumber == 2) {
                month = "February";
                season = "Winter";
            } else if (monthNumber == 3) {
                month = "March";
                season = "Spring";
            } else if (monthNumber == 4) {
                month = "April";
                season = "Spring";
            } else if (monthNumber == 5) {
                month = "May";
                season = "Spring";
            } else if (monthNumber == 6) {
                month = "June";
                season = "Summer";
            } else if (monthNumber == 7) {
                month = "July";
                season = "Summer";
            } else if (monthNumber == 8) {
                month = "August";
                season = "Summer";
            } else if (monthNumber == 9) {
                month = "September";
                season = "Autumn";
            } else if (monthNumber == 10) {
                month = "October";
                season = "Autumn";
            } else if (monthNumber == 11) {
                month = "November";
                season = "Autumn";
            } else if (monthNumber == 12) {
                month = "December";
                season = "Winter";
            } else {
                month = "Invalid input";
                season = "Invalid input";
                System.out.println("Invalid input. Write a number between 1-12.");
                scanner.close();
                return;
            }

            System.out.println("Month: " + month);
            System.out.println("Season: " + season);

            scanner.close();




        }
    }


