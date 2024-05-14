abstract class Coffee{//커피 객체 추상 클래스 (Product)
	abstract void preparing();
	abstract void complete();
	public void pickup(){
		System.out.println("픽업 완료");
	}
}