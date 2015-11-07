/*
 * Copyright (c) 2015 
 * 广州米所思信息科技有限公司(Guangzhou Misuosi Information technology co., LTD) 
 * All rights reserved.
 */
package sort;
/**
 * Description		: 选择排序算法
 * <p/>
 * <br><br>Time		: 2015-11-3 下午4:58:05
 *
 * @author ZXL
 * @version 1.0
 * @since 1.0
 */
public class SelectionSort {
	public static void main(String[] args) {
		int[] nums= {4,8,7,5,8,5,9,3,2,1};
		SelectionSort.selection(nums);
		for (int e : nums){
			System.out.print(e+",");
		}
	}
	
	public static void selection(int[] nums){
		int temp = 0;
		int mark = 0;//用于标记最小数的位置
		for (int i=0; i<nums.length; i++){
			//每次从某数开始
			int min = nums[i];
			//往后与后面的数比大小，找出最小数
			for (int j=i; j<nums.length; j++){
				if (min>nums[j]){
					min = nums[j];
					mark = j;
				}
			}
			//与之交换位置
			temp = nums[i];
			nums[i] = nums[mark];
			nums[mark] = temp;
		}
	}
}

