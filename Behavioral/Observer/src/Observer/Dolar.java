package Observer;

public class Dolar extends AbstractKur{
	
	public Dolar(String name) {
		super(name);
	}	

	@Override
	public void update() {
		for (var observer : observers) {
			observer.update(this);
		}
	}
}
