package Assignments;
import java.util.*;

public class Tugas3 {
	public static void main(String[] args) {
        int[][] sudoku = new int[3][3];
           Random rand = new Random();

           // mengisi array dengan angka 1-3 secara acak
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   sudoku[i][j] = rand.nextInt(3) + 1;
               }
           }

           // Sudoku solved ()
           boolean sudokuSolved = true;
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                   System.out.print(sudoku[i][j] + " ");
               }

            // Row check
               int[] row = sudoku[i];
               if (hasDuplicate(row)) {
                   sudokuSolved = false;
               } else {
                   System.out.print("Sudoku");
               }
               System.out.println();
           }

           // Column check
           for (int i = 0; i < 3; i++) {
               int[] column = new int[3];
               for (int j = 0; j < 3; j++) {
                   column[j] = sudoku[j][i];
               }
               if (hasDuplicate(column)) {
                   sudokuSolved = false;
                   System.out.print("  ");
               } else {
                   System.out.print("s ");
               }
           }
           
           if (sudokuSolved) {
               System.out.println("Sudoku solved!");
           }
       }

       public static boolean hasDuplicate(int[] arr) {
           for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                   if (arr[i] == arr[j]) {
                       return true;
                   }
               }
           }
           return false;
       }  
}
