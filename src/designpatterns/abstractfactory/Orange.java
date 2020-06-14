package designpatterns.abstractfactory;

public class Orange implements Fruit {

	@Override
	public String getFruitName() {
		// TODO Auto-generated method stub
		return "Orange";
	}

	@Override
	public FruitCategory getType() {
		// TODO Auto-generated method stub
		return FruitCategory.CITRUS;
	}

}
