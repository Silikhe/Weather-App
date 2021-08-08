import java.io.Console;

public class App {
    public static void main (String[] args){
        Console newConsole = System.console();

        System.out.println("Input String:");
        String text = newConsole.readLine();


        System.out.println("Encryption Number/Key:");
        Integer key = Integer.parseInt(newConsole.readLine());

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
