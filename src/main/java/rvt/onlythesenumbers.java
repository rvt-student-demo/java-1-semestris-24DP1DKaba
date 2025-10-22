package rvt;

public class onlythesenumbers {

    public static void printSpecificNumbers() {
        int[] numbers = {3, 6, 9, 12, 15, 18};
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printSpecificNumbers();
    }
}