
public class Main {

	public static void main(String[] args) {
		Preson yf = new Preson();
		String name = "小傻瓜";
		/*设置*/
		yf.setName(name);
		System.out.println(name);
		yf.setAge(20);
		/*打印*/
		System.out.println(yf.getName());
		System.out.println(yf.getAge());
	}

}
