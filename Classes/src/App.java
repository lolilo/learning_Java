class Person {
	String name;
	int age;
	
	void introduce() {
		System.out.println("Hello, my name is " + name + ", and I am " + age + " years old.");
	}
}

public class App {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Lilo";
		person.age = 15;
		
		System.out.println("person object's name is " + person.name);
		person.introduce();
	}
}
