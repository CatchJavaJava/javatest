package third;

public class ForeignStudent extends Student {
	String nation;
	
	public ForeignStudent(String name, int age, int num, String nation) {
		super(name, age, num);
		this.nation = nation;
	}
	
	public void show() {
		System.out.println("외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + num + ", 국적 ; " + nation + " ]");
	}
}
