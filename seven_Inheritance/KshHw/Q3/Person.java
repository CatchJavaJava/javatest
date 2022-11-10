
public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println("사람[이름 : " + name + ", 나이 : " + age + "]");
	}
}

class Student extends Person{
	int studentNumber;
	
	public Student(String name, int age, int studentNumber) {
		super(name, age);
		this.studentNumber = studentNumber;
	}
	
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번  : "+ studentNumber + "]");
	}
}


class ForeignStudent extends Student{
	String nation;
	
	public ForeignStudent(String name, int age, int StudentNumber, String nation) {
		super(name, age, StudentNumber);
		this.nation = nation;
	}
	
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번  : "+ studentNumber +", 국적 : " + nation + "]");
	}
}