package designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Publisher 
{
	private Set<SubScriber> subscribers  = new HashSet<>();
	
	public void addSubscriber(SubScriber subscriber)
	{
		subscribers.add(subscriber);
	}
	
	public void removeSubcriber(SubScriber subscriber)
	{
		subscribers.remove(subscriber);
	}
	
	public void notifySubscriber()
	{
		for(SubScriber subscriber : subscribers)
		{
			String msg = subscriber.getClass().getSimpleName()+"_msg";
			Message m =()  -> msg;
			subscriber.recieveMessage(m);
			
		}
		
	}
	
}
