package third;
//Person, Person의 자식 Student, Student의 자식 ForeignStudent를 클래스로 작성하고 배열을 이용하여 출력하는 프로그램
public class third {

	public static void main(String[] args) {
		
		Person[] a = new Person[3];
		
		a[0] = new Person("질동이", 22);
		a[1] = new Student("황진이", 23, 100);
		a[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		for(Person i: a)
			i.show();
	}
}
