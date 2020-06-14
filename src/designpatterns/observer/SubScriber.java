package designpatterns.observer;

public interface SubScriber 
{
	public void recieveMessage(Message message);
	
	public String getId();
}
