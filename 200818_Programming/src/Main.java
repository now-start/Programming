import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		for(int i=1;i<=n;) {
			num++;
			String str = String.valueOf(num);
			if (str.contains("666")) {
				i++;
			}
		}
		System.out.print(num);
	}

}
