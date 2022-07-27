package Observer;

public class Publisher {
	
	private Kur dolar;
	private Kur euro;
	
	public Publisher() {
		dolar = new Dolar("Dolar");
		euro = new Euro("Euro");
	}
	
	public void updateDolar(int sale, int purchase) {
		dolar.setSalePrice(sale);
		dolar.setPurchasePrice(purchase);
		
		System.out.println("updateDolar : Publisher");
		System.out.println(dolar.getName() + ": " + dolar.getSalePrice() + ", " + dolar.getPurchasePrice() + "\n");
		
		dolar.update();		
	}
	
	public void updateEuro(int sale, int purchase) {
		euro.setSalePrice(sale);
		euro.setPurchasePrice(purchase);
		
		System.out.println("updateEuro : Publisher");
		System.out.println(euro.getName() + ": " + euro.getSalePrice() + ", " + euro.getPurchasePrice() + "\n");
		
		euro.update();		
	}
	
	public Kur getDolar() {
		return dolar;
	}
	
	public Kur getEuro() {
		return euro;
	}
}
