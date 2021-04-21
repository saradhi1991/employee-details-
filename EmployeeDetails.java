package ControlStatement;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empAge= 20;
		
		String empDptm ="IT";
		
		//if (empAge>=18 && empDptm == "IT") {
		
		//Logical OR operator
			if (empAge>=18 || empDptm == "IT") {
			System.out.println("Employee is Elgible to Work");
		}
		
		else {
			System.out.println("Employee is not Elgible to Work");	
		}
		System.out.println("Sucessfully Done!!");
	}

}
