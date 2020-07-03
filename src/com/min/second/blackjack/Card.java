package com.min.second.blackjack;
// 메소드랑 클래스 차이점 class랑 이름이같다, return 타입 적으면안됨
public class Card {
	public final static String[] PATTERNS = {"하트", "다이아", "스페이드", "클로버"};
	private final String pattern;
	private final String denomination;
	
	
	public Card(String pattern, String denomination) {
		this.pattern = pattern;
		this.denomination = denomination;
	}
	
	
	public  String getPattern() { //set을 안넣으면 수정을 못한다.
		
		return pattern;
		
	}
	

	public  String getDenomination() {
		
		return denomination;
	}
	
	@Override
	public String toString() {
		
		return String.format("p: %s, d: %s", pattern, denomination);
	}
	
	
}
