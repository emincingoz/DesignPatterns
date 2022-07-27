package Observer;

public class Main {
	public static void main(String[] args) {
		
		Publisher publisher = new Publisher();
		Kur dolar = publisher.getDolar();
		Kur euro = publisher.getEuro();
		
		CustomerObserver customerObserver = new CustomerObserver();
		
		dolar.addObserver(customerObserver);
		
		publisher.updateDolar(17, 18);
		
		// Euro'ya ekli observer yok customerObserver haberdar edilmedi.
		publisher.updateEuro(20, 21);
		
		euro.addObserver(customerObserver);
		
		// customerObserver'a bilgi iletildi.
		publisher.updateEuro(22, 23);
		
	}
}
