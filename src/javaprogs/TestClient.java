package javaprogs;

public class TestClient {

	public static void main(String[] args) {
		//Creating obj for non static class
		OuterClass.NestedClass obj= new OuterClass().new NestedClass();
		
		//creating obj for static class
		OuterClass.StaticClass sb = new OuterClass.StaticClass();
		

	}

}
