package az.tasks.weeklytasks1;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Введите количество строк и столбцов (через пробел): ");
        String[] dimensions = scanner.nextLine().split(" "); // Разделяем строку на две части
        int rows = Integer.parseInt(dimensions[0]);
        int columns = Integer.parseInt(dimensions[1]);


        int[][] maze= new int[rows][columns];

        System.out.println("Input numbers of seed on each box with space");
             for (int i = 0; i < rows; i++) {
                String[] inputRow = scanner.nextLine().split(" ");
                 for (int j = 0; j < columns; j++) {
                    maze[i][j] = Integer.parseInt(inputRow[j]);
                }
            }

            System.out.println("\nЛабиринт с зернами: ");
            printMaze(maze);

            // Поиск пути с максимальным количеством зерен
            int maxSeeds = findMaxSeedsPath(maze, rows, columns);
            System.out.println("Максимальное количество съеденных зерен: " + maxSeeds);
        }

        public static void printMaze(int[][] maze) {
            for (int[] row : maze) {
                for (int cell : row) {
                    System.out.print(cell + " ");
                }
                System.out.println();
            }
        }

        public static int findMaxSeedsPath(int[][] maze, int rows, int cols) {
            int[][] dp = new int[rows][cols];

            dp[rows - 1][0] = maze[rows - 1][0];

            for (int i = rows - 2; i >= 0; i--) {
                dp[i][0] = dp[i + 1][0] + maze[i][0];
            }

            for (int j = 1; j < cols; j++) {
                dp[rows - 1][j] = dp[rows - 1][j - 1] + maze[rows - 1][j];
            }

            for (int i = rows - 2; i >= 0; i--) {
                for (int j = 1; j < cols; j++) {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]) + maze[i][j];
                }
            }

            return dp[0][cols - 1];
        }
            
        }

