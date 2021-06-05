package zadaci;

public class ZamenaVrednostiBrojevaBezUvodjenjaNovihPromenljivih {

	/*
	 * 
	 * 2. Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene. 
	 */
	
	public static void main(String[] args) {
     //Zamena vrednosti bez uvodjenja novih promenljivih 
		
    int x = 3;
    int y = 7;
		
    x = x - y; 
    y = x + y; 
    x = y - x;
    
    
    System.out.println("Vrednost vrijable X je: " + x);
    
    System.out.println("Vrednost vrijable Y je: " + y);	
		
	}

}
