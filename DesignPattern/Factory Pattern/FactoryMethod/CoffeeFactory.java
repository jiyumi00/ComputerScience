public interface CoffeeFactory{ //상위클래스
	default Coffee orderCoffee(){
		Coffee coffee=getCoffee();
		coffee.preparing();
		coffee.complete();
		return coffee;
	}
	Coffee getCoffee(); 
}