package com.min.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Game {

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Dealer dealer = new Dealer();
		Gamer gamer  = new Gamer();
		
		for(int i=0; i<2; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		dealer.moreCards(cd);
		gamer.moreCards(cd);
		
		System.out.println("-----딜러 덱-----");
		dealer.openCards();
		System.out.println("-----게이머 덱-----");
		gamer.openCards();
		
		Rule.whoIsWin(gamer, dealer);
		
		
		
		
		
		
//		CardDeck cd = new CardDeck();
//         //System.out.println(cd);
//		 //랜덤한 카드를 1장 리턴하고 카드덱에서 리턴한 카드 삭제
//		
//		Gamer gamer = new Gamer(); //대문자에 변수넣으면(Gamer gamer =) 주소값저장
//		Dealer dealer = new Dealer();
//		
//		System.out.println("<딜러>");
//		dealer.moreCards(cd);
//		dealer.openCards();
//		
//		System.out.println("*********************");
//		
//		System.out.println("<사용자>");
//		Card card = cd.getCard();
//		gamer.receiveCard(card);   //주소값.receiveCard
//		
//		gamer.receiveCard(cd.getCard());
//		
//		
//	
//		gamer.openCards();  //내가 가진카드를 나타나게
//		
//		Rule.whoIsWin(gamer, dealer);
		
		
		
	}
	
}
