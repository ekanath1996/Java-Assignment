

public class PermanantEmployee extends Employee{
     int int_total_salary;
	int calculatesalary(int int_pf,int int_gratuity )
	{
		int_total_salary= int_salary-(int_pf+int_gratuity);
	    return int_total_salary;
	}
	public int getInt_total_salary() {
		return int_total_salary;
	}
	public void setInt_total_salary(int int_total_salary) {
		this.int_total_salary = int_total_salary;
	}
	
	
	
	
	
}
