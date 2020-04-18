package extend;

public class Person {
	protected String name;
	
	Person(String name){
		this.name = name;
	}
	public void run () {
		System.out.println(this.name+"run time");
	}
}
