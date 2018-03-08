import java.util.*;

public class Battleship {
    public static void main(String[] args) {
    // greeting the player
        System.out.println("***** Welcome to Battleship *****");
        System.out.println("");
        System.out.println("Right now, the sea is empty.");
        System.out.println("");

    // initializing the map
        String[][] map = new String[11][16];
        for (int i = 0; i < 1; i++) {
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
        int rowIndex = 0;
        for (int i = 0; i < 10; i++) {
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
            System.out.println();
        }
        for (int i = 10; i < 11; i++) {
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

    // player setting up their ships
        System.out.println();
        System.out.println("Time to set up your ships!");
        Scanner input = new Scanner(System.in);
        int shipCount = 0;
        while (shipCount < 5) {
            System.out.print("Enter x coordinate for your ship: ");
            int x = input.nextInt();
            x += 3;
            System.out.print("Enter y coordinate for your ship: ");
            int y = input.nextInt();
            if (map[y][x] == " ") {
                map[y][x] = "@";
                shipCount++;
                printMap(map);
            } else {
                System.out.println("Sorry, that's an invalid position. Please choose again.");
            }
        }   
    }
    public static void printMap(String[][] map) {
        System.out.println();
        for (int i = 0; i < 1; i++) {
            int index = 0;
            for (int j = 0; j < 16; j++) {
                if ((j > 2) && (j < 13)) {
                    String strIndex = Integer.toString(index);
                    map[i][j] = strIndex;
                    index++;
                } else {
                    map[i][j] = " ";
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}