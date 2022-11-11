package Answer.Problem_3;

public class Student extends Person {
	public int studentID;
	
	public Student(String name, int age, int studentID) {
		super(name, age);
		this.studentID = studentID;
	}
	
	@Override
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + studentID + ']');
	}
	
}