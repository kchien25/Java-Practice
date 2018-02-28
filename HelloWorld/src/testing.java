import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        System.out.println("c.");
        int k = 1;
        while (k <= 2) {
            // this means everything inside will repeat twice
            j = 1;
            while (j <= 1) {
                // this means everything inside will repeat three times
                int i = 1;
                while (i <= 4) {
                    // this means everything here will repeat four times
                    System.out.print("*");
                    i++;
                }
                System.out.print("!");
                j++;
            }
            System.out.println();
            k++;
        }
    }
}

/* 
System.out.println("c.");
- this prints c. then starts a new line
for (int i = 1; i <= 2; i++) {
    - this means that everything within the braces will repeat twice after everything inside repeats
    for (int j = 1; j <= 3; j++) {
        - this means that everything within this will repeat 3 times after everything inside repeats
        for (int k = 1; k <= 4; k++) {
            - this means this will repeat 4 times
            System.out.print("*");
            - will print * 4 times then go out
        }
        System.out.print("!");
        - will print ! once then go out
    }
    System.out.println();
    - will make a new line
}
System.out.println();
- will make a new line
*\