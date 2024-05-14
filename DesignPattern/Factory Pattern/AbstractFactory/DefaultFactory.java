public class DefaultFactory implements Factory{
	@Override
	public CoffeeFactory requestCoffee(String type){
		switch(type){
			case "LATTE":
				return new LatteFactory();
			case "AMERICANO":
				return new AmericanoFactory();
		}
		throw new IllegalArgumentException();
	}
}
