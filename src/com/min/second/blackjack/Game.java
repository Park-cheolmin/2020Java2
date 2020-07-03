package com.min.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		
		CardDeck cd = new CardDeck();
//		System.out.println(cd);
		
		for(int i=0; i<52; i++) {
			Card c = cd.getCard(); //랜덤한 카드를 1장 리턴하고 카드덱에서 리턴한 카드 삭제
			System.out.println(c);
		}
		
		
		
	}
	
}
