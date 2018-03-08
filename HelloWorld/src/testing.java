import java.util.*;

public class testing {
    public static void main(String[] args) {
        // greeting the player
        System.out.println("***** Welcome to Battleship *****");
        System.out.println("");
        System.out.println("Right now, the sea is empty.");
        System.out.println("");

    // initializing the map
        String[][] map = new String[12][16];
        int rowIndex = 0;
        for (int i = 0; i < 12; i++) {
            if ((i == 0) || (i == 11)) {
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
            } else {
                for (int j = 0; j < 16; j++) {
                    if ((j == 0) || (j == 15)) {
                        String strRowIndex = Integer.toString(rowIndex);
                        map[i][j] = strRowIndex;
                        System.out.print(map[i][j]);
                    } else if ((j == 2) || (j == 13)) {
                        map[i][j] = "|";
                        System.out.print(map[i][j]);
                    } else {
                        map[i][j] = " ";
                        System.out.print(map[i][j]);
                    }
                }
                rowIndex++;
            }
            System.out.println();
        }
    }
}

