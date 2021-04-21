package ControlStatement;

public class PatternsPrint {
	
	public static void main(String[] args) {
		   
		//i for rows and j for columns      
		 
		int i, j, row=30;   
		//outer loop for rows  
		for(i=5; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=5; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("@");   
		}    
		System.out.print("@");
 
		System.out.println();   
		}   
		}   
		} 