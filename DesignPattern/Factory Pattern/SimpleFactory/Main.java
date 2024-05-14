public class Main{
    public static void main(String[] args){
		CoffeeFactory coffeeFactory=new CoffeeFactory();
		
		Coffee latte=CoffeeFactory.orderCoffee("Latte");
		Coffee ame=CoffeeFactory.orderCoffee("Americano");
		
		latte.pickup();
		ame.pickup();
    }
}