package week3.Alfarizky.id.ac.umn;
import java.util.*;

public class Tugas2 {
    public static void main(String[] args){
        int input;
		String nama, in;

		Scanner thiScanner = new Scanner(System.in);
		
		System.out.println("==============================");
		System.out.print("Masukkan Nama Anda : ");
		
		nama = thiScanner.nextLine();
		
		System.out.println("==============================");
		System.out.println("Nama Anda : " + nama);
		System.out.println("1. charAt             6. concat");
		System.out.println("2. length             7. replace");
		System.out.println("3. substring(n)       8. split");
		System.out.println("4. substring(m,n)     9. lowerCase");
		System.out.println("5. contains           10. upperCase");
		System.out.print("Pilih menu : ");
		
		input = thiScanner.nextInt();
		
		thiScanner.nextLine();
		
		switch(input) {
			case 1:
				System.out.println("Pilih menu : "+input);
				System.out.println("====charAt====");
				System.out.println("Nama : "+nama);
				System.out.println("Input : ");
				int a = thiScanner.nextInt();
				System.out.println("Hasil : "+nama.charAt(a));
				break;
			case 2:
				System.out.println("Pilih menu : "+input);
				System.out.println("====length====");
				System.out.println("Nama : "+nama);
				System.out.println("Hasil : "+nama.length());
				break;
			case 3:
				System.out.println("Pilih menu : "+input);
				System.out.println("====substring(n)====");
				System.out.println("Nama : "+nama);
				System.out.println("Input : ");
				int inp = thiScanner.nextInt();
				System.out.println("Hasil : "+nama.substring(inp));
				break;
			case 4: 
				System.out.println("Pilih menu : "+input);
				System.out.println("====substring(m,n)====");
				System.out.println("Nama : "+nama);
				System.out.println("Input : ");
				int inp1 = thiScanner.nextInt();
				System.out.println("Input : ");
				int inp2 = thiScanner.nextInt();
				System.out.println("Hasil : "+nama.substring(inp1, inp2));
				break;
			case 5:
				System.out.println("Pilih menu : "+input);
				System.out.println("====contains====");
				System.out.println("Nama : "+nama);
				System.out.println("Input : ");
				in = thiScanner.nextLine();
				System.out.println("Hasil : "+nama.contains(in));
				break;
			case 6:
				System.out.println("Pilih menu : "+input);
				System.out.println("====concat====");
				System.out.println("Nama : "+nama);
				System.out.println("Input : ");
				in = thiScanner.nextLine();
				in = thiScanner.nextLine();
				System.out.println("Hasil : "+nama.concat(in));
				break;
			case 7:
				System.out.println("Pilih menu : "+input);
				System.out.println("====replace====");
				System.out.println("Nama : "+nama);
				System.out.println("Input Kata yang ingin diganti : ");
				in = thiScanner.nextLine();
				System.out.println("Input Kata Pengganti : ");
				String nama2 = thiScanner.nextLine();
				System.out.println("Hasil : "+nama.replace(in, nama2));
				break;
			case 8:
				System.out.println("Pilih menu : "+input);
				System.out.println("====split====");
				System.out.println("Nama : "+nama);
				System.out.println("Input : ");
				in = thiScanner.nextLine();
				for(String x : nama.split(in)){
					System.out.println("Hasil : "+x);
				}
				break;
			case 9:
				System.out.println("====lowerCase====");
				System.out.println("Input : "+nama);
				System.out.println("Hasil : "+nama.toLowerCase());
				break;
			case 10:
				System.out.println("Pilih menu : "+input);
				System.out.println("====upperCase====");
				System.out.println("Nama : "+nama);
				System.out.println("Input : ");
				in = thiScanner.nextLine();
				System.out.println("Hasil : "+nama.toUpperCase());
				break;
		}
    }
}
