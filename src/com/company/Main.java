package com.company;

/*         1 Create an array to hold the numbers 1-10.
        2. Loop through that array and sum the numbers 1-10, then print that total to the screen.
        3. Create an array to hold 10 number inputs from the user and print that total to the screen.
        4. Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
        5. Create an array to store 3 names, loop through that array to print out the names.
        6. create an array with the following values: [2,5,9,0,2,1,8,5,4]
        7. Loop through the array and print out the index each time the value equals 5.
        =========================================

        8. Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.

        9. Given the following array: ['w','t','y','h','k']
        Loop through the array and replace the the letter 't' with the word "hello" once it's found.

        10. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        Write a program that will print out all matching pairs from arrays 1 and 2.
        Expected output:
        (7,7) and (6,6)
*/

public class Main {

    public static void main(String[] args) {

        //Declare array to hold ten test scores
        int scores[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        Loop through that array and sum the numbers 1-10, then print that total to the screen.
        //Print the elements of an array
        int sum=0;
        for (int i = 1; i <= 10; i++){
            sum=sum+i;
            System.out.println( "sum " +  sum);
//            System.out.printf("Element # %d value is %d\n", i, scores[i]);

            // Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers

            // declares an array of integers
            int[] anArray;

            // allocates memory for 10 integers
            anArray = new int[10];

            for (int i =0; i < scores2.length; i++) {
                System.out.println("The number at index position " + i + " is " + scores2(i));

                int total = 0;

                total = total + scores2(i);
                System.out.println(("Total" + total));

                ave = total/scores2.length;

            }
            System.out.println("Average " + ave);
    }
        //Create an array to store 3 names, loop through that array to print out the names
        String[] names = new String [3];


        //Initialize elements of an array
        names[0] = "Tom";
        names[1] = "Bon";
        names[2] = "Chon";
        System.out.println("Name at index position" +i + "is" +names[i]);
            [] = 1 + rnd.nextInt(100);//creates a random number between 1 and 100
            scores[i] = randomInt;
        }
    }
}
