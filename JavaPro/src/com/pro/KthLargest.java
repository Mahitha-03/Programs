package com.pro;

public class KthLargest {

	public static void main(String[] args) {
		int [] arr = {5, 10, 40,60,25};
		int k =3;
		int max = Integer.MIN_VALUE;
		for(int i=0;i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max= arr[i];
			}
		}
		for(int j= 1; j < k ; j++)
			
		{
			int nextMax= Integer.MIN_VALUE;
			for (int i =0 ; i < arr.length ; i++)
			{
				
			if(arr[i] < max && arr[i] > nextMax) {
				nextMax = arr[i];
			}
				
		}
		max = nextMax;
		}
		System.out.println(k + " largest element is :" + max);
	}

}
