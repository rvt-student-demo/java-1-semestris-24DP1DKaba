package rvt;

public class WordTriangle {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a word --> ");
        String word = scanner.nextLine();

        int len = word.length();
        for (int i = 0; i <= len / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(word.substring(i, len - i));
        }
    }
}