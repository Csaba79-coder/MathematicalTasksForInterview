package model;

public class Factorial {

    // in general used in combinatorics!

    // 3! --> 1 * 2 * 3 = 6
    // 5! --> 1 * 2 * 3 * 4 * 5 = 120
    // n! --> 1 * 2 * 3 * ... * (n-1) * n = ...

    public long countFactorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public long factorialWithRecursion(int num) {
        if (num == 1) {
            return 1;
        }
        return (num * factorialWithRecursion(num -1));
    }
}
