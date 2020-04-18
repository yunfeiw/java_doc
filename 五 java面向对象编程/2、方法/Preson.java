
public class Preson {
	private String name;
	private int age;
	
	public void setName(String name) {
		name = "    我是神";
		this.name = name.trim();
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getYaer() {
		return calceFun("2019");
	}
	/*设置私有方法*/
	private String calceFun(String year) {
		return year + "年";
	}
}
