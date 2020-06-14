package designpatterns.abstractfactory;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
	
		AbstractFruitFactory factory = new  CitrusFruitFactory();
		System.out.println(factory.getFruit(null).getFruitName());
		
	}

}
