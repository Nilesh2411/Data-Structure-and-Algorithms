package com.algorithm.sorting;

public class InsertionSort {

	
	public int[] insertionSorting(int[] list){
	int i,j,key,temp;
		
	for(i=1;i<list.length;i++){
		
		key= list[i];
		j= i-1;
		while(j>=0&&key<list[j]){
			
			temp=list[j];
			list[j]=list[j+1];
			list[j+1]=temp;
			j--;
		}
		
	}
		
		return list;
		
	}

public static void main(String[] args) {
	InsertionSort v = new InsertionSort();
	int[] a = {5,6,2,1};
	System.out.println(v.insertionSorting(a));
}
}
