package rvt;

import java.util.Scanner;

public class multiplesums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter numbers:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            sum += number;

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}