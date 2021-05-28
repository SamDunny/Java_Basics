// by Sam Dunny

import java.util.Scanner;
public class MatrixAdder {
    public static void main(String[] args) {
        
        // create scanner object
        Scanner keyboard = new Scanner(System.in);
    
        // welcome prompt
        System.out.println("Welcome to the matrix adder program");
        
        // create variables for the rest of the program
        System.out.println("Please enter the length of the first matrix");
        int lengthOne = keyboard.nextInt();
        System.out.println("Please enter the height of the first matrix");
        int heightOne = keyboard.nextInt();
        System.out.println("Please enter the length of the second matrix");
        int lengthTwo = keyboard.nextInt();
        System.out.println("Please enter the height of the second matrix");
        int heightTwo = keyboard.nextInt();
        
        // make sure dimensions are valid
        if(lengthOne != lengthTwo || heightOne!= heightTwo)
        {
            System.out.println("Invalid sizes, cannot compute");
            System.exit(1);
        }

        //making the matrices variables for later manipulation
        int firstM[][] = new int[lengthOne][heightOne];
        int secondM[][] = new int[lengthTwo][heightTwo];
        int sum[][] = new int[lengthOne][heightOne];
        
        // dimensions for the first matrix
        for(int i=0;i<lengthOne; i++)
            for (int k=0;k<heightOne; k++) {
                // calculate where you are on the board
                int x = i + 1;
                int y = k + 1;

                // get user input for that space
                System.out.println("Please enter a value for matrix 1 space "+x+","+y+"");
                firstM[i][k] = keyboard.nextInt();
            }
        
        //dimensions for the second matrix
        for(int i=0;i<lengthTwo; i++)
            for (int k=0;k<heightTwo; k++) {
                // calculate where you are on the board
                int x = i + 1;
                int y = k + 1;

                // get user input for that space
                System.out.println("Please enter a value for matrix 2 space "+x+","+y+"");
                secondM[i][k] = keyboard.nextInt();
            }
        
        // calculating the sum of the matrices
        for(int i=0;i<lengthOne;i++)
            for(int k=0;k<heightOne;k++)
                sum[i][k] = firstM[i][k] + secondM[i][k];
        
        // report results
        System.out.println("Sum of the matrices");
        for(int i=0;i<lengthOne;i++) {
            for(int k=0;k<heightOne;k++)
                System.out.print(firstM[i][k]+" ");
            System.out.println();
        }
        System.out.println("+");
        for(int i=0;i<lengthTwo;i++) {
            for(int k=0;k<heightTwo;k++)
                System.out.print(secondM[i][k]+" ");
            System.out.println();
        }
        System.out.println("=");
        for(int i=0;i<lengthTwo;i++) {
            for(int k=0;k<heightTwo;k++)
                System.out.print(sum[i][k]+" ");
            System.out.println();
        }
        
        // close scanner
        keyboard.close();
    } 
}