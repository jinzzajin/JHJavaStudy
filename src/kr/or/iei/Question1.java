package kr.or.iei;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inputNums = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "��° �����Է� : ");
			inputNums[i] = sc.nextInt();
		}
		for (int i = 0; i < inputNums.length - 1; i++) {
			for (int j = 0; j < (inputNums.length - 1) - i; j++) {
				if (inputNums[j] > inputNums[j + 1]) {
					int temp = inputNums[j + 1];
					inputNums[j + 1] = inputNums[j];
					inputNums[j] = temp;
				}

			}
		}
		System.out.print("���� �� ��� : ");
		for (int i = 0; i < inputNums.length; i++) {
			System.out.print(inputNums[i] + " ");
		}
		System.out.println();
		int sum = inputNums[0] + inputNums[inputNums.length - 1];
		System.out.println("���� �� ù��° ���� ������ ���� �� : " + sum);
	}

}
