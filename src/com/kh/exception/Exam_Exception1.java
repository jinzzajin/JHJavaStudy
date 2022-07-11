package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam_Exception1 {
	private static final String EXIT = null;

	public static void main(String[]args) {
		//InputMismatchException
		//ArithmeticException
		//정수 2개를 입력받아서 나눗셈 연산 수행
		//0으로 나눌 때 발생하는 예외처리
		//정수 입력받을 때 발생하는 예외처리
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			
			try {
				//try부분
				System.out.print("첫번째 숫자 입력 : ");
				int num1=sc.nextInt();
				System.out.print("두번째 숫자 입력 : ");
				int num2=sc.nextInt();
				
				int result= num1/num2;
				System.out.println(num1+"을"+num2+"로 나눈 몫은"+result+"입니다.");
				
			}catch(InputMismatchException e){
				//catch부분 예외발생시 실행하는 코드
				System.out.println("문자열은 입력할 수 없습니다.");
				sc.next();
				continue;
			}catch(ArithmeticException ex){
				System.out.println("0으로 나눌 수 없습니다."+ex.getMessage());
			}finally {
				System.out.println("finally 늘 실행되는 코드!!!");
			}
		}
		
		
		
	}

}
