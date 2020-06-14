package designpatterns.observer;

public class Client2 implements SubScriber {

	@Override
	public void recieveMessage(Message message) {
		System.out.println("Message :"+message.getMessage());
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "subscriber_2";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getId().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return getId().equals(obj);
	}
}
