package com.arrays;

public class bubbleSort {

	
	
	void bubble(int arr[]) {
	int n = arr.length;
	
	for(int i= 0; i< n-1;i++) 
		
		for(int j= 0 ; j<n-1;j++) 
			
			if(arr[i]>arr[j+1]) {
			
			int temp = arr[i];
			
			arr[i]=arr[j+1];
			
			arr[i+1]=temp;
			
			}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}


