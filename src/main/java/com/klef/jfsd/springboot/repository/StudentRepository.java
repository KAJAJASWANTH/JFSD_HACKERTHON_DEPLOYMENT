//package com.klef.jfsd.springboot.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import com.klef.jfsd.springboot.model.Student;
//
//import jakarta.transaction.Transactional;
//import java.util.List;
//
//@Repository
//public interface StudentRepository extends JpaRepository<Student, Integer> {
//
//    // Check registration/login using email and password
//    @Query("select s from Student s where s.email = ?1 and s.password = ?2")
//    public Student checkRegistrationLogin(String email, String password);
//    
//    // Update student status (e.g., active/inactive)
//   
//    
////    // Find students by department
////    public List<Student> findByDepartment(String department);
////    
////    // Find students by gender and department
////    public List<Student> findByGenderAndDepartment(String gender, String department);
////    
//    // Find students by gender
//    public List<Student> findByGender(String gender);
//}
