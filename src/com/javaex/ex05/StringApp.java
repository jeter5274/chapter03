package com.javaex.ex05;

public class StringApp {

		public static void main(String[] args) {
			
			String str = new String("안녕하세요");
			
			System.out.println(str); //println 주소값을 파마미터로 사용하면 toString을 실행함 -> java.lang.String@938012
			//System.out.println(str.toString());
			
			String str01 = "안녕!";
			System.out.println(str01);
			
			String s01 = new String("hi");
			String s02 = new String("hi");
			
			System.out.println(s01);
			System.out.println(s02);
			
			System.out.println(s01 == s02);
			System.out.println(s01.hashCode());
			System.out.println(s02.hashCode());
			System.out.println(s01.hashCode() == s02.hashCode());
			
			if(s01 == s02) {	//주소값이 같은 경우
				
			}
			
			if(s01.equals("hi")) {	//문자열이 같은 경우, 단 s01이 주소값을 가지고 있지 않은 경우 null포인트가 되는 경우가 발생함
				
			}
			
			if("hi".equals(s01)) {	//위 if문에서 발생하는 null포인트 문제점의 해결책
				
			}
			
			System.out.println("=특이케이스==================================================");
			String s03 = "hello";
			String s04 = "hello"; //약식으로 같은 문자열을 쓸 경우, 기존의 메모리를 검색하여 중 내용이 있는지 확인하여 주소값을 가져옴 (메모리 관리를 위함)
			
			System.out.println(s03);
			System.out.println(s04);
			
			System.out.println(s03 == s04); //같은 주소를 가리키고 있음
			
			System.out.println(s03.hashCode());
			System.out.println(s04.hashCode());
			
			s03 = "hello!!!!!";		//약식으로 썻으면 글자를 변경할 시에, 새로 메모리에 올린다
			System.out.println(s03);
			System.out.println(s04);
			
			String s05 = "hi";		//생성자(new)를 통해 미리 만들어진 문자열은, 같은 문자열의 약식생성시 메모리 검색에서 제외된다.
			System.out.println(s01 == s05);
			System.out.println(s02 == s05);
			
		}
}
