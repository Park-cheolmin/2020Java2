package com.min.second.cafe;

public class Cafe {

	public static void main(String[] args) {
//		Menu menu = new Menu();
//		menu.printMenu();
//		
//		MenuItem mi = menu.choose(0);
//		System.out.println(mi);
		
		Customer cus = new Customer();
		Menu menu = new Menu();
		Barista bas = new Barista();
		/*
		MenuItem mi = cus.order(menu);
		System.out.println(mi);
		*/
		
		MenuItem choiceMenu = cus.order(menu);
		Coffee coffee = bas.makeCoffee(choiceMenu);
	}
}