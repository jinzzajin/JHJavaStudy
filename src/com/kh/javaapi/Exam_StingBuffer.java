package com.kh.javaapi;

public class Exam_StingBuffer {
	public static void main(String[]args) {
		//StingBuffer : 문자열을 연결해주는 클래스
		//Sting에서 문자열을 연결해주는 메소드 : concat
		StringBuffer sb = new StringBuffer(); //객체 1개 생성
		sb.append("hello");
		sb.append(" ");
		sb.append("JAVA");
		
		System.out.println("연결된 문자열 : "+sb.toString());
		String result = "hello"+" "+"JAVA";//객체 3개생성 ->메모리를 많이 쓴다 .string이 주소를 할당하니까
		
		StringBuffer stb=new StringBuffer().append("KH").append("Java class").append("good");//메소드 체이닝
		System.out.println(stb.toString());
//		stb.delete(14, 17);
//		System.out.println(stb.toString());
		System.out.println(stb.substring(14));
		
	}

}
