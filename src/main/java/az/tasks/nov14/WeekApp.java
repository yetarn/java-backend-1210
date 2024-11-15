package az.tasks.nov14;

import java.util.Scanner;

public class WeekApp {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to the university; write a project";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "finish the project; go to the shopping";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to the ielts course; clean the house";
        schedule[5][0] = "Friday";
        schedule[5][1] = "do the laundry; bath the dog";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "read a book; relax";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please, input the day of the week: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Goodbye!");
                break;
            }
            if (input.startsWith("change ") || input.startsWith("reschedule ")) {
                String day = input.split(" ", 2)[1].trim();
                int dayIndex = getDayIndex(day, schedule);
                if (dayIndex != -1) {
                    System.out.print("Please, input new tasks for " + schedule[dayIndex][0] + ": ");
                    schedule[dayIndex][1] = scanner.nextLine();
                    System.out.println("Tasks for " + schedule[dayIndex][0] + " have been updated.");
                } else {
                    System.out.println("Sorry, I don't understand you, please try again.");
                }
                continue;
            }

            int dayIndex = getDayIndex(input, schedule);
            if (dayIndex != -1) {
                System.out.println("Your tasks for " + schedule[dayIndex][0] + ": " + schedule[dayIndex][1]);
            } else {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }

    private static int getDayIndex(String day, String[][] schedule) {
        for (int i = 0; i < schedule.length; i++) {
            if (schedule[i][0].equalsIgnoreCase(day)) {
                return i;
            }
        }
        return -1;
    }
}
