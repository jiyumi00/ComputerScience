public class Proxy implements Subject{
    private RealSubject subject;

    Proxy(RealSubject subject){
        this.subject=subject;
    }
    @Override
    public void action() {
        System.out.println("로깅.........");
        subject.action();
        System.out.println("프록시 객체 액션 !!");
        System.out.println("로깅..........");

    }
}
