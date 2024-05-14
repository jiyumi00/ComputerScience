public class LatteFactory implements CoffeeFactory{ //서브클래스 - 인스턴스 생성
	@Override
	public Latte getCoffee(){
		Ingredient ingredient=getIngredient();
		ingredient.addIngredient();
		return new Latte();
	}
	@Override
	public Ingredient getIngredient(){
		return new Milk();
	}
}