import java.util.*;
class Topic implements Subject{
	private List<Observer> observers;
	private String message;
	
	public Topic(){
		this.observers=new ArrayList<>();
		message="";
	}
	@Override
	public void register(Observer obj){
		if(!observers.contains(obj)){
			observers.add(obj);
		}
	}		
	@Override
	public void unregister(Observer obj){
		observers.remove(obj);
	}
	@Override
	public void notifyObservers(){
		this.observers.forEach(Observer::update);
	}
	@Override
	public Object getUpdate(Observer obj){
		return this.message;
	}
	
	public void postMessage(String message){
		System.out.println("Message sended to Topic: "+message);
		this.message=message;
		notifyObservers();
	}
}