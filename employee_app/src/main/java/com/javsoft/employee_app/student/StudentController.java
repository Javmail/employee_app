package com.javsoft.employee_app.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
 
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getstudents")
	public List<Student> getStudents() {
		return this.studentService.getStudents();
	}

	@GetMapping("/getstudent")
	public Student getStudent() {
		return this.studentService.getStudent();
	}

    @PostMapping("/addnewstudent")
    public void addNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
    
}
