package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		while (true) { // Was it a cat I saw? �� ���ö� ���� ��� �Է�
			String a = sc.nextLine();
			if (a.equals("Was it a cat I saw?")) {
				break;
			}
			System.out.println(a);
		}
	}

}
