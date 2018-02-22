package com.ks.himart;

import java.util.Scanner;

public class Customer {

	private int money;
	private int point;

	public void buy(int select) {
		//계산이 이루어지는곳
		//포인트 계산도 이루어진다
		Computer com = new Computer();
		Phone ph = new Phone();
		Tv t = new Tv();


		Scanner sc = new Scanner(System.in);
	

			System.out.println("1.컴퓨터");
			System.out.println("2.핸드폰");
			System.out.println("3.TV");
			System.out.println("4.나가기");
			System.out.println("구매할 제품의 번호를 입력하세요");

			int a = sc.nextInt();
			int b;
			int c;
			switch(a) {
			case 1:
				b = com.setPrice(1000000);
				c = com.setPoint(100);
				money = this.money-b;
				point = point+c;
				break;
			case 2:
				
				
				b=ph.setPrice(800000);
				c=ph.setPoint(80);
				money = this.money-b;
				point = point+c;
				break;
			case 3: 
				b=t.setPrice(1200000);
				c=t.setPoint(120);
				money = this.money-b;
				point = point+c;
				break;
			case 4:
				System.out.println("나갑니다");
				break;
			default:
				System.out.println("번호가 잘못되었습니다");
				
		}

		System.out.println("현재남은돈 :" + money);
		System.out.println("현재 누적 포인트 :" + point);

	}


	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

}
