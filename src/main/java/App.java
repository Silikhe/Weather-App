import java.io.BufferedReader;
import java.io.Console;
import java.util.Scanner;

public class App {
    private String text;

    public static void main (String[] args){
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Input String:");
      String text = newScanner.nextLine();


        System.out.println("Encryption Number/Key:");
        Integer key = Integer.parseInt(newScanner.nextLine());

        Encrypt newEncryption = new Encrypt(text, key);

        if(!newEncryption.isString()){
            System.out.println("Invalid Entry");
        }

        if (!newEncryption.isInRange()){
            System.out.println("Key Range is between 1 and 25");
        }

//      Prints Encrypted text
        String encryptedText = newEncryption.forward();
        System.out.println(String.format("Encrypted String: %s", encryptedText));

        //        creates new decryption object
        Decrypt newDecryption = new Decrypt(encryptedText, key);

        //        Prints Decrypted text
        String deryptedText = newDecryption.backward();
        System.out.println(String.format("Decrypted String: %s", deryptedText));

    }
}
