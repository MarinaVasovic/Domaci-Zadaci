package grananja;

import java.util.Scanner;

public class Grananja1 {

	/*
	 * 
	 * grananja1: napisati program koji proverava da li je uneti broj paran. ukoliko
	 * jeste, program treba da ispise poruku: broj je paran! ukoliko nije, program
	 * treba da ispise poruku: broj je neparan!
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("unesi bilo koji celi broj: ");
		int broj = sc.nextInt();
		if (broj % 2 == 0) {
			System.out.println("broj je paran.");
		} else
			System.out.println("broj je neparan.");

	}

}
