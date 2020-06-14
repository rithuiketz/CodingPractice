package designpatterns.abstractfactory;

public class Apple implements Fruit {

	@Override
	public String getFruitName() {
		// TODO Auto-generated method stub
		return "Apple";
	}

	@Override
	public FruitCategory getType() {
		// TODO Auto-generated method stub
		return FruitCategory.NON_CITRUS;
	}

}
