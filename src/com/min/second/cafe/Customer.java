package com.min.second.cafe;

import java.util.Scanner;

public class Customer {
	
	public MenuItem order(Menu menu) {
				menu.printMenu();
		Scanner sc = new Scanner(System.in);
		MenuItem mi = null;
		
		while(mi == null) {
			try {
				System.out.println("메뉴를 입력하세요.");
				String select = sc.nextLine();
				int intSelect = sc.nextInt();
				mi = (menu.choose(intSelect-1));
				
			}catch(NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
			}catch(Exception e) {
				System.out.println("메뉴를 잘못 선택하였습니다.");
			}
		}
		sc.close();
		return mi;
		
	}
	public void drinkCoffee(Coffee coffee) {
		System.out.printf("%s를 마신다",coffee.getName());
	}
}