public class Americano implements Coffee{
    @Override
	public void preparing(){
		System.out.println("아메리카노 준비중");
	}
	@Override
	public void complete(){
		System.out.println("아메리카노 완료");
	}
}