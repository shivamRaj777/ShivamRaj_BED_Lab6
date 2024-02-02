package com.gl.Clgfstmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.Clgfstmgmt.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
