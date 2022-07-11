package com.kh.javaapi;

public class Exam_WrapperClass {
	public static void main(String[]args) {
	//Wrapper클래스
	//기본 자료형을 객체화 해주는 클래스
		int num =3 ;
		Integer input = new Integer(3);
		parseExample();
	}
		
	static void boxingExample() {
		Integer input = new Integer(3);
		Integer nInput = 100; //100 ->new Integer(100); Auto-Boxing
		int iNum = input; //input.intValue() ->input ; Auto-Unboxing; 
	}
	
	////////////////////////////////////////////////////
	static void wrapperExample() {
		Long lNum = new Long(22222);
		
		Integer value = Integer.valueOf(33);//위에거를 이렇게써도된다
		Long lValue = Long.valueOf("2222");
	}
	static void parseExample() {
		String strNum = "220613";
		String strNum2 = "221118";
		int result = Integer.parseInt(strNum2)-Integer.parseInt(strNum);//숫자로된 문자열을 int로사용
		System.out.println("결과 :"+result);
		
		String strNum3 = "3.14";
		double result2 = Double.parseDouble(strNum3);
		System.out.println("결과 : "+result2);
	}
	
	static void dataParsingExample() {
		byte bValue = Byte.parseByte("1");
		short sValue = Short.parseShort("2");
		int iValue = Integer.parseInt("3");
		Long linput = Long.parseLong("4");
		
		float fValue = Float.parseFloat("0.1");
		
		boolean bInput = Boolean.parseBoolean("true");
		
		//char cValue = Character.parseChar("JAVA"); ----->안됨
		char cValue = "JAVA".charAt(0);
	}
	static void parsingStringExample() {//String으로 만들어주기
		//3-->"3"
		String bStr = Byte.valueOf((byte)1).toString();
		String sStr = Short.valueOf((short)2).toString();
		String iString = Integer.valueOf(3).toString();
		String lStr = Long.valueOf(4l).toString();
		
		String fStr=Float.valueOf(0.5f).toString();
		String dStr=Double.valueOf(0.6).toString();
		
		String boolStr=Boolean.valueOf(true).toString();
		String cStr=Character.valueOf('A').toString();
		
		String data=String.valueOf(123);
		String input=1234+"";
		
	}
	
}
