package com.ks.s1;

public class Member {
	
	private String name;//이름
	private int age;//나이
	private double weight;//몸무게
	private String s;//성별
	private double tall;//키
	private String call;//(-)포함한 전화번호
	
	public Member() {
		/*name = "iu";
		age = 26;
		weight = 50;
		s = "여";
		tall = 163.7;
		call = "010-1234-5678";*/
	}
	
/*	public void setName(String name) {
		this.name = name;
	}*/
	
	
	
	public void info() {
		System.out.println("이름 :" +name);
		System.out.println("나이 :" +age);
		System.out.println("몸무게 :"+weight);
		System.out.println("성별 :" +s);
		System.out.println("키 :"+tall);
		System.out.println("전화번호 :"+call);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}
}
