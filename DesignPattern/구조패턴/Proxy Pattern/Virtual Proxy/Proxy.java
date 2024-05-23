public class Proxy implements Subject{

    private RealSubject subject;

    Proxy(){

    }
    @Override
    public void action() {
        if(subject==null){
            subject = new RealSubject();
        }
        subject.action();//위임
        System.out.println("프록시 객체 액션 !!");
    }
}
