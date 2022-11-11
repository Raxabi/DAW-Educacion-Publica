package Halley.utils;

public class Mathja {
    public static void checkPrimeNumber(int primeNumber) {
        
        if((primeNumber % 2 == 0 ) || (primeNumber % 3 == 0)) {
            System.out.println("That number is not a primer number");
        } else {
            System.out.println("That number is a primer number!");
        }
    }

    /**
     * Calculate the factorial value of a number
     * @param num The number that will be calculated
     * @return A Long number, result of calculate the factorial
     */
        public static long factorial(long num) {

        long counter = 1;
        for (int i = 1; i <= num; i++) {
            counter *= i;
        }

        // If the calculated factorial value is negative, it will return -1
        // else, if its a long / normal / expected value it will return it
        if (counter < 0) {
            return -1;
        } else {
            return counter;
        }
    }

    /**
     * Calculate the combinatorial of two numbers taked as arguments
     * @param numerator
     * @param denominator
     * @return {@code result} The result of the combinatorial
     */
    public static long combinatorial(int numerator, int denominator) {

        if (numerator <= denominator) {
            throw new Error("The numerator can not be more small or equal than the denominator");
        }

        if (numerator <= 0) {
            throw new Error("The numerator can not be small or equal than 0");
        }

        if (denominator <= 0) {
            throw new Error("The denominator can not be small or equal than 0");
        }

        long numeratorFact = factorial(numerator);
        long factorialDenominator = factorial(denominator);
        int substract = numerator - denominator;
        long substractResult = factorial(substract);
        long result = numeratorFact / (factorialDenominator * (substractResult));

        return result; 
    }

    /**
     * 
     * Sum all the dividers of the num from the input except itself
     * 
     * @param num The num that whant to calculate the dividers
     * @return the sum of all the dividers
     */
    private static int dividerSum(int num) {
        int sum = 1;
        for(int i = 2 ; i <= num / 2 ; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Check if the num is a perfect number
     * @param num
     * @return true if {@code num} is a perfect number or false if is not perfect
     */
    public static boolean perfect(int num) {
        
        if (dividerSum(num) == num) {
            return true;
        } else {
            return false;
        }
    }

    public static long primeBetween() {
        return 0;
    }

    public static long recursiveFibonnacci(int numOfFib) {
        if (numOfFib < 2) {
            return numOfFib;
        }
        return recursiveFibonnacci(numOfFib - 1) + recursiveFibonnacci(numOfFib - 2);
    }

    public static void nonRecursiveFibonacci(int numOfFib) {
        int fiboCounter1 = 0;
        int fiboCounter2 = 1;
        int counter = 0;
        for (int i = 2; i < numOfFib; i++) {
            counter = fiboCounter1 + fiboCounter2;
            System.out.println(counter);
            fiboCounter1 = fiboCounter2;
            fiboCounter2 = counter;

        }
    }

    public static long recursiveExponent(int numOfFib) {
        
    }
}
