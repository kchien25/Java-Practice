import java.util.*;

public class Battleship {
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

    // player setting up their ships
        System.out.println();
        System.out.println("Time to set up your ships!");
        Scanner input = new Scanner(System.in);
        int shipCount = 0;
        while (shipCount < 5) {
            System.out.println();
            System.out.print("Enter x coordinate for your ship: ");
            int x = input.nextInt();
            while ((x > 9) || (x < 0)) {
                System.out.println("Invalid input. You can only choose coordinates between 0 and 9.");
                System.out.print("Enter x coordinate for your ship: ");
                x = input.nextInt();
            }
            x += 3;
            System.out.print("Enter y coordinate for your ship: ");
            int y = input.nextInt();
            while ((y > 9) || (y < 0)) {
                System.out.println("Invalid input. You can only choose coordinates between 0 and 9.");
                System.out.print("Enter y coordinate for your ship: ");
                y = input.nextInt();
            }
            y += 1;
            if (map[y][x] == " ") {
                map[y][x] = "@";
                shipCount++;
                printPlayerMap(map);
            } else {
                System.out.println("Sorry, that's an invalid position. Please choose again.");
            }
        }
        System.out.println();   
        
        // computer sets up ships
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
            x += 3;
            y += 1;
            if (map[y][x] == " ") {
                String shipCoordinate = xCoor + yCoor;
                computerShips.add(shipCoordinate);
                computerShipCount++;
                System.out.println(computerShipCount + ". ship DEPLOYED");
            } else { }
        }

        int turn = 0;
        int playerLives = 5;
        int computerLives = 5;

        // taking turns to sink ships
        ArrayList<String> guessList = new ArrayList<String>();
        while ((playerLives > 0) && (computerLives > 0)) {
            if (turn % 2 == 0) {
                System.out.println();
                System.out.println("YOUR TURN");
                System.out.print("Enter X coordinate: ");
                int x = input.nextInt();
                while ((x > 9) || (x < 0)) {
                    System.out.println("Invalid input. You can only choose coordinates between 0 and 9.");
                    System.out.print("Enter x coordinate for your ship: ");
                    x = input.nextInt();
                }
                System.out.print("Enter Y coordinate: ");
                int y = input.nextInt();
                while ((y > 9) || (y < 0)) {
                    System.out.println("Invalid input. You can only choose coordinates between 0 and 9.");
                    System.out.print("Enter y coordinate for your ship: ");
                    y = input.nextInt();
                }
                String xCoor = Integer.toString(x);
                String yCoor = Integer.toString(y);
                String arrayCheck = xCoor + yCoor;
                x += 3;
                y += 1;
                if (!guessList.contains(arrayCheck) == true) {
                    if (map[y][x] == "@") {
                        System.out.println("Oh, no, you sunk your own ship :(");
                        map[y][x] = "x";
                        guessList.add(arrayCheck);
                        playerLives--;
                        turn++;
                    } else if (computerShips.contains(arrayCheck)) {
                        System.out.println("Boom! You sunk the ship!");
                        map[y][x] = "!";
                        guessList.add(arrayCheck);
                        computerLives--;
                        turn++;
                    } else {
                        System.out.println("You missed.");
                        map[y][x] = "-";
                        guessList.add(arrayCheck);
                        turn++;
                    }
                    printPlayerMap(map);
                } else {
                    printPlayerMap(map);
                    System.out.println();
                    System.out.println("Sorry, that coordinate's been guessed. Pick another coordinate.");
                }
                System.out.println();
                System.out.println("Your ships: " + playerLives + " | Computer ships: " + computerLives);
            } else {
                System.out.println();
                System.out.println("COMPUTER'S TURN!");
                coordinate = rand.nextInt(10);
                int x = coordinate;
                coordinate = rand.nextInt(10);
                int y = coordinate;
                String xCoor = Integer.toString(x);
                String yCoor = Integer.toString(y);
                String arrayCheck = xCoor + yCoor;
                System.out.println("Computer guessed " + arrayCheck);
                x += 3;
                y += 1;
                if (!guessList.contains(arrayCheck) == true) {
                    if (map[y][x] == "@") {
                        System.out.println("The Computer sunk one of your ships!");
                        map[y][x] = "x";
                        guessList.add(arrayCheck);
                        playerLives--;
                        turn++;
                    } else if (computerShips.contains(arrayCheck)) {
                        System.out.println("The Computer sunk one of its own ships!");
                        map[y][x] = "!";
                        guessList.add(arrayCheck);
                        computerLives--;
                        turn++;
                    } else {
                        System.out.println("Computer missed.");
                        map[y][x] = "-";
                        guessList.add(arrayCheck);
                        turn++;
                    }
                   printPlayerMap(map);
                }
                System.out.println();
                System.out.println("Your ships: " + playerLives + " | Computer ships: " + computerLives);
            }
        }
        if (computerLives == 0) {
            System.out.println();
            System.out.println("Hooray! You win the battle! :)");
            System.out.println();
        } else if (playerLives == 0) {
            System.out.println();
            System.out.println("Wow, you suck at this. Better luck next time, loser.");
            System.out.println();
        }
    }
    public static void printPlayerMap(String[][] map) {
        System.out.println();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}