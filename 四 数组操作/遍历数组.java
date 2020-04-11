package yunfei;
import java.util.Arrays;
public class Hello {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44};
		//得到引用地址
		System.out.println(arr);
		//使用 Arrays.toString()打印数组内容
		System.out.println(Arrays.toString(arr));
		//数组排序 冒泡排序 与 Arrays.sort(arr)
		Arrays.sort(arr);
		//多维数组
		int[][] arr2= {
				{1,2,3},
				{11,22,33}
		};
		//打印多维数组
		Arrays.deepToString(arr2);
	}

}
