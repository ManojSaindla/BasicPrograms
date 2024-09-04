package com.basicPrograms;

import java.io.InputStream;
import java.util.Scanner;

public class FactorialProgram {
	
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	double n = sc.nextInt();
	
		int fact =1;
		for(int i=1;i<=n;i++){
			fact= fact* i;
		
		}
System.out.println(fact);
		
	}
	}


