package extend;

public class Student extends Person {
	private Book book;
	Student(String name) {
		super(name);
		book = new Book();
	}

	public String getName() {
		return this.name;
	}
	public void getBookName() {
		System.out.println(book.bookname);
	}
}
