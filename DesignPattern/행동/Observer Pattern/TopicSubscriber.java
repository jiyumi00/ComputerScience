class TopicSubscriber implements Observer{
	private String name;
	private Subject topic;
	
	public TopicSubscriber(String name,Subject topic){
		this.name=name;
		this.topic=topic;
	}
	@Override
	public void update(){
		String message=(String)topic.getUpdate(this);
		System.out.println(name+"님 이벤트 알림이 왔습니다 >> "+message);
	}
}