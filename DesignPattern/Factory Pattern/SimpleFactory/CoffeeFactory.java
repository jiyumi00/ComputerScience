public class CoffeeFactory{ //객체의 생성만을 처리하는 공장

	public static Coffee orderCoffee(String type){
		Coffee coffee=getCoffee(type);
		coffee.preparing();
		coffee.complete();
		return coffee;
	}
	public static Coffee getCoffee(String type){
		if("Latte".equalsIgnoreCase(type)){
			return new Latte();
		}else if("Americano".equalsIgnoreCase(type)){
			return new Americano();
		}else{
			return new Milk();
		}
	}
}