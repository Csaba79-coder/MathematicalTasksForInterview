package model;

public class Combinatorics {

    Factorial factorial = new Factorial();

    // 5 ppl how they can seat next to each other in a cinema?
    // 5 * 4 * 3 * 2 * 1 == 5! ie. 5 factorial

    public long countPermutationNoRepetition(int num) {
        return factorial.countFactorial(num);
    }

    // I have 3 apples and 2 pears --> elements are repeating!
    // because of element repetition I need to take care of order (sequence / place)
    // If I switch two of the apples in place that does not give a new solution, that is the same sequence as before!

    public long countPermutationWithRepetition(int num, int item1, int item2) {
        return factorial.countFactorial(num) / (factorial.countFactorial(item1) * factorial.countFactorial(item2));
    }

    // swimming-match (8 lane!) 3 winners! - count how many variation is exists!!!
    // first place can be taken by 8, second by 7 and third position by 6 swimmer!

    public int countVariationNoRepetition(int num) {
        return (num * (num-1) * (num - 2));
    }

    // Football-pool --> Pools to play:
    // Pools in Hungary has 13 + 1 match --> can be home, guest and tie (3 variation!)

    public long countVariationWithRepetition(int numOfMatch, int numOfGuesses) {
        return (long) Math.pow((double) numOfGuesses, (double) numOfMatch);
    }

    // Lottery --> 5 numbers from 90 numbers

    // to calculator: 90 nCr 5 --> 43.949.268

    public long countCombinationNoRepetition(int allNums, int guessedNum) {
        return factorial.countFactorial(allNums) /
                ((factorial.countFactorial(guessedNum)) * (factorial.countFactorial(allNums - guessedNum)));
    }
}
