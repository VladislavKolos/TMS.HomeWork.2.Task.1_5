package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter temperature");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
        scanner.close();
    }
}
