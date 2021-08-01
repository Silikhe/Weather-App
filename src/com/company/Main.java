package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
        System.out.println(" | 1  2  3  4  5  6  7  8  9");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Your secret message: ");
        String message = console.nextLine();
        message = message.toLowerCase();

        System.out.print("Your secret key: ");
        int key = console.nextInt();

        System.out.print("Your encoded message is: ");
        encode(message, key);
    }

    // Encodes the given message using the key as the shift value
    public static void encode(String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                System.out.print(" ");
            } else {
                System.out.print((char) (c + key));
            }
        }
        System.out.println();
    }

    // We can also write a decode method, which shifts each letter back
    // to its original letter, just by using subtraction!
    public static void decode(String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                System.out.print(" ");
            } else {
                System.out.print((char) (c - key));
            }
        }
        System.out.println();
    }
}
