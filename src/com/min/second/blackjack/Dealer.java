package com.min.second.blackjack;

public class Dealer extends Gamer{
	
	@Override
	public void moreCards(CardDeck cd) {
		//딜러가 가지고있는 카드의 합계점수가 17점 이상이 될떄까지 카드뽑기
		int stopPoint = 17;
		while(getTotalPoint() < stopPoint) {
			receiveCard(cd.getCard());
		}
		
		
		
		
	}
}
