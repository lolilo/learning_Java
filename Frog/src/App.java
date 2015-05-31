class Frog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class App {
	public static void main(String[] args) {
		Frog frog = new Frog();		
		frog.setName("Brekeke");
		frog.setAge(1);
		
		System.out.println("This frog's name is \"" + frog.getName() + "\".");
		System.out.println("It is " + frog.getAge() + " year old.");
	}
}
