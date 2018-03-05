import java.util.*;

public class testing2 {
    public static void main(String[] args) {
        groupify("THISISSOMEREALLYGREATTEXT", 5);
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
        System.out.println(s);
        return s;
    }
}