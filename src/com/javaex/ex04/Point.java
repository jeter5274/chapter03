package com.javaex.ex04;

public class Point {

	//필드
	private int x, y;
	
	//생성자
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메소드 getter/setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
		
	//메소드 일반
	public void showInfo() {
		System.out.println("점 x: " +x+ "    y:"+y);
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)	//같은 인스턴스 일때
			return true;
		if (obj == null)	//비교 대상이 없을 때
			return false;
		if (getClass() != obj.getClass())	//클래스가 다를 때
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
	/*
	@Override
	public int hashCode() {
		return x+y;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(this.hashCode() == ((Point)obj).hashCode()) {
			
			if(this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	*/
	/*
	 주소값이 같으면 같다
	 x + y = 주소값 -> hashcode로 재정의
	 2, 3 -> 5
	 2, 3 -> 5
	 같다 일 가능성이 높다(100%는 아님)
	 
	 2, 3 ->5
	 3, 2 ->5
	 이런 경우 때문에 x와 x 비교, y와 y 비교
	 
	 x+y = 주소값
	 2, 3 -> 5
	 5, 8 -> 13
	 
	 다르다고 '결론'
	 */
	
	
}
