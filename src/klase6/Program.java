package klase6;

public class Program {

	public static void main(String[] args) {

		Sisari s = new Sisari("Africki slon", "Loxodonta", "Elephantidae", "Trava", "Slon", 4, "crna");
		Ribe r = new Ribe("Silver", "Salmo", "Salmonidae", "Capelin fish", "Losos", "Slana", "Ledjna i masna peraja");

		Staniste st = new Staniste("More");
		s.setBojaDlake("Smedja");

		System.out.println(st);
		System.out.println(s);
		System.out.println(r);

	}

}