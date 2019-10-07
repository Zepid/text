interface Animal{
	void shout();
}
public class Unit4plus {
	public static void main(String[] args) {
		class Cat implements Animal{
			public void shout() {
				System.out.println("~~");
			}
		}
	
		animalShout(new Cat());
	}
	
	public static void animalShout(Animal an) {
		an.shout();
	}
}