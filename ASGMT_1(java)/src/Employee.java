
public class Employee {
	
	
	private int int_ms;
	private int int_nm;
	public int int_ys;
	public Employee(int int_msa,int int_nmo)
	{
		
	
		this.int_ms=int_msa;
		this.int_nm=int_nmo;
		
	}
public  int calculateSalary()
   {
	int_ys=int_ms*int_nm;   
	   
	return int_ys;
   }
   
  
}
