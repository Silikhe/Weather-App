import java.io.BufferedReader;
import java.io.Console;
import java.util.Scanner;

public class App {
    private String text;
    private int key;

    public static void main (String[] args){

        boolean valid = true;

        while(valid){
            System.out.print("1. Encryption\n2. Decryption\nChoose(1,2 or 3 to exit): ");
            Scanner newScanner = new Scanner(System.in);
            int choice = newScanner.nextInt();

            if (choice == 1){
                System.out.println("Encryption");
                newScanner.nextLine();
                System.out.println("Input String Text: ");
                String text = newScanner.nextLine();

                System.out.println("Decryption Key:");
                Integer key = Integer.parseInt(newScanner.nextLine());
                newScanner.nextLine();

                Encrypt newEncryption = new Encrypt(text, key);
                System.out.print("Enter text to encrypt: ");

                if(!newEncryption.isString()){
                    System.out.println("Invalid Entry");
                }

                if (!newEncryption.isInRange()){
                    System.out.println("Key Range is between 1 and 25");
                }

                //      Prints Encrypted text
                String encryptedText = newEncryption.forward();
                System.out.println(String.format("Encrypted String: %s", encryptedText));

            }
            else if (choice == 2){
                System.out.println("Decryption");
                newScanner.nextLine();
                System.out.println("Input String Text: ");
                String text = newScanner.nextLine();
                System.out.println("Encryption Key:");
                Integer key = Integer.parseInt(newScanner.nextLine());

                Encrypt newEncryption = new Encrypt(text, key);

                if(!newEncryption.isString()){
                    System.out.println("Invalid Entry");
                }

                if (!newEncryption.isInRange()){
                    System.out.println("Key Range is between 1 and 25");
                }

                String encryptedText = newEncryption.forward();

                //        creates new decryption object
                Decrypt newDecryption = new Decrypt(encryptedText, key);

                //        Prints Decrypted text
                String deryptedText = newDecryption.backward();
                System.out.println(String.format("Decrypted String: %s", deryptedText));
            }

           else if (choice == 3){
                System.out.println("Exit");
                valid=false;
           }else if (choice > 3 || choice < 3){
                System.out.println("Choose a valid choice");
            }
           else {
                System.out.println("Try again!");
            }
        }


  }



}
