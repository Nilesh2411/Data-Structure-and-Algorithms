package com.algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	
	
	public int[] bubleSort(int[] list){
		int i ,j, temp=0;
		
		for(i=0;i<list.length-1;i++){
			for(j=0;j<list.length-1-i;j++){
				if(list[j]>list[j+1]){
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]= temp;
				}
			}
		}
		return list;
		
	}
	
	
	public static void main(String[] args) {
		BubbleSort b= new BubbleSort();
		
		
	}
	
	
}
