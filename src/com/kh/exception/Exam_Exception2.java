package com.kh.exception;

public class Exam_Exception2 {
	public static void main(String[]args) throws ArrayIndexOutOfBoundsException{
		int [] arrs = new int[3];
		
		try {
			for(int i = 0; i<arrs.length; i++) {
				arrs[i] = i;
			}	
			System.out.println(arrs[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε��� ������ �Ѿ���ϴ�.");
		}
			
	}

}
