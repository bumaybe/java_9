package com.ks.himart;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		Computer com = new Computer();
		Phone ph = new Phone();
		Tv t = new Tv();
		
		t.setBrand("LG");
		t.setSize(100);
		t.setPrice(10000000);
		t.setPoint(10000);
		
		com.setCpu("intel-i7");
		com.setPrice(1200000);
		com.setWeight(1.21);
		com.setPoint(120);
		
		ph.setBrand("Samsung");
		ph.setColor("BLACK");
		ph.setPrice(800000);
		ph.setPoint(800);
		
		Customer cus = new Customer();
		cus.setMoney(90000000);
		cus.setPoint(0);
		
		cus.buy(1);
		
		

	}

}
