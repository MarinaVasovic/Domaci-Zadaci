package zadaci;

import java.util.Scanner;

public class ZbirPrvihNNedeljivihSaBrojemK {
	
	/*
	 * 
	 * 3. Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci one koji su deljivi brojem k
	 */

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Unesite broj K: ");
    int k = sc.nextInt();
    
    System.out.println("Unesite broj N: ");
    int n = sc.nextInt();
    
    racunanjeZbiraNBrojevaNedeljivihSaK(k, n);
    
	}
	
	public static void racunanjeZbiraNBrojevaNedeljivihSaK(int k, int n) {
		int zbir = 0;
	    
	    for (int i = 1; i <=n; i++) {
	    	
	    	if(i%k==0) {
	    	}else {
	        	zbir = zbir + i;

	    	}
		}
	    
	    System.out.println("Zbir prvih prirodnih brojeva do " + n + " koji nisu deljivi sa " + k + " je " + zbir);
	}

}
