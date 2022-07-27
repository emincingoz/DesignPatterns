package Observer;

public interface Kur {
	
	void setSalePrice(double price);
	
	void setPurchasePrice(double price);
	
	String getName();
	
	double getSalePrice();
	
	double getPurchasePrice();
	
	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void update();
}
