import java.util.*;

public class testing {
    public static void main(String[] args) {
        caeserify("THISISSOMEREALLYGREATTEXT", 3);
    }
    public static String caeserify(String s, int key) {
        String testAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cryptoAlphabet = shiftAlphabet(key);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int sIndex = testAlphabet.indexOf(s.charAt(i));
            char cryptoChar = cryptoAlphabet.charAt(sIndex);
            s.replace(s.charAt(i), cryptoChar);
        }
        System.out.println(s);
        return s;
        // set index of the s letter to sindex
        // set equivalent character of crypto char to cryptochar
        // for every i in s.length(), replace 
        // key amount of times
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
}

