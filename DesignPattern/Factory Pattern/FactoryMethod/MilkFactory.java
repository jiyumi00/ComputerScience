public class MilkFactory extends CoffeeFactory{ //서브클래스 - 객체 생성
	@Override
	public  Coffee getCoffee(){
		return new Milk();
	}
}