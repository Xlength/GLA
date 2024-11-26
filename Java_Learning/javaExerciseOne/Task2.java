package javaExerciseOne;
/*
Task 2 
Write a Java method to compute and return the Nth Fibonacci number, which is a sequence of 
numbers where each number is the sum of the preceding two (see 
https://en.wikipedia.org/wiki/Fibonacci_number if you can’t remember the details). The method 
signature should be as follows:
int computeFibonacci (int n)
 */
public class Task2 {
    int computeFibonacci(int n){
        int fib1=0;
        int fib2=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=fib1+fib2;
            fib1=fib2;
            fib2=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Task2 task2=new Task2();
        // System.out.println(task2.computeFibonacci(3));
        Task3 task3=new Task3();
        System.out.println(task3.computeScore("hello"));
    }
}
