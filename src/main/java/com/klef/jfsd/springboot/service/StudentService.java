//package com.klef.jfsd.springboot.service;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.klef.jfsd.springboot.model.Student;
//import com.klef.jfsd.springboot.repository.StudentRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    // Register a new student
//    public Student registerStudent(Student student) {
//        // Add any additional logic if needed (e.g., checking if the email already exists)
//        return studentRepository.save(student);
//    }
//
//    // Login validation
//    public Student login(String email, String password) {
//        // Use the repository method to check if the student exists based on email and password
//        return studentRepository.checkRegistrationLogin(email, password);
//    }
//
//    // Update the status of a student (e.g., active, inactive)
//    @Transactional
// 
//    // Get a list of students by department
////    public List<Student> getStudentsByDepartment(String department) {
////        return studentRepository.findByDepartment(department);
////    }
//
////    // Get a list of students by gender and department
////    public List<Student> getStudentsByGenderAndDepartment(String gender, String department) {
////        return studentRepository.findByGenderAndDepartment(gender, department);
////    }
//
//    // Get a list of students by gender
//    public List<Student> getStudentsByGender(String gender) {
//        return studentRepository.findByGender(gender);
//    }
//
//    // Get a student by ID (Optional)
//    public Optional<Student> getStudentById(int studentId) {
//        return studentRepository.findById(studentId);
//    }
//
//
//
//
//}
