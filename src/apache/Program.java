package apache;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Program {

	public static void main(String[] args) {
		/*
		 * Napraviti novi projekat i u njega dodati biblioteke za apache poi. Kao na
		 * casu, doci do lokacije na vasem kompjuteru i tamo prekopirati fajl koji sam
		 * okacila (domaci.xlsx). Ako bude problema sa citanjem fajla koji vam okacih, a
		 * vi molim vas onda ipak kreirajte novi excel, posto radim na linuxu danas
		 * shvatismo da moze da se desi da se nesto izbagovalo.
		 * 
		 * Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel
		 * tabele koji se zove Brojevi. U tabeli svi brojevi se nalaze u prvoj koloni.
		 * Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu.
		 * Ukupnu sumu na kraju treba ispisati na standardnom izlazu. Potrebno je
		 * omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva. 
		 * 
		 */
		File f = new File ("domaci.xlsx");
	try {
		InputStream is = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook (is);
	
		Sheet sheet = wb.getSheetAt(0);
		
		double lastRowNumber = sheet.getLastRowNum();
		double zbir = 0;
		for (int i =0; i<=lastRowNumber; i++) {
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);

			double a= Double.parseDouble(cell.toString());
			zbir = zbir + a;
		}
		
		System.out.println("Ukupan zbir svih vrednosti iz prve kolone je " + zbir);
		wb.close();
		
	}
		
	catch (IOException e){
		System.out.println("Odgovarajuci fajl nije pronadjen.");
		e.printStackTrace();
		
	}
		
	}

}
