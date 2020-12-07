package com.javaex.ex06;

public class WrapperApp {

	public static void main(String[] args) {
		
		Integer n01 = new Integer(23);
		Integer n02 = new Integer(100);
		
		Integer sum = n01+n02;
		System.out.println(sum);
		System.out.println(sum.toString());
		
		Integer sum2 = new Integer(50) + new Integer(51);
		System.out.println(sum2);
		
		Integer i01 = 23;	//박싱 //생성자 없이, 약식으로 쓸 수 있음
		i01.parseInt("123123"); //박싱메소드가 포함
		
		int no = n02; //언박싱, 메소드를 다 버리고, 숫자만 담는다.
		
		//메소드 사용
		//문자열 -> 정수로 변경
		int result = i01.parseInt("12345");
		System.out.println(result);
		
		//이상한 점 131313 -> 13579로 변환해야함
		Integer no03 = new Integer("131313");
		int result01 = no03.parseInt("13579");
		
		//이에, parseInt메소드는 static으로 선언되어있어, 그냥 사용이 가능하다.
		int result02 = Integer.parseInt("13579");
		System.out.println(result02);
		
		//정수를 문자형
		//12345 -> "12345"
		String result03 = String.valueOf(12345);
		System.out.println(result03);
		
		String result04 = ""+12345;	//문자열 + 정수형은 문자열로 형변환되어서, 이렇게 자주 씀
	}

}
