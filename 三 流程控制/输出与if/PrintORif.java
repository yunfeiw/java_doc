package yunfei;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello,wrold!");
		int n = 100;
		n = 200;
		System.out.println(n);
		int x = n;
		System.out.println(x);
		x = x + 100;
		// 输出 print(输出) println(换行输出) parintf(格式化输出)
		System.out.println(x);
		System.out.println(n);
		System.out.print(11);
		System.out.print("hahah");
		System.out.printf("%.2f\n", 1.1111);
		/**
		 * 短路运算符 a || b ; a为真时，程序终止 a && b ; a为真时，执行b，并输出
		 */
		String s = "hello";
		if (s != null && s.equals("hello")) {
			System.out.println("真实");
		}
		String s1 = "hello";
		String s2 = "HELLO".toLowerCase();
		/**
		 * if 判断缩写 注意：此写法只针对if语句下的第一段;
		 */
		int v1 = 1;
		int v2 = 2;
		if (v1 == v2)
			System.out.println("if缩写");
		/**
		 * java中的 == 判断的是引用类型的引用地址 java中使用 equals 来进行字符串的判断
		 * 值得注意的是，在使用equals时，对比的值是null会抛出错误，所以使用短路运算符来进行判断是否为null
		 */
		if (s1 == s2) {
			System.out.println("两值相等");
		}
		if (s1.contentEquals(s2)) {
			System.out.println("两值相等");
		}
	}

}
