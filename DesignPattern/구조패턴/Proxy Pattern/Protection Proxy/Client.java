public class Client {
    public static void main(String[] args) {
        Subject subject=new Proxy(new RealSubject(),false);
        subject.action();
    }
}
