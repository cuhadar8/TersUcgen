import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ters yıldız programı");
		System.out.print("Basamak sayısını giriniz: ");
		int n = scanner.nextInt();
		
		
		for(int i = 0;i <= n; i++) {
			
			for(int j = 0; j<=i-1; j++) {      //satır ve boşluklar arasındaki ilişki i-1
				System.out.print(" ");
			}
			
			for(int k = 1; k<=(2*n-(2*i+1)); k++) {   //yıldız sayısı hem satır hem de basamak sayımıza bağlı değişmekte
				System.out.print("*");
			}
			
			System.out.println();
		}
    }

}


