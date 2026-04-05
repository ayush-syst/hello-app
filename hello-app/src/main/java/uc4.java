package main.java;

public class uc4 {
    public static void main(String[] args) {
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
