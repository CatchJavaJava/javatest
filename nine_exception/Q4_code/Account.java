public class Account {
	private String ano;				//계좌번호
	private String owner;			//계좌주
	private int balance;			//금액

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void showData()
	{
		System.out.println(this.ano + "\t" + this.owner + "\t" + this.balance);
	}
}