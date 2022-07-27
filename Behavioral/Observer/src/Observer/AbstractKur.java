package Observer;

import java.util.ArrayList;

public abstract class AbstractKur implements Kur{
	
	String name;
	ArrayList<Observer> observers;
	double salePrice, purchasePrice;
	
	public AbstractKur(String name) {
		this.name = name;
		salePrice = 0;
		purchasePrice = 0;
		observers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void setSalePrice(double price) {
		salePrice = price;
	}
	
	@Override
	public void setPurchasePrice(double price) {
		purchasePrice = price;
	}	

	@Override
	public double getSalePrice() {
		return salePrice;
	}

	@Override
	public double getPurchasePrice() {
		return purchasePrice;
	}
}
