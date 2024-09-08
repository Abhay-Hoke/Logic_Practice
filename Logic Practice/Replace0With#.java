//Replacing all the columns and rows with all zeros by # in an array

import java.util.Scanner;

class Replace0With#{

    static void pattern(char arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Identify the rows and columns that are filled with zeros
        for (int i = 0; i < rows; i++) {
            boolean allZeros = true;
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] != '0') {
                    allZeros = false;
                    break;
                }
            }
            if (allZeros) {
                zeroRows[i] = true;
            }
        }

        for (int j = 0; j < cols; j++) {
            boolean allZeros = true;
            for (int i = 0; i < rows; i++) {
                if (arr[i][j] != '0') {
                    allZeros = false;
                    break;
                }
            }
            if (allZeros) {
                zeroCols[j] = true;
            }
        }

        // Replace the elements in the identified rows and columns with #
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = '#';
                }
            }
        }

        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    arr[i][j] = '#';
                }
            }
        }
    }

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num1 (number of rows):");
        int num1 = sc.nextInt();

        System.out.println("Enter Num2 (number of columns):");
        int num2 = sc.nextInt();

        char arr[][] = new char[num1][num2];

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.println("Enter element [" + i + "][" + j + "]:");
                arr[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("Original array:");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        pattern(arr);

        System.out.println("Modified array:");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
