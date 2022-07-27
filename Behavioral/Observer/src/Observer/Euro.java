package Observer;

public class Euro extends AbstractKur{
	
	public Euro(String name) {
		super(name);
	}

	@Override
	public void update() {
		for (var observer : observers) {
			observer.update(this);
		}
	}
}
