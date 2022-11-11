package Answer.Problem_3;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("이영지", 21);
		Student s = new Student("짱구", 31, 2011);
		ForeignStudent f = new ForeignStudent("조나단", 23, 2020, "SOUTH KOREA");
		
		p.show();
		s.show();
		f.show();
		
	}

}