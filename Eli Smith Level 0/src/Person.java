public class Person {
	String name;
	String superpower;
	String both;
	public Person(String name) {
		this.name = name;

	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}
	
	String getSuperpower(){
		return this.superpower;
	}
	
	void setSuperpower(String superpower){
		this.superpower = superpower;
	}
	@Override
	public String toString(){
		String both =  "name: " + this.name + " Superpower: " + this.superpower;
		return both;
	}
}
  