import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd; // �ִ�����
		int lcm; // �ּҰ����

		// ��Ŭ����� ȣ����
		if (a >= b) {
			gcd = getGcd(a, b);
		} else {
			gcd = getGcd(b, a);
		}
		lcm = a * b / gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}

	public static int getGcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return getGcd(b, a % b);
	}
}
