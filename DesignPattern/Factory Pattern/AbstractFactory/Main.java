public class Main{
    public static void main(String[] args){
		
		Factory factory=new DefaultFactory();
		CoffeeFactory latteFactory=factory.requestCoffee("LATTE");
		Coffee latte=latteFactory.getCoffee();
		latte.preparing();
		latte.complete();
		
		CoffeeFactory ameFactory=factory.requestCoffee("AMERICANO");
		Coffee ame=ameFactory.getCoffee();
		ame.preparing();
		ame.complete();
		
    }
}