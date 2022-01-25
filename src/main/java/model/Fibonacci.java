package model;

public class Fibonacci {

    int recursionFirstNum = 0, recursionSecondNum = 1;
    int recursionThirdNum;

     // Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 (sequence of numbers!)

    public void fibonacci(int num) {
        int firstNum = 0, secondNum = 1;
        int thirdNum;

        System.out.print(firstNum + ", " + secondNum);

        for (int i = 2; i <= num - 1; i++) {
            thirdNum = firstNum + secondNum;
            System.out.print(", " + thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
        }
        System.out.println();
    }

    public int fibonacciWithRecursion(int num) {
        if(num == 0){
            return 0;
        }
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacciWithRecursion(num-2) + fibonacciWithRecursion(num - 1);
    }

    public void printFibonacciRecursion(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciWithRecursion(i) + " ");
        }
        System.out.println();
    }
}
