package rvt;

public class MicrowaveMenu {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the time as a sequence of digits: ");
        String input = scanner.nextLine();

        int length = input.length();
        String minutes;
        String seconds;

        if (length <= 2) {
            minutes = "0";
            seconds = input;
        } else {
            minutes = input.substring(0, length - 2);
            seconds = input.substring(length - 2);
        }

        System.out.println("Time: " + minutes + ":" + seconds);

    }
}