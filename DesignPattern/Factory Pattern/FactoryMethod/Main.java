public class Main{
    public static void main(String[] args){
		LatteFactory latteFactory=new LatteFactory();
		Coffee latte=latteFactory.orderCoffee();
		latte.pickup();
		
		AmericanoFactory americanoFactory=new AmericanoFactory();
		Coffee ame=americanoFactory.orderCoffee();
		ame.pickup();
    }
}