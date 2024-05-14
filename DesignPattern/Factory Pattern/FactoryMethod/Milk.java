class Milk extends Coffee{
    @Override
	public void preparing(){
		System.out.println("우유 준비중");
	}
	@Override
	public void complete(){
		System.out.println("우유 완료");
	}
}