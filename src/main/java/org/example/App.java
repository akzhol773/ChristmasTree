package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        InputFunctions input = new InputFunctions();

        int height = input.askUserForInt("Enter height of the Christmas tree:", 4, 30);

        drawChristmasTree(height);


    }

    public static void drawChristmasTree(int height) {
        for (int space = 0; space <= height - 1; space++) {
            System.out.print(" ");

        }
        System.out.print("\u2B50");
        for (int i = 0; i < height; i++) {
            //prints indentation
            for (int space = 0; space <= height - i; space++) {
                System.out.print(" ");
            }


            //prints stars
            for (int star = 0; star <= i * 2 - 1; star++) {
                System.out.printf("\033[0;3%dm" + "*" + "\033[0m", 1 + (int) (Math.random() * ((7 - 1) + 1)));
            }

            //prints new line
            System.out.println();

        }
        for (int space = 0; space <= height - 1; space++) {
            System.out.print(" ");

        }

        System.out.print("\033[0;34m" + "||" + "\033[0m");
        System.out.println();

    }
}
