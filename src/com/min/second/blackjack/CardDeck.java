package com.min.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	
	private List<Card> arr = new ArrayList(); //<Card> 쓰면 카드 주소값으로만 나온다
	

	public CardDeck() {
		init();
	}
	
	private void init() {
		for(int i=0; i<Card.PATTERNS.length; i++) {	
			for(int z =1; z<=13; z++) {
				arr.add(new Card(Card.PATTERNS[i], getDeno(z)));
				/*
				 * String pattern = Card.PATTERNS[i];
				 * String deno = getDeno(z);
				 * Card c = new Card(pattern, deno);
				 * arr.add(c);
				 */
			}
		}
	}
		
	private String getDeno(int num) {
		switch(num) {
		case 1: return "A"; 
		case 11: return "J"; 
		case 12: return "Q"; 
		case 13: return "K"; 
		default: return  String.valueOf(num);
		}
	}
	
	@Override
	public String toString() {
		String str="";
		for(Card c : arr) {
			str += (c + "\n");
		}
		return str;
	}
	/*
	@Override
	public String toString() {
		for(Card c : arr) {
			System.out.println(c);
		}
		return "";
	}
	*/
	
	public Card getCard() {
		
		int select = (int)(Math.random()*arr.size());
		Card cd = arr.get(select);
		arr.remove(select);
		
		return cd;
	}
	
}

