
public class Main {

	public static void main(String[] args) {
		
		PermanantEmployee emp=new PermanantEmployee();
        
		//Employee emp=new Employee();
		emp.setInt_eno(22);
		emp.setInt_salary(20000);
        emp.setStr_empname("Ekanath");
        emp.setStr_department("Java");
        
        emp.setInt_total_salary(emp.calculatesalary(2000,1000));
        
       
        
        
        
        System.out.println("Employee number is:\t" +emp.getInt_eno());
        System.out.println("Employee name is:\t" +emp.getStr_empname());
        System.out.println("Employee department is:\t" +emp.getStr_department());
        System.out.println("Employee total salary is: " +emp.getInt_total_salary());
    	
	
	}

	

}
