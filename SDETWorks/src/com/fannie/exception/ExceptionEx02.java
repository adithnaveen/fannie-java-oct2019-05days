package com.fannie.exception;

public class ExceptionEx02 {

	public static void checkName(String name) throws NameTooShortException {
		if (name.length() < 5) {
			throw new NameTooShortException("Sorry Name cannot be less than 5 chars");
		}
	}

	public static void calculateTax(int salary, String name) 
		throws Exception{
		try {
			checkName(name);

			if (salary < 4000) {
				// TODO throw an exception - with message
				throw new RuntimeException("Sorry your salary is too less for IT Dept,\n" 
						+ " Mr/Ms/Mrs " + name
						+ ", declared Salary : " + salary);

			} else if (salary >= 4000 && salary < 8000) {
				// TODO throw an exception - with message
			} else {
				System.out.println("You Tax is accepted Mr/Ms/Mrs: " + 
						name + " For salary " + salary);
			}
		} catch (NameTooShortException ntse) {
			throw new Exception("Sorry IT Dept did not accept due to too short Name", ntse); 
		}
	}

	public static void main(String[] args) {
		try {
			calculateTax(1244, "Har");
		} catch (Exception re) {
			re.printStackTrace();
		}

		System.out.println("Some Business Logic Goes Here... ");
	}
}
