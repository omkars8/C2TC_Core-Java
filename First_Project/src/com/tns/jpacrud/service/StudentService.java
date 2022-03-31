package com.tns.jpacrud.service;

import com.tns.jpacrud.entity.Student;

public interface StudentService {

	public abstract Student findStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
}
