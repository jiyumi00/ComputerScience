import java.util.*;
class Topic implements Subject{
	private List<Observer> observers; //구독자들
	private String message;
	
	public Topic(){
		this.observers=new ArrayList<>();
		message="";
	}
	@Override //구독자를 리스트에 추가
	public void register(Observer obj){
		if(!observers.contains(obj)){
			observers.add(obj);
			System.out.println(obj+" 구독 완료");
		}
	}		
	@Override //구독자를 리스트에 제거
	public void unregister(Observer obj){
		observers.remove(obj);
		System.out.println(obj+" 구독 취소");
	}
	@Override //구독자들에게 이벤트 송신
	public void notifyObservers(){
		//this.observers.forEach(Observer::update);
		for (Observer obj : this.observers) {
			obj.update(); //위임
		}
	}
	@Override
	public Object getUpdate(Observer obj){
		return this.message;
	}

	//구독자들에게 전달할 메시지
	public void postMessage(String message){
		System.out.println("[구독자들께 보낸 메시지]: "+message);
		this.message=message;
		notifyObservers(); //구독자들에게 이벤트 송신
	}
}