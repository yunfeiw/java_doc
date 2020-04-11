package yunfei;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44};
		/**
		 * for循环
		 * */
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
		/**
		 * forEach循环
		 * */
		for(int k : arr) {
			System.out.println(k);
		}
			
	}

}
