package se.hkr;
import java.lang.Override;
import java.util.Locale;

public class ReplacementCipher implements Cipher {

    public ReplacementCipher(String replacementLetters) {
        this.replacementLetters = replacementLetters;
    }

    public static String originalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String originalLower = originalLetters.toLowerCase();
    public static String replacementLetters = "NOPQRSTUVWXYZABCDEFGHIJKLM";
    public static String replacementLower = replacementLetters.toLowerCase();



    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        char[] textChars = text.toCharArray();
        for(int i = 0; i < textChars.length; i++) {
            for(int j = 0; j < textChars.length; j++) {
                if(Character.isUpperCase(textChars[i])){
                    if(textChars[i] == originalLetters.charAt(j)) {
                        encryptedText.append(replacementLetters.charAt(j));
                    }
                }
                else if(Character.isLowerCase(textChars[i])){
                    if(textChars[i] == originalLower.charAt(j)) {
                        encryptedText.append(replacementLower.charAt(j));
                    }
                }
                else {
                    encryptedText.append(textChars[i]);
                }
            }
        }
        return encryptedText.toString();
    }


    public static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();
        char[] textChars = text.toCharArray();

        for(int i = 0; i < textChars.length; i++) {
            for(int j = 0; j < textChars.length; j++) {
                if(Character.isUpperCase(textChars[i])){
                    if(textChars[i] == replacementLetters.charAt(j)) {
                        decryptedText.append(originalLetters.charAt(j));
                    }
                }
                else if(Character.isLowerCase(textChars[i])){
                    if(textChars[i] == replacementLower.charAt(j)) {
                        decryptedText.append(originalLower.charAt(j));
                    }
                }
                else {
                    decryptedText.append(textChars[i]);
                }
            }
        }
        return decryptedText.toString();
    }
}
