package com.min.second.cafe;

public class Cafe {

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.printMenu();
		
		MenuItem mi = menu.choose(0);
		System.out.println(mi);
		
	}

}



