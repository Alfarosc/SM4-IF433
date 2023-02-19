package week02.Alfarizky.id.ac.umn;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		int not_prima=0;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Program Pengecekan Bilangan Prima");
		System.out.println("=====================================================");
		System.out.println("Masukkan Angka : ");
		input = scanner.nextInt();
		System.out.println("=====================================================");
		
		for(int x=2; x<=input; x++) {
			if(input%x==0) {
				not_prima++;
			}
		}
		
		if(not_prima==1) {
			System.out.println("Angka " +input+ " adalah angka prima");
		}else {
			System.out.println("Angka " +input+ " adalah angka bukan prima");
		}
	}
}
