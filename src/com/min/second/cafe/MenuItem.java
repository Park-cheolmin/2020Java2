package com.min.second.cafe;

public class MenuItem { //클래스는 멤버필드, 멤버메소드
	
	private String name; //값저장용											//멤버필드에 값넣는방법 : 생성자, 메소드(setter) 를 통해서
	private int price;
	

	public MenuItem(String name, int price ) {							//생성자와 메소드 차이 : return타입없음(생성자), 클래스와 이름이 같다 (생성자)
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("%s, %,d원",name, price);
	}
	
}