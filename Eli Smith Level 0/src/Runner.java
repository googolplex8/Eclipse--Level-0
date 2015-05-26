public class Runner {
	public static void main(String[] args) {
		Person Bob = new Person("Bob");
		Person Gary = new Person("Gary");
		Bob.setName("Joe Ho");
		Bob.setSuperpower("Runs on steam power");
		Gary.setSuperpower("Jumps fast");
	//	System.out.println(Bob.getName());
		// System.out.println(Bob.getSuperpower());
		System.out.println(Bob);
		System.out.println(Gary);
	}
}
 