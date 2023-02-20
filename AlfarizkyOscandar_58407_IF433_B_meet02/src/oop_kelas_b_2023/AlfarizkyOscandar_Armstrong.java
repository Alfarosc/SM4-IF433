package oop_kelas_b_2023;
import java.util.Scanner;

public class AlfarizkyOscandar_Armstrong {
    
    public static void main(String[] args){
        Scanner thiScanner = new Scanner(System.in);

        int r, sum = 0, temp;

        System.out.println("Masukan bilangan: ");
        int num = thiScanner.nextInt();

        temp = num;

        while(num > 0){
            r = num % 10;

            sum = sum + (r*r*r);

            num = num/10;
        }

        if (temp == sum){
            System.out.println("Armstrong number");
        }else
            System.out.println("Not armstrong number");
    }
}