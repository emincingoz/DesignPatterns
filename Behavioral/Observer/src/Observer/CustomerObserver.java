package Observer;

public class CustomerObserver implements Observer{

	@Override
	public void update(Kur kur) {
		System.out.println("Fiyat deðiþti : CustomerObserver");
		System.out.println(kur.getName() + ": " + kur.getSalePrice() + ", " + kur.getPurchasePrice() + "\n");
	}

}
