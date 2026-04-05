package main.java;
public class uc5 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No names provided.");
        } else {
            StringBuilder names = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            System.out.println("Hello, " + names + "!");
        }
    }
    
}