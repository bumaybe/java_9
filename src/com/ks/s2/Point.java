package com.ks.s2;

public class Point {
	//접근지정자를 안쓰면 default (ex.int 앞에 default선언 되어있다는것)
	private int num; 
	public String name;
	
	public Point() {
		
	}
	
	public void setNum(int num) {
		if(num >0 && num <100) {
		this.num = num;
		}
		else{
			num =0;
		}
	}
	
	public int getNum() {
		return this.num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		if(this.name == null) {
			return "영희";
		}
		else {
		return this.name;
		}
	}
	
	public void info() {
		System.out.println(num);
		System.out.println(name);
	}
}
