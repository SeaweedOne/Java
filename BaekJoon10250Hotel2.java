import java.util.Scanner;

public class BaekJoon10250Hotel2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		String[] arr = new String[T];

		for (int i = 0; i < T; i++) {
			arr[i] = s.nextLine();
		}
		for (int i = 0; i < T; i++) {
			String[] temp = arr[i].split(" ");
			int H = Integer.parseInt(temp[0]);
			int W = Integer.parseInt(temp[1]);
			int N = Integer.parseInt(temp[2]);
			int[][] room = new int [H][W];
			for (int j = 0; j<W; j++) {
				for (int k = 0; k<H; k++) {
					N--;
					if (N==0) {
						System.out.println("" + H + W);
					}
				}
			}

		}

	}

}
