// 2. Simple Arithmetic
// Declare two integer variables num1 and num2. Assign them values and print:

// Their sum
// Their difference
// Their product
// Example output:
// The sum of 5 and 3 is 8.


public class Q2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        // Calculating the sum, difference, and product
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Printing the results
        System.out.println("The sum of" + num1 + " and "+ num2 + " is "+ sum +".");
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference + ".");
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product + ".");

    }
}
