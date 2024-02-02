package com.gl.Clgfstmgmt.service;

import java.util.List;

import com.gl.Clgfstmgmt.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findbyId(int id);

	public void save(Student theStudent);

	public void deleteByid(int id);
}
