//package com.klef.jfsd.springboot.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//import com.klef.jfsd.springboot.model.Student;
//import com.klef.jfsd.springboot.service.StudentService;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping("/")
//    public ModelAndView home() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("home");
//        return mv;
//    }
//
//    @GetMapping("studentreg")
//    public ModelAndView studentReg() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("studentreg");
//        return mv;
//    }
//
//    @GetMapping("studentlogin")
//    public ModelAndView studentLogin() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("studentlogin");
//        return mv;
//    }
//
//    @GetMapping("updatestudent")
//    public ModelAndView updateStudent() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("updatestudent");
//        return mv;
//    }
//
//    @PostMapping("insertstudent")
//    public ModelAndView insertStudent(HttpServletRequest request) {
//        String name = request.getParameter("sname");
//
//       String gender = request.getParameter("sgender");
//        String email = request.getParameter("semail");
//        String password = request.getParameter("spwd");
//       
//        Student student = new Student(name,password,email,gender);
//        student.setUsername(name);
//        student.setGender(gender);
//        
//     
//      
//        student.setEmail(email);
//        student.setPassword(password);
//     
//
//        Student msg = studentService.registerStudent(student);
//
//        ModelAndView mv = new ModelAndView("regsuccess");
//        mv.addObject("message", msg);
//
//        return mv;
//    }
//
//    @PostMapping("checkregistrationlogin")
//    public ModelAndView checkRegistrationLogin(HttpServletRequest request) {
//        ModelAndView mv = new ModelAndView();
//
//        String email = request.getParameter("semail");
//        String password = request.getParameter("spwd");
//
//        // Check if the student exists with the provided credentials
//        Student student = studentService.login(email, password);
//
//        if (student != null) {
//            // If student is found, set the session and redirect to the student home page
//            HttpSession session = request.getSession();
//            session.setAttribute("student", student);  // student is session variable
//
//            mv.setViewName("studenthome");
//        } else {
//            // If student is not found, show the login page again with an error message
//            mv.setViewName("studentlogin");
//            mv.addObject("message", "Invalid credentials. Please try again.");
//        }
//
//        return mv;
//    }
//
//    @GetMapping("studentsessionexpiry")
//    public ModelAndView studentSessionExpiry() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("studentsessionexpiry");
//        return mv;
//    }
//
//    @GetMapping("studenthome")
//    public ModelAndView studentHome() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("studenthome");
//        return mv;
//    }
//
//    @GetMapping("studentprofile")
//    public ModelAndView studentProfile() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("studentprofile");
//        return mv;
//    }
//
//   
//
//         
//         
//
//         
//
//    @GetMapping("studentcontactus")
//    public ModelAndView studentContactUs() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("studentcontactus");
//        return mv;
//    }
//
//    @GetMapping("studentlogout")
//    public ModelAndView studentLogout(HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        session.removeAttribute("student");
//        //session.invalidate();  -->to remove all session attributes
//
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("studentlogin");
//        return mv;
//    }
//}
