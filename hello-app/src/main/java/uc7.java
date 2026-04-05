package main.java;      
public class uc7 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No names provided.");
        } else {
            String allNames = String.join(", ", args);
            System.out.println("Hello, " + allNames + "!");
        }
    }
}