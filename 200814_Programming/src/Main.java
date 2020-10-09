import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s[] = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (s[i].length() > s[j].length()) { // ���̰� ª�� �ͺ���
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				} else if (s[i].length() == s[j].length()) { // ���̰� ������ ���� ������
					if (s[i].equals(s[j])) { // �ܾ ������� continue
						continue;
					}
					for (int k = 0; k < s[i].length(); k++) {
						if (s[i].charAt(k) > s[j].charAt(k)) {
							String temp = s[i];
							s[i] = s[j];
							s[j] = temp;
							break;
						} else if (s[i].charAt(k) < s[j].charAt(k)) {
							break;
						}
					}
				}
			}
		}

		System.out.println(s[0]);
		for (int i = 1; i < n; i++) {
			if (s[i - 1].equals(s[i])) { // �ռ� �ܾ�� ���� ��� continue
				continue;
			}
			System.out.println(s[i]);
		}
	}

}
