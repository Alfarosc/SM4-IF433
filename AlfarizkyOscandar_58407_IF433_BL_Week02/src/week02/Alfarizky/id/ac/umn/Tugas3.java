package week02.Alfarizky.id.ac.umn;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int terkecil, terbesar;
		int hasil=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program Bilangan Prima");
		System.out.println("======================");
		System.out.print("Masukkan nilai Terkecil : ");
		terkecil=scanner.nextInt();
		System.out.print("Masukkan nilai Terbesar : ");
		terbesar=scanner.nextInt();
		System.out.println("============================================");
		System.out.print("Bilangan Prima pada range tersebut yaitu ");
		
		for(int x=terkecil; x<=terbesar; x++) {
			int nilai_prima = 1;
			if(x != 1) {
				for(int y=2;y<x;y++){
					if(x%y==0) {
						nilai_prima = 0;
					}
			}
			}else {
				nilai_prima = 0;
			}
			if(nilai_prima == 1) {
				System.out.print(x+" ");
				if(x>0) {
					hasil += x; 
				}
			}
		}
		System.out.println("\n============================================"); 
		System.out.println("Jumlah dari semua nilai bilangan prima dari " + terkecil + " dan " + terbesar + " adalah " + hasil);
	}
}
