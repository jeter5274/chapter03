package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(100,100);
		//System.out.println(p.toString());
		
		Point p05 = p;
		
		System.out.println("toString=============================");
		
		//Object 클래스가 부모이다.
		//Object 클래스의 메소드 + Point클래스의 메소드를 사용할 수 있다.
		//겹치는 메소드 주의
		
		//테스트 Point클래스의 toSting() 지운다
		System.out.println(p.toString());
		
		//메소드 오버라이딩
		Object op = new Point();
		System.out.println(op.toString());
		
		//println toSting() 찾아서 실행한다
		System.out.println(p); //주소의 toString
		
		//getClass()
		System.out.println("getClass()=============================");
		System.out.println(p.getClass());
		
		//hashCode() 주소값 대용으로 사용 할 수 있다.
		System.out.println("hashCode()=============================");
		System.out.println(p.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());

		//equals() 같은지 비교
		System.out.println("equals()=============================");
		System.out.println(p.equals(p01));
		//주소값이 다르면 false로 처리
		
		//주소값을 직접 비교
		System.out.println(p==p01);
		System.out.println(p==p05);
		
		
		
	}

}
