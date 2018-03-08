import java.util.*;

public class MazeRunner {
    public static void main(String[] args) {
        Maze myMap = new Maze();
        intro(myMap);
        userMove(myMap);
    }

    public static void intro(Maze myMap) {
        System.out.println("Welcome to Maze Runner!");
        System.out.println("Here is your current position: ");
        myMap.printMap();
    }

    public static Maze userMove(Maze myMap) {
        Scanner input = new Scanner(System.in);
        System.out.println("Where would you like to move? (R, L, U, D)");
        String command = input.next();
        while (myMap.didIWin() == false) {
            if (command.equalsIgnoreCase("R")) {
                if (myMap.canIMoveRight() == false) {
                    myMap.printMap();
                    System.out.println("Sorry, you've hit a wall. Please pick a different direction: ");
                    command = input.next();
                } else {
                    myMap.moveRight();
                    myMap.printMap();
                    command = input.next();
                }
            } else if (command.equalsIgnoreCase("L")) {
                if (myMap.canIMoveLeft() == false) {
                    myMap.printMap();
                    System.out.println("Sorry, you've hit a wall. Please pick a different direction: ");
                    command = input.next();
                } else {
                    myMap.moveLeft();
                    myMap.printMap();
                    command = input.next();
                }
            } else if (command.equalsIgnoreCase("U")) {
                if (myMap.canIMoveUp() == false) {
                    myMap.printMap();
                    System.out.println("Sorry, you've hit a wall. Please pick a different direction: ");
                    command = input.next();
                } else {
                    myMap.moveUp();
                    myMap.printMap();
                    command = input.next();
                }
            } else if (command.equalsIgnoreCase("D")) {
                if (myMap.canIMoveDown() == false) {
                    myMap.printMap();
                    System.out.println("Sorry, you've hit a wall. Please pick a different direction: ");
                    command = input.next();
                } else {
                    myMap.moveDown();
                    myMap.printMap();
                    command = input.next();
                }
            } else {
                System.out.println("Please input only R, L, U, D (Right, Left, Up, Down).");
                command = input.next();
            }
        }
        System.out.println("Congratulations, you made it out alive!");
        return myMap;
    }

    public static void movesMessage() {
        if (moves == "50") {
            System.out.println("Warning: You have made 50 moves, you have 50 remaining before the maze exit closes");
        } else if (moves == "75") {
            System.out.println("Alert! You have made 75 moves, you only have 25 moves left to escape.");
        } else if (moves == "90") {
            System.out.println("DANGER! You have made 90 moves, you only have 10 moves left to escape!!");
        } else if (moves == "100") {
            System.out.println("Oh no! You took too long to escape, and now the maze exit is closed FOREVER!!!");
        } else { }
    }

    public static Maze navigatePit(String command) {
        Scanner input = new Scanner(System.in);
        if (myMap.isThereAPit(command) == true) {
            System.out.println("Watch out! There's a pit ahead, jump it?");
            String pitCommand = input.nextLine();
            if (pitCommand.startsWith("y")) {
                myMap.jumpOverPit(command);
                return myMap;
            }
        } else { }
    }
}