import java.util.Scanner;

/**
 * Given a n*m  matrix I want to check whether the matrix is toeplitz matrix or not.
 */

public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int testCase[][]){
        for(int row=0;row<testCase.length-1;row++){//testCase.length will give the row
            for(int column=0;column<testCase[row].length-1;column++){//It will give the the length of column for a particular row
                if(testCase[row][column]!=testCase[row+1][column+1])
                    return false;
            }
        }
        return true;
    }

    private static void print2DMatrix(int[][] matrix){
        System.out.println("Test Matrix: \n");
        for (int[] row: matrix) {
            for (int valInRow: row) {
                System.out.print(valInRow+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        ToeplitzMatrix toeplitzMatrix=new ToeplitzMatrix();

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of row of matrix ");
        int row=input.nextInt();
        System.out.println("Enter the number of columns of matrix ");
        int column=input.nextInt();

        int array[][]=new int[row][column];

        for(int i=0;i<row;i++){
            System.out.println("Enter the Element in the matrix row");
            for(int j=0;j<column;j++){
                array[i][j]=input.nextInt();
            }
        }
        int[][] testCase2={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        print2DMatrix(array);

        boolean check=toeplitzMatrix.isToeplitzMatrix(array);

        if(check==true) {
            System.out.println("The given matrix is a toeplitz matrix");
        }else {
                System.out.println("The given matrix is not a toeplitz matrix");
            }
        }
    }

