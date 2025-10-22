package rvt;

public class listsize {

    public static int listSize(String[] list) {
        return list.length;
    }

    
    public static void main(String[] args) {
        String[] exampleList = {"apple", "banana", "cherry"};
        System.out.println("The size of the list is: " + listSize(exampleList));
    }
}