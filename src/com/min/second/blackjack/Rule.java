package com.min.second.blackjack;

public class Rule {

	public static void whoIsWin(Gamer gamer, Dealer dealer) {
		int g = gamer.getTotalPoint();
		int d = dealer.getTotalPoint();
		int failPoint = 21;
		
		if(g == d || (g>failPoint && d > failPoint)) {
			System.out.println("비겼음");
		} else if((g <= failPoint && g > d) || d > failPoint) {
			System.out.println("게이머 승");
		} else {
			System.out.println("딜러 승");
		}
		
//		if(g>21 || d>21 ) {	
//			if(g>21 && d>21 ) {
//				System.out.println("비겼습니다");
//			}else if(g>21) {
//				System.out.println("딜러가 승리하였습니다.");
//			}else {
//				System.out.println("당신이 승리했습니다..");
//			}
//		}else {
//			if(g>d) {
//				System.out.println("당신이 승리하욨습니다.");
//			}else if(g>d) {
//				System.out.println("비겼습니다");
//			}else {
//				System.out.println("딜러가 승리했습니다.");
//			}
//		}
//		
	
		
		
	
			
	}
}
