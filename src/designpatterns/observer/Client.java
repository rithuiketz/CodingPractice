package designpatterns.observer;

public class Client {

	public static void main(String[] args)
	{
		Publisher publisher = new Publisher();
		publisher.addSubscriber(new Client1());
		publisher.addSubscriber(new Client2());
		
		publisher.notifySubscriber();
	}

}
