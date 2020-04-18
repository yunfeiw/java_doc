package extend;

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Wang");
		Student s = new Student("云飞");
		s.getBookName();
		
		System.out.println( p instanceof Student);
		System.out.println( s instanceof Student);
		
	}

}
