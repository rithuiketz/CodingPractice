package designpatterns.abstractfactory;

public class NonCitrusFruitFactory implements AbstractFruitFactory {

	@Override
	public Fruit getFruit(String name) {
	
		if("Apple".equals(name))
			return new Apple();
		else
			return new Banana();
	}

	

}
