public class LatteFactory implements CoffeeFactory{ //서브클래스 - 인스턴스 생성
	@Override
	public Coffee getCoffee(){
		return new Latte();
	}
}