import java.util.*;

public class testing {
    public static void main(String[] args) {
        System.out.println("***** Welcome to Battleship *****");
        System.out.println("");
        System.out.println("Right now, the sea is empty.");
        System.out.println("");
        String[][] map = new String[12][16];
        for (int i = 0; i < 12; i += 11) {
            int index = 0;
            for (int j = 0; j < 16; j++) {
                if ((j > 2) && (j < 13)) {
                    String strIndex = Integer.toString(index);
                    map[i][j] = strIndex;
                    index++;
                    System.out.print(map[i][j]);
                } else {
                    map[i][j] = " ";
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }
}

