package com.min.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		
		CardDeck cd = new CardDeck();
         //System.out.println(cd);
		 //랜덤한 카드를 1장 리턴하고 카드덱에서 리턴한 카드 삭제
		
		Gamer gamer = new Gamer(); //대문자에 변수넣으면(Gamer gamer =) 주소값저장
		Card card = cd.getCard();
		gamer.receiveCard(card);   //주소값.receiveCard
		
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		
		
		gamer.openCards();  //내가 가진카드를 나타나게
		
		
		
	}
	
}
