public class First {
	public static void main(String[] args) {
		Beer b1 = new Beer(8, "비어");
		Soju s1 = new Soju(20, "쏘주");
		Wine w1 = new Wine(15, "와인");
		
		b1.alc();
		s1.alc();
		w1.alc();
	}
}
