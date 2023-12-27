package task5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            if (userNumber <= 0) {
                System.out.println("re-Enter");
            } else {
                int sum = 0;
                for (int i = 1; i <= userNumber; i++) {
                    sum += i;
                }
                System.out.println("Sum = " + sum);
                return;
            }
        }
        scanner.close();
    }
}