package third;

public class Student extends Person{
	int num;
	
	public Student(String name, int age, int num) {
		super(name, age);
		this.num = num;
	}
	
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + num + " ]");
	}
}
