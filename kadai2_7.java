import java.util.Scanner;

public class kadai2_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		Integer num=0;
		
		// 入力の繰り返し
		while (true) {
			System.out.println("1~30の数値を入力してください");
			strin = scan.next();
			// 数値チェック
			if (!chknum(strin)){
				System.err.println("不正な数値です。もう一度入力してください。");				
			}
			// フィボナッチ数列出力
			else{
				num = Integer.parseInt(strin);
				for (int i = 0; i <= num; i++) {
					System.out.println(i + "番目のフィボナッチ数=" + fibonacci(i));
				}
				scan.close();
				break;
			}
		}
	}
	
	private static int fibonacci(int n) {
		if (n == 0){
			return n;
		}
		else{
			return n <= 2 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	// 数値チェック
	static boolean chknum(String numchk) {
		try {
			Integer.parseInt(numchk);
			if (Integer.parseInt(numchk) < 0){
				return false;
			}
			else if (Integer.parseInt(numchk) > 30){
				return false;
			}
			else{
					return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}
	}
}

