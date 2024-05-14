public class AmericanoFactory implements CoffeeFactory{ //서브클래스 - 객체 생성
	@Override
	public Coffee getCoffee(){
		return new Americano();
	}
}