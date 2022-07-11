package com.kh.exceptionbasic;

import java.util.Scanner;

public class Exam_Exception {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
			while(true) {
			try{
				System.out.println("정수 하나 입력 : ");
				int choice = sc.nextInt();
				System.out.println("입력된 정수는 : "+choice);
			}catch(java.util.InputMismatchException e) {
				//e = new InputMismatchException();
				//e.printStackTrace();
				System.out.println(e.toString());
				sc.next();
				continue;
				
				}
			}
	}
}