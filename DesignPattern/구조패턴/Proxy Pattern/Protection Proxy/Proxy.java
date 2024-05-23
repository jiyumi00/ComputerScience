public class Proxy implements Subject{
    private RealSubject subject;
    boolean access; //접근 권한

    Proxy(RealSubject subject, boolean access){
        this.subject=subject;
        this.access=access;
    }
    @Override
    public void action() {
        if(access==true){
            subject.action();
            System.out.println("프록시 객체 액션 !!");
        }
    }
}
