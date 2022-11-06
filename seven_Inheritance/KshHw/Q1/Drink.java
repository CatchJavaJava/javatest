
public abstract class Drink {
	int alcol;
	
	
	public Drink(int alcol) {
		this.alcol = alcol;
	}
	
	public abstract void alc();
}

class Beer extends Drink{
	String name;
	
	
	public Beer(int alcol, String name) {
		super(alcol);
		this.name = name;
	}
	
	@Override
	public void alc() {
		System.out.println(name +" 맥주의 도수는 "+ alcol + "도 입니다.");
		}
}

class Soju extends Drink{
	String name;
	
	
	public Soju(int alcol, String name) {
		super(alcol);
		this.name = name;
	}
	
	@Override
	public void alc() {
		System.out.println(name +" 소주의 도수는 "+ alcol + "도 입니다.");
	}
}

class Wine extends Drink{
	String name;
	
	
	public Wine(int alcol, String name) {
		super(alcol);
		this.name = name;
	}
	
	@Override
	public void alc(){
		System.out.println(name +" 와인의 도수는 "+ alcol + "도 입니다.");
	}
}