package com.kh.javaapi;

public class Exam_StingBuffer {
	public static void main(String[]args) {
		//StingBuffer : ���ڿ��� �������ִ� Ŭ����
		//Sting���� ���ڿ��� �������ִ� �޼ҵ� : concat
		StringBuffer sb = new StringBuffer(); //��ü 1�� ����
		sb.append("hello");
		sb.append(" ");
		sb.append("JAVA");
		
		System.out.println("����� ���ڿ� : "+sb.toString());
		String result = "hello"+" "+"JAVA";//��ü 3������ ->�޸𸮸� ���� ���� .string�� �ּҸ� �Ҵ��ϴϱ�
		
		StringBuffer stb=new StringBuffer().append("KH").append("Java class").append("good");//�޼ҵ� ü�̴�
		System.out.println(stb.toString());
//		stb.delete(14, 17);
//		System.out.println(stb.toString());
		System.out.println(stb.substring(14));
		
	}

}
