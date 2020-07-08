package com.min.second.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private List<MenuItem> arr = new ArrayList();
	
	public Menu() {
		init();
	}
	
	private void init() {
		arr.add(new MenuItem("아메리카노", 1500));
		arr.add(new MenuItem("카푸치노", 2000));
		arr.add(new MenuItem("카라멜 마키아또", 2500));
		arr.add(new MenuItem("에스프레소", 2500));
	}
	
	public void printMenu() {
		System.out.println("--------MENU--------");
		for(int i=0; i<arr.size(); i++) {
			MenuItem menu  = arr.get(i);
			System.out.printf("%d. %s, %,d원\n", (i+1), menu.getName(), menu.getPrice());
		}
	}
	
	public void menuSetter(MenuItem menu) {
		arr.add(menu);
	}
	
	public  MenuItem menuGetter(int num) {
		return arr.get(num);
	}
	
	public MenuItem choose(int idx) {
		return arr.get(idx);
	}
	
	
}
