
public class Main {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setInt_eno(22);
		emp.setInt_salary(20000);
        emp.setStr_empname("Ekanath");
        emp.setStr_department("Java");
        
        System.out.println("Employee number is:\t" +emp.getInt_eno());
        System.out.println("Employee name is:\t" +emp.getStr_empname());
        System.out.println("Employee department is:\t" +emp.getStr_department());
        System.out.println("Employee salary is:\t" +emp.getInt_salary());
	
	
	}

	

}
