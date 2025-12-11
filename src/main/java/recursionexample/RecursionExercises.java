package recursionexample;

/**
 * Assignment: Recursion mini-tasks.
 *
 * Implement the methods below following the assignment handout.
 * You may add private helper methods if you like.
 */
public class RecursionExercises {

    // Task 1: recursive factorial
    //this task uses recursive instead of a loop based program
    public static long factorialRecursive(int n) {
        // TODO: implement Task 1
        if(n<0){
            throw new IllegalArgumentException();
        }
        if (factorialRecursive(0) == 0|| factorialRecursive(1) == 1) {
            return 1;
        }
        return n * factorialIterative(n-1);

    }

    // Task 2: iterative factorial
    //this Task uses a loop for the method instead od recursive
    public static long factorialIterative(int n) {
        // TODO: implement Task 2
        if(n<0){
            throw new IllegalArgumentException();
        }
        if (factorialIterative(0) == 1|| factorialIterative(1) == 1) {
            return 1;
        }
        for(int i = 2 ; i <= n ; i++){
            factorialIterative(i);
        }

        return factorialIterative(n);
    }

    // Task 3: recursive Fibonacci
    //uses recursive for fibonacci sequence
    public static long fibonacciRecursive(int n) {
        // TODO: implement Task 3
        if(n<0){
            throw new IllegalArgumentException();
        }
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    // Task 4: recursive sum of an array (use the helper below)
    //uses the helper to sum the array by using recursive method
    public static long sumArray(int[] data) {
        // TODO: implement Task 4
        if(data==null){
            return 0;
        }
        if(data.length==0){
            return 0;
        }

        return sumArrayFromIndex(data, 0);
    }

    // Helper for Task 4
    private static long sumArrayFromIndex(int[] data, int index) {
        // TODO: implement Task 4 helper
        if(index==data.length){
            return 0;
        }

        return data[index] + sumArrayFromIndex(data, index+1);
    }

    // Task 5: recursive string reverse
    public static String reverse(String s) {
        // TODO: implement Task 5
        if(s==null){
            return null;
        }
        if(s.length()==0){
            return s;
        }
        return reverse(s.substring(1) +  s.charAt(0));
    }
}
