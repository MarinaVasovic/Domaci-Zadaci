package klase3;

public class Dvorana {

	private String imeDvorane;
	private String grad;
	private int brojMesta;

	public Dvorana(String imeDvorane, String grad) {
		this.imeDvorane = imeDvorane;
		this.grad = grad;
	}

	public Dvorana(String imeDvorane, String grad, int brojMesta) {
		this.imeDvorane = imeDvorane;
		this.grad = grad;
		this.brojMesta = brojMesta;
	}

	public String getImeDvorane() {
		return imeDvorane;
	}

	public void setImeDvorane(String imeDvorane) {
		this.imeDvorane = imeDvorane;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public int getBrojMesta() {
		return brojMesta;
	}

	public void setBrojMesta(int brojMesta) {
		this.brojMesta = brojMesta;
	}

}
