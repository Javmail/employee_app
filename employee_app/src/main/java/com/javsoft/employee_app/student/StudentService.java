package com.javsoft.employee_app.student;

import java.time.LocalDate;
import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    // public List<Student> getStudents() {
    //     return List.of(
	// 			new Student(1, "Mariam", "mariam@yahoo.com", 
	// 			LocalDate.of(2006, 2, 11), 27)
	// 		);
    // }

    public Student getStudent(){
        return new Student(2, "Shyla Stylez", "shyla.stylez@yahoo.com", 
				LocalDate.of(2006, 2, 11));
    }

    public void addNewStudent(Student student) {
        // Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        studentRepository.save(student);
    }
}
