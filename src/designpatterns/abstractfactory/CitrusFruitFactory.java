package designpatterns.abstractfactory;

public class CitrusFruitFactory implements AbstractFruitFactory {

	@Override
	public Fruit getFruit(String name) {
		
		if("Lime".equals(name))
			return new Lemon();
		else
			return new Orange();
	}

}
