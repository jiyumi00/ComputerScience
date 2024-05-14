public class Latte implements Coffee{// 커피 구현체 (ConcreteProduct)
	@Override
	public void preparing(){
		System.out.println("라떼 준비중");
	}
	@Override
	public void complete(){
		System.out.println("라떼 완료");
	}
}