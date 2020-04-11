package yunfei;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Select 1 ~ 4 : ");
		int opt = scanner.nextInt();
		/**
		 * switch多重判断
		 * switch 具有穿透性，break作用是便是阻止穿透
		 * switch 计算结果必须是整型、字符串或枚举类型
		 * case为判断条件
		 *  case: 1
		 *  case: 2
		 * 即符合 1/2即会执行当前逻辑
		 * 
		 * */
		switch(opt) {
			case 0:
				System.out.println("switch 0");
				break;
			case 1:
				System.out.println("switch 1");
				break;
			case 2:
				System.out.println("switch 2");
			case 3:
				System.out.println("switch 3");
				break;
			case 4:
			case 5:
				System.out.println("switch 4 or 5");
				break;
		default:
			break;
		}
	}

}
