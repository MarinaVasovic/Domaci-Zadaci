package zadaci;

import java.util.Scanner;

public class SrednjaVrednostOcene {
	
	/*
	 * 
	 * 4. Napisati program koji za tri unete ocene ispisuje srednju vrednost i u numerickom i opisnom obliku (opisan oblik - odlican, vrlo dobar, dobar, dovoljan, nedovoljan)
	 * 
	 */

	public static void main(String[] args) {

    ispisProsecneOcene();
    
	}
	
	public static void ispisProsecneOcene(){
		Scanner sc = new Scanner(System.in);
        double zbir = 0;
		for (int i = 1; i < 4; i++) {
			System.out.println("Unesite " + i + " ocenu: ");
			int ocena = sc.nextInt();
			zbir = zbir + ocena;
		}
		
		double prosecnaOcena = zbir/3;
		
		System.out.println("Prosecna ocena je " + prosecnaOcena);
		
		if(prosecnaOcena<1.5) {
			System.out.println("Nedovoljan");
		}else if(prosecnaOcena>=1.5&&prosecnaOcena<2.5){
			System.out.println("Dovoljan");
			
		}else if(prosecnaOcena>=2.5&&prosecnaOcena<3.5) {
			System.out.println("Dobar");
		}else if(prosecnaOcena>=3.5&&prosecnaOcena<4.5) {
			System.out.println("Vrlo dobar");	
		}else if(prosecnaOcena>=4.5) {
			System.out.println("Odlican");	
		}
	}

}
