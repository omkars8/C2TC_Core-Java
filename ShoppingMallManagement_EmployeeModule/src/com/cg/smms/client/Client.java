package com.cg.smms.client;


import com.cg.smms.entities.Employee;
import com.cg.smms.service.IEmployeeService;
import com.cg.smms.service.IEmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		
     IEmployeeService service =new IEmployeeServiceImpl();
      
     Employee employee=new Employee();
     
     //create operation
     employee.setId(1);
     employee.setName("omkar");
     employee.setDob("11/5/1999");
     employee.setSalary(25000.0f);
     employee.setAddress("Pune");
     employee.setDesignation("Salesman");
     employee.setShop("Clothing");
     service.addEmployee(employee);
     System.out.println("entry is added");
     
	//Retrieve operation
     employee = service.searchEmployee(1);
     System.out.println("ID:"+employee.getId());
	 System.out.println("Name:"+employee.getName());
	 System.out.println("Dob:"+employee.getDob());
	 System.out.println("Salary:"+employee.getSalary());
	 System.out.println("Address:"+employee.getAddress());
	 System.out.println("Designation:"+employee.getDesignation());
	 System.out.println("Shop:"+employee.getShop());
		  
	/* //update operation 
	 employee = service.searchEmployee(1);
	 employee.setName("Sachin");
	 service.updateEmployee(employee);
	 System.out.println("Update Done");
		   
	//delete operation 
	 employee = service.searchEmployee(1);
     service.deleteEmployee(employee);
	 System.out.println("End of program/Life cycle completed...");*/	
	}

}
