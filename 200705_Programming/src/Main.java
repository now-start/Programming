import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[][] board;
	static int n;
	static int time = 0;
	static String[] move;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();// ������ ũ��
		board = new int[n + 1][n + 1];

		int k = sc.nextInt();// ����� ����
		for (int i = 0; i < k; i++) {
			board[sc.nextInt()][sc.nextInt()] = 1;
		}

		int l = sc.nextInt(); // ���� ���� ��ȯ ���� ����
		move = new String[10001];// (0 <= x <= 10000)
		for (int i = 0; i < l; i++) {
			int m = sc.nextInt();
			String d = sc.next();
			move[m] = d;
		}

		move();

		System.out.println(time);
	}

	public static void move() {
		Queue<Snake> q = new LinkedList<>(); // ���� ��ġ���� ���� ť

		int dirx = 0, diry = 1;
		int x = 1, y = 1;

		while (true) {
			if (x <= 0 || y <= 0 || x > n || y > n || board[x][y] == 2) {
				break;
			}

			if (board[x][y] == 0 && time != 0) { // �տ� ����� ���� ���
				Snake snake = q.poll();
				board[snake.x][snake.y] = 0; // �����κ� ���ֱ�
			}

			board[x][y] = 2;
			q.add(new Snake(x, y));

			if (move[time] != null && move[time].equals("D")) {
				if (diry == 1) { // ������ -> �Ʒ���
					dirx = 1;
					diry = 0;
				} else if (diry == -1) { // ���� -> ����
					dirx = -1;
					diry = 0;
				} else if (dirx == 1) { // �Ʒ��� -> ����
					dirx = 0;
					diry = -1;
				} else if (dirx == -1) { // ���� -> ������
					dirx = 0;
					diry = 1;
				}
			} else if (move[time] != null && move[time].equals("L")) {
				if (diry == 1) { // ������ -> ����
					dirx = -1;
					diry = 0;
				} else if (diry == -1) { // ���� -> �Ʒ���
					dirx = 1;
					diry = 0;
				} else if (dirx == 1) { // �Ʒ��� -> ������
					dirx = 0;
					diry = 1;
				} else if (dirx == -1) { // ���� -> ����
					dirx = 0;
					diry = -1;
				}
			}

			x += dirx;
			y += diry;
			time += 1;
		}
	}
}

class Snake {
	int x;
	int y;

	public Snake(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
