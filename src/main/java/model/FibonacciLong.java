package model;

public class FibonacciLong {

    public long fibonacciWithRecursionLong(long num) {
        if(num == 0){
            return 0;
        }
        if(num == 1 || num == 2){
            return 1;
        }
        return fibonacciWithRecursionLong(num-2) + fibonacciWithRecursionLong(num - 1);
    }

    public void printFibonacciRecursionLong(long num) {
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciWithRecursionLong(i) + " ");
        }
        System.out.println();
    }
}
