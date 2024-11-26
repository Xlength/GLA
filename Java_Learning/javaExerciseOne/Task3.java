package javaExerciseOne;

import java.util.Scanner;

/*
Implement a method computeScore that correctly computes and returns the score that you
would receive in the game of Scrabble1
for the string given as a parameter – that is, you must add up
the score of each letter in the string and return the total value. Refer to the following table of values
for each letter:
 * 
 */
public class Task3 {
    int computeScore (String str) {
        // Initialise counter and normalise string
        int total = 0;
        str = str.toLowerCase();
        // Go through the string and add up the score
        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'l':
                case 'n':
                case 'o':
                case 'r':
                case 's':
                case 't':
                case 'u':
                total++;
                break;
                case 'd':
                case 'g':
                total += 2;
                break;
                case 'b':
                case 'c':
                case 'm':
                case 'p':
                total += 3;
                break;
                case 'f':
                case 'h':
                case 'v':
                case 'w':
                case 'y':
                total += 4;
                break;
                case 'k':
                total += 5;
                break;
                case 'j':
                case 'x':
                total += 8;
                break;
                case 'q':
                case 'z':
                total += 10;
                break;
                default:
            // Nothing needed here -- we ignore all other  characters
            }
        }
        // This is the total score
        return total;
        }
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println(task3.computeScore(input));
        }
        
}
