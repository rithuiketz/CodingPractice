package designpatterns.abstractfactory;

public class Banana implements Fruit {

	@Override
	public String getFruitName() {
		// TODO Auto-generated method stub
		return "Banana";
	}

	@Override
	public FruitCategory getType() {
		// TODO Auto-generated method stub
		return FruitCategory.NON_CITRUS;
	}

}
