package cn.cjm.interview;
/**
 * 
 * @ClassName: Array_findNum 
 * @Description: 
 * 题目: 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的
 * 个二维数组和一个整数，判断数组中是否含有该整数。
 * @author cjm
 * @date 2017年11月21日 下午8:25:39 
 *
 */
public class Array_findNum {
	public static void main(String[] args) {
		// 创建一个从从左到右，从上到下递增的数组
		int [][] array = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int num = 7;
		if(findNumInArray(array,num)) {
			System.out.println("找到该数了");
		}else {
			System.out.println("没找到该数");
		}
	}

	private static boolean findNumInArray(int[][] array, int num) {
		// 从右上角开始
		int i = 0;
		int j = array[0].length-1;
		while(i<array.length && j>=0) {
			if(array[i][j]>num) {// 如果查找的数比当前数要小，左移
				j--;
			}else if(array[i][j] < num) {// 如果查找的数比当前数要大，下移
				i++;
			}else {// 找到这个数
				i++;
				j++;
				System.out.println("位置在["+i+"]["+j+"]");
				return true;
			}
		}
		return false;
	}
}
