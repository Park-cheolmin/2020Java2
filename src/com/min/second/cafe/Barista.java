package com.min.second.cafe;

public class Barista {
	
	public Coffee makeCoffee(MenuItem choiceMenu) {
		
		Coffee coffee = new Coffee(choiceMenu);
		return coffee;
		
		
	}
}