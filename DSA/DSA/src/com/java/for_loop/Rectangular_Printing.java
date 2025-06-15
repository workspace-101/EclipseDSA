package com.java.for_loop;

public class Rectangular_Printing {

	public static void main(String[] args) {
		ractangular();
	}

	private static void ractangular() {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
