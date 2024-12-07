package javaExerciseone;
/*
 Task 1 
Write a Java method to compute and print the list of prime numbers less than a given parameter. 
The method signature should be as follows:
void printPrimes (int max)

 */

public class Task1 {
    void printPrimes(int max) {
        for (int i = 2; i < max; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i)+1; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.printPrimes(100);
    }
}
