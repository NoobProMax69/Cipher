package se.hkr;
import java.lang.Override;

public class ShiftCipher implements Cipher{

    private int ShiftNumber;

    public ShiftCipher(int ShiftNumber) {
        this.ShiftNumber = ShiftNumber;
    }

    public String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        char[] textChars = text.toCharArray();
        for (int i = 0; i < textChars.length(); i++) {
            char ch = text.charAt(i);
            char encryptedChar = encryptCharacter(ch, ShiftNumber);
            encryptedText.append(encryptedChar);
        }

        return encryptedText.toString();
    }

    private static char encryptCharacter(char ch, int shift) {
        if (Character.isLetter(ch)) {
            char base;
            if (Character.isUpperCase(ch)) {
                base = 'A';
            }
            else {
                base = 'a';
            }
            int shifted = (ch - base + shift) % 26 + base;
            return (char) shifted;
        }
        return ch;
    }

    public String decrypt(String text) {
        return encrypt(text, -shiftNumber);
    }

}
