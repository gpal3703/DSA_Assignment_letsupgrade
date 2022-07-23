package com.java.letsupgrade;
import java.util.*;

public class num_patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int num = 1;
			for(int j= 0;j<=i;j++) {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
		sc.close();
	}
	
}
