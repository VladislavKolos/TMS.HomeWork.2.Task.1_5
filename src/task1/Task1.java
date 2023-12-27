package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        double userNumber = scanner.nextDouble();
        if (userNumber == 0 || userNumber % 1 != 0) {
            System.out.println("re-Enter");
        } else if (userNumber % 2 == 0) {
            int userEvenNumber = (int) userNumber;
            System.out.println(userEvenNumber + " - Even number");
        } else {
            int userOddNumber = (int) userNumber;
            System.out.println(userOddNumber + " - Odd number");
        }
        scanner.close();
    }
}

