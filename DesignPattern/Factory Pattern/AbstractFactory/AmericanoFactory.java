public class AmericanoFactory implements CoffeeFactory{ //서브클래스 - 객체 생성
	@Override
	public Americano getCoffee(){
		Ingredient ingredient=getIngredient();
		ingredient.addIngredient();
		return new Americano();
	}
	@Override
	public Ingredient getIngredient(){
		return new Water();
	}
}