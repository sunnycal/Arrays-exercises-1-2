package com.company;

/*         1 Create an array to hold the numbers 1-10.
2. Loop through that array and sum the numbers 1-10, then print that total to the screen.

*/

public class Main {

    public static void main(String[] args) {

        //Declare array to hold ten test scores
        int scores[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//
        //Print the elements of an array
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("sum " + sum);
        }
    }
}
