package module;

import model.Combinatorics;
import model.Factorial;
import model.Fibonacci;
import model.FibonacciLong;

public class Processor {

    public void run() {
        System.out.println("------------------------");
        System.out.println("Factorial: ");
        int fact1 = 3;
        int fact2 = 4;
        int fact3 = 5;

        System.out.println(new Factorial().countFactorial(fact1));
        System.out.println(new Factorial().countFactorial(fact2));
        System.out.println(new Factorial().countFactorial(fact3));

        System.out.println("------------------------");
        System.out.println("Permutation with no repetition: ");

        System.out.println(new Combinatorics().countPermutationNoRepetition(5));

        System.out.println("------------------------");
        System.out.println("Permutation with repetition: ");
        System.out.println(new Combinatorics().countPermutationWithRepetition(5, 3, 2));

        System.out.println("------------------------");
        System.out.println("Variation with no repetition: ");
        System.out.println(new Combinatorics().countVariationNoRepetition(8));

        System.out.println("------------------------");
        System.out.println("Variation with repetition: ");
        long result = new Combinatorics().countVariationWithRepetition(14, 3);
        System.out.println(result);

        System.out.println("------------------------");
        System.out.println("Combination with no repetition: ");
        // combination of five and 3!!! --> output: 10
        long combination = new Combinatorics().countCombinationNoRepetition(5, 3);
        System.out.println(combination);

        System.out.println("------------------------");
        System.out.println("Factorial with recursion: ");

        System.out.println(new Factorial().factorialWithRecursion(6));

        System.out.println("------------------------");
        System.out.println("Fibonacci: ");

        new Fibonacci().fibonacci(10);

        System.out.println("------------------------");
        System.out.println("Fibonacci with recursion: ");

        new Fibonacci().printFibonacciRecursion(10);

        long startTime = System.nanoTime();
        new FibonacciLong().printFibonacciRecursionLong(50);
        long endTime = System.nanoTime();
        long runTime = endTime - startTime;
        double elapsedTimeInSecond = (double) runTime / 1_000_000_000;
        System.out.println("The Fibonacci with recursion takes: " + elapsedTimeInSecond + " second");
    }
}
