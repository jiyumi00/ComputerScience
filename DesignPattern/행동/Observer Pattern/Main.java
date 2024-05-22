public class Main{
	public static void main(String[]args){
		Topic topic=new Topic();
		
		Observer a=new TopicSubscriber("홍길동",topic);
		Observer b=new TopicSubscriber("이순신",topic);
		Observer c=new TopicSubscriber("김영희",topic);
		topic.register(a);
		topic.register(b);
		topic.register(c);
		
		topic.postMessage("구독자분들 새로운 영상이 업로드 되었습니다!!");
	}
}