package com.ks.s4;

public class Point2 extends Point{
	//int x
	int y=20;
	
	public Point2(int x, int y) {
		super();
		this.y = y;
	}
	
	
	//info
	//오버라이딩의 조건
	//상속받은 메서드명과 동일하게 선언
	//즉, 메서드 선언부는 동일
	//접근지정자는 변경 가능하지만 
	//더 좁은 범위로는 변경 불가(넓은 범위로는 가능)
	//ex) default -> public 은 가능
	// public -> private는 불가능
	public void info()//여기까지 동일 
	{
		super.info();
		System.out.println(x);
		System.out.println(y);
	}
}
