import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArr = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int index = 0;									//등록된 계좌 수

	public static void main(String[] args) {
		while (true) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1. 신규계좌등록\n2. 계좌목록조회\n3. 예금\n4. 출금\n0. 종료");
			System.out.println("----------------------------------------------------------");
			
			System.out.print("메뉴 선택 : ");
			int mainMenu = scanner.nextInt();
			switch(mainMenu)
			{
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 0:
				return;
			}
		}
	}

	
	private static void createAccount() {
		String ano;
		String owner;
		int balance;
		
		System.out.println("----------------------");
		System.out.println("1. 신규계좌등록");
		System.out.println("----------------------");
	
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("계좌주 : ");
		owner = scanner.next();
		System.out.print("초기입금액 : ");
		balance = scanner.nextInt();
		
		accountArr[index++] = new Account(ano, owner, balance);
		
		System.out.println("신규 계좌 등록이 완료되었습니다.");
		}
	
	private static void accountList() {
		System.out.println("----------------------");
		System.out.println("2. 계좌목록조회");
		System.out.println("----------------------");
		
		for(int i=0; i<index; i++)
			accountArr[i].showData();
	}

	private static void deposit() { 
		String ano;
		int balance;
		Account temp;
			
		System.out.println("----------------------");
		System.out.println("3. 예금");
		System.out.println("----------------------");
			
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("예금액 : ");
		balance = scanner.nextInt();
			
		temp = findAccount(ano);
		balance+=temp.getBalance();
		temp.setBalance(balance);		
			
		System.out.println(balance + "원 예금이 성공하였습니다.");
	}


	private static void withdraw() {
		String ano;
		int balance;
		Account temp;
		
		System.out.println("----------------------");
		System.out.println("4. 출금");
		System.out.println("----------------------");
			
		System.out.print("계좌번호 : ");
		ano = scanner.next();
		System.out.print("출금액 : ");
		balance = scanner.nextInt();
			
		temp = findAccount(ano);
		
		balance = temp.getBalance()-balance;
		temp.setBalance(balance);
			
		System.out.println(balance + "원 출금이 성공하였습니다.");
	}

	private static Account findAccount(String acc_no) {
		for(int i=0; i<index; i++)
		{
			if()
				return accountArr[i];
		}
		
		return null;

	}
}
