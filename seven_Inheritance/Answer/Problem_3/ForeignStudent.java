package Answer.Problem_3;

public class ForeignStudent extends Student {
	public String nation;
	
	public ForeignStudent(String name, int age, int studentID, String nation) {
		super(name, age, studentID);
		this.nation = nation;
	}
	
	@Override
	public void show() {
		System.out.println("외국학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentID + ", 국적 : " + nation + "]");
	}
}

