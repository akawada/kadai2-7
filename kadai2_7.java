import java.util.Scanner;

public class kadai2_7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		Integer num=0;
		
		// ���͂̌J��Ԃ�
		while (true) {
			System.out.println("1~30�̐��l����͂��Ă�������");
			strin = scan.next();
			// ���l�`�F�b�N
			if (!chknum(strin)){
				System.err.println("�s���Ȑ��l�ł��B������x���͂��Ă��������B");				
			}
			// �t�B�{�i�b�`����o��
			else{
				num = Integer.parseInt(strin);
				for (int i = 0; i <= num; i++) {
					System.out.println(i + "�Ԗڂ̃t�B�{�i�b�`��=" + fibonacci(i));
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
	
	// ���l�`�F�b�N
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

