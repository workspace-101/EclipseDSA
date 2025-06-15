package com.java.two_Array;

import java.util.Scanner;

public class Lecture_4 {

	public static void main(String[] args) {
		int arr[]=entering_Input_In_An_Array();
		System.out.println("Given Array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sorting_An_0_1_Array(arr);
	}
	
	private static int[] entering_Input_In_An_Array() {
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=cs.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=cs.nextInt();
			
		}
		return arr;
		}

	private static void sorting_An_0_1_Array(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=0;
			
		}
	}
}
