import java.util.*;

public class testing2 {
    public static void main(String[] args) {
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
        
        Random rand = new Random();
        int computerShipCount = 0;
        System.out.println("Computer is deploying ships!");
        ArrayList<String> computerShips = new ArrayList<String>();
        int coordinate = rand.nextInt(10);
        while (computerShipCount < 5) {
            int x = coordinate;
            coordinate = rand.nextInt(10);
            int y = coordinate;
            String xCoor = Integer.toString(x);
            String yCoor = Integer.toString(y);
            if (map[y][x] == " ") {
                String shipCoordinate = xCoor + yCoor;
                computerShips.add(shipCoordinate);
                computerShipCount++;
                System.out.println(computerShipCount + ". ship DEPLOYED");
            } else { }
        }

        String computerShipsString = String.join(", ", computerShips);
        System.out.println(computerShipsString);
    }
}