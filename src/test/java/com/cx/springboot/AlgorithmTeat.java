package com.cx.springboot;

import java.util.Scanner;

public class AlgorithmTeat {

	public static void main(String[] arg0){
		int number = 1,month;
		int tmp1 = 1,tmp2=1;
		Scanner sc= new Scanner(System.in);
		month=sc.nextInt();
		for(int i=1;i<=month;i++){
			if(i<=2){
				number = 1;
			}else{
				number = tmp1+tmp2;
			}
		}
	}
}
