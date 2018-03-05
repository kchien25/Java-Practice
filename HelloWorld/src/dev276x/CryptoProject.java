import java.util.*;

public class CryptoProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What text would you like to turn into a cypher?");
        String s = input.nextLine();
        System.out.println("How many steps would you like to shift it?");
        int key = input.nextInt();
        System.out.println("How many letters per group?");
        int group = input.nextInt();
        System.out.println(encryptString(s, key, group));
    }
    public static String normalizeText(String s) {
        s = s.replaceAll("\\W", "");
        s = s.toUpperCase();
        return s;
    }
    public static String caeserify(String s, int key) {
        String testAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cryptoAlphabet = shiftAlphabet(key);
        int length = s.length();
        String result = "";
        for (int i = 0; i < length; i++) {
            int sIndex = testAlphabet.indexOf(s.charAt(i));
            char cryptoChar = cryptoAlphabet.charAt(sIndex);
            result += cryptoChar;
        }
        return result;
    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }

    public static String groupify(String s, int num) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        int index = 0;
        while (length % num != 0) {
            s += "x";
            length++;
        }
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                sb.append(s.charAt(i));
            } else if ((i == num) || (i % num == 0)) {
                sb.append(" " + s.charAt(i));
            } else {
                sb.append(s.charAt(i));
            }
        }
        s = sb.toString();
        return s;
    }
    public static String encryptString(String s, int key, int group) {
        String result = groupify((caeserify(normalizeText(s), key)), group);
        return result;
    }
}