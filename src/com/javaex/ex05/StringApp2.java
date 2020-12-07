package com.javaex.ex05;

public class StringApp2 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		System.out.println(a.concat(b));
		System.out.println(a);
		
		a = a.concat(b);		
		System.out.println(a);
		
		//trim() 앞뒤 공백을 제거함
		a = a.trim();
		System.out.println(a);
		System.out.println("__"+a+"__"); //공백 확인용
		
		a = a.replace("ab", "12,");	//앞 파라미터를 뒷 파라미터로 변경
		System.out.println(a);
		
		System.out.println("==========================");
		
		String[] sArray = a.split(",");
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		String str = "Hello java";
		String result01 = str.substring(4);	//[4]번부터(포함) 출력(배열로 관리하므로, 0부터 시작)
		System.out.println(result01);
		System.out.println(str);
		
		String result02 = str.substring(2, 4); //[2]번부터 [4]번전까지([2]번만 포함) 출력
		System.out.println(result02);
		
		char c = str.charAt(1); //[1]번 문자(배열로 관리하므로, 0부터 시작)
		System.out.println(c);
		
		String c2 = str.substring(1, 2);
		System.out.println(c2);
		
		
	}

}
