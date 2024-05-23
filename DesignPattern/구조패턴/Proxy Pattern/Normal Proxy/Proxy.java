public class Proxy implements Subject{
    private RealSubject subject;//대상 객체를 composition

    Proxy(RealSubject subject){
        this.subject=subject;
    }
    @Override
    public void action() {
        subject.action(); //위임
        System.out.println("프록시 객체 액션 !!");
    }
}
