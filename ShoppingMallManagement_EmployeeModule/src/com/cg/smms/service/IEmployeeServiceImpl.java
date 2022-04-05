package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.repository.IEmployeeRepository;
import com.cg.smms.repository.IEmployeeRepositoryImpl;

public class IEmployeeServiceImpl implements IEmployeeService {
	
	IEmployeeRepository dao;

	public IEmployeeServiceImpl() {
		dao= new IEmployeeRepositoryImpl();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		dao.beginTransaction();
		dao.addEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		dao.beginTransaction();
		dao.updateEmployee(employee);
		dao.commitTransaction();
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee=dao.searchEmployee(id);
	 return employee;
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		dao.beginTransaction();
		dao.deleteEmployee(employee);
		dao.commitTransaction();
		return employee;
	}
	

}
