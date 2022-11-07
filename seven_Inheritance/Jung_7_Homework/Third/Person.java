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
	int number;
	
	public Student(String name, int age, int number) {
		super(name, age);
		this.number = number;
	}
	
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번  : "+ number + "]");
	}
}


class ForeignStudent extends Student{
	String where;
	
	public ForeignStudent(String name, int age, int number, String where) {
		super(name, age, number);
		this.where = where;
	}
	
	public void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번  : "+ number +", 국적 : " + where + "]");
	}
}