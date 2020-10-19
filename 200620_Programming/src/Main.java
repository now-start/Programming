import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	// ��ĳ�ʷ� ���� ��� �ð� �ʰ� �׷��� BufferedReader ���
	// LinkedList, index ���� for ���� ������ size() ������� ���� �ð� �ʰ�
	// �׷��Ƿ� stack 2���� Ȱ���Ͽ� �ذ�
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Object> left = new Stack<>();
		Stack<Object> right = new Stack<>();

		// ���ڿ��� �� ���ھ� List �迭�� �߰�
		String s = bf.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			left.push(s.charAt(i));
		}
		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			String[] line = bf.readLine().split(" ");
			if (line[0].equals("L") && !left.empty()) {
				right.push(left.pop());
			} else if (line[0].equals("D") && !right.empty()) {
				left.push(right.pop());
			} else if (line[0].equals("B") && !left.empty()) {
				left.pop();
			} else if (line[0].equals("P")) {
				left.push(line[1].charAt(0));
			}
		}

		while (!left.empty()) {
			right.push(left.pop());
		}
		while (!right.empty()) {
			System.out.print(right.pop());
		}
		
	}

}
