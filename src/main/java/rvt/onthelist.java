package rvt;

public class onthelist {

    public static void printOnTheList(String[] list, int index) {
        if (index < 0 || index >= list.length) {
            System.out.println("Index out of bounds");
        } else {
            System.out.println(list[index]);
        }
    }

    public static void main(String[] args) {
        String[] items = {"apple", "banana", "cherry", "date"};
        printOnTheList(items, 2);
        printOnTheList(items, 4); 
    }
}