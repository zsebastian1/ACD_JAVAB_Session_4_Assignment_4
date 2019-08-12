package ACADAssignments;

import java.util.Scanner;

public class Assignment4_4 {

	public static void main(String[] args) {
		
		//recursive code 
	//	Scanner input = new Scanner(System.in);
		
		int [] arr = {3, 11, 76, 12, 4, 67, 9, 6, 1, 8};
		
		System.out.println("The orginial array is: ");
		printArray(arr);
		
		recursiveCall(arr);
		
		System.out.println("The sorted array is: ");
		printArray(arr);
		
		
	}
	
	public static void recursiveCall(int[] abc) {
	
		//Scanner input = new Scanner(System.in);

		//abc = new int[10];
		
		int n = abc.length; 
	        for (int i = 0; i < n-1; i++) 
	            for (int j = 0; j < n-i-1; j++) 
	                if (abc[j] > abc[j+1]) 
	                { 
	                    int temp = abc[j]; 
	                    abc[j] = abc[j+1]; 
	                    abc[j+1] = temp; 
	                } 
		}
	  static void printArray(int abc[]) { 
	        int n = abc.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(abc[i] + " "); 
	        System.out.println(); 
	    } 
	 
	}


