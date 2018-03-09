import java.util.*;

public class testing {
    public static void main(String[] args) {
        // greeting the player
        System.out.println("***** Welcome to Battleship *****");
        System.out.println("");
        System.out.println("Right now, the sea is empty.");
        System.out.println("");
        ArrayList<String> guessList = new ArrayList<String>();
        String arrayCheck = "47";
        int x = 0;
        while ( x < 5) {
            guessList.add(arrayCheck);
            System.out.println(guessList);
            x++;
        }
        System.out.println(guessList.contains(arrayCheck));
    }
}

