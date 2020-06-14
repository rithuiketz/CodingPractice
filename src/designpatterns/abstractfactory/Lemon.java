package designpatterns.abstractfactory;

public class Lemon implements Fruit {

	@Override
	public String getFruitName() {
		// TODO Auto-generated method stub
		return "Lemon";
	}

	@Override
	public FruitCategory getType() {
		// TODO Auto-generated method stub
		return FruitCategory.CITRUS;
	}

}
