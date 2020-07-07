package com.min.second.blackjack;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	
	private List<Card> arr = new LinkedList(); //gamer가 받은카드를 LIST에 저장
	//Generic 이란? <Card> : 내가 Card타입만 받을거다, Card에서 생성한 pattern denomination point
	
	
	public void receiveCard(Card card) {
		arr.add(card);
	}
	
	public void openCards() {
		/*for(int i = 0; i<arr.size(); i++) {
			sum += arr.get(i).getPoint();
			System.out.println(arr.get(i));
		}
		System.out.println(sum);*/
		for(Card c : arr) {
			
			System.out.println(c);
		}
		System.out.printf("합계 : %d\n", getTotalPoint());
	}
	
	public int getTotalPoint() {
		int sum =0;
		for(Card c : arr) {
			sum += c.getPoint();
		}
		return sum;
	}
	public void moreCards(CardDeck cd) {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			openCards();
			System.out.println("카드를 더 받으시겠습니까? (y/n)");
			String answer = sc.nextLine();
			
			if(answer.equals("n")) {
				break;
			} else if(answer.equals("y")) {
				receiveCard(cd.getCard());
				
			} else {
				System.out.println("다시입력하세요");
			}
			if(getTotalPoint()>21) {
				break;
			}	
		}
		
	}
}
