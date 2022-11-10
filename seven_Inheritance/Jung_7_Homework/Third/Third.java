public class Third {
	public static void main(String[] args) {
		Person[] pm = new Person[3];
		pm[0] = new Person("질동이", 22);
		pm[1] = new Student("황진이", 23, 100);
		pm[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");
		
		for(Person i: pm)					//for each문, i에 Person배열 pm의 데이터가 차례대로 대입
			i.show();
	}
}
