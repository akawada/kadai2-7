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
			if (chknum(strin) == false){
				System.err.println("�s���Ȑ��l�ł��B������x���͂��Ă��������B");				
			}
			// �t�B�{�i�b�`����o��
			else{
				num = Integer.parseInt(strin);
				System.out.println(num + "�Ԗڂ̃t�B�{�i�b�`��=" + fibonacci(num));
				scan.close();
				break;
			}
		}
	}
	
	private static int fibonacci(int n) {
		return n <= 2 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
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

