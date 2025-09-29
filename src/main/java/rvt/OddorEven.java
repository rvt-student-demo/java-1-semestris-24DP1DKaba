package rvt;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int in = Integer.valueOf(scanner.nextLine());

        if (in % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}