package com.gl.Clgfstmgmt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.Clgfstmgmt.entity.Student;
import com.gl.Clgfstmgmt.service.StudentService;

@Controller
@RequestMapping("students")
public class StudentController {

	private StudentService studentService;
	// we will use constructor level dependency injection

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// list our data
	@GetMapping("/list")
	public String listStudent(Model model) {// go fo ui model
		// we want list of students hence
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		return "student/student-list";
	}

	// form
	@GetMapping("/showStudentFormForAdd")
	public String showStudentForm(Model model) {// go fo ui model
		Student student = new Student();
		model.addAttribute("student", student);
		return "student/student-form";
	}

	// now we will save and redirect to our homepage
	@PostMapping("/saveStudent")
	public String saveStudent(Model model, @ModelAttribute("student") Student student) {
		// now we will bind the data and save it using service object
		studentService.save(student);
		return "redirect:/students/list";
	}

	// now to edit we will use this api
	@GetMapping("/studentFormForEdit/{id}")
	public String studentFormForEdit(Model model, @PathVariable int id) {// go fo ui model
		Student student = studentService.findbyId(id);
		model.addAttribute("student", student);
		return "student/student-form";
	}

	// delete by id
	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {// go fo ui model
		studentService.deleteByid(id);
		return "redirect:/students/list";
	}

}
