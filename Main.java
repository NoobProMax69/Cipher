package se.hkr;

public class Main {

    public static void main(String[] args) {
	    Cipher shiftCipher = new ShiftCipher(3);
        Cipher replacementCipher = new ReplacementCipher("NOPQRSTUVWXYZABCDEFGHIJKLM");

        String originalText = "Hello, World!";

        System.out.println("\n--- Encryption and Decryption Application ---\n");
        System.out.println("Original text: \"" + originalText + "\"\n");
        System.out.println("Encrypted Text (Shift Cipher): \"" + ShiftCipher.encrypt(originalText) + "\"");
        System.out.println("Encrypted Text (Replacement Cipher): \"" + ReplacementCipher.encrypt(originalText) + "\"");

        String encryptedTextShift = shiftCipher.encrypt(originalText);
        String encryptedTextReplacement = replacementCipher.encrypt(originalText);

        System.out.println("Decrypted Text (Shift Cipher): \"" + ShiftCipher.decrypt(originalText) + "\"");
        System.out.println("Decrypted Text (Replacement Cipher): \"" + ReplacementCipher.decrypt(originalText) + "\"");
    }
}
