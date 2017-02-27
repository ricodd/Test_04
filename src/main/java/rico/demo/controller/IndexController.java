package rico.demo.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import rico.demo.domain.Student;
import rico.demo.service.StudentService;

import java.util.List;


@Controller
@Slf4j
public class IndexController {



    @Autowired
    private StudentService studentService;

    @RequestMapping("/index.html")
    public String toIndexPage(ModelMap modelMap) {
        List<Student> studentList = studentService.getStudents();
        if(studentList != null) {
            for(Student student : studentList) {
                log.info(student.getId() + student.getName() + student.getAge());
            }
        }
        modelMap.put("studentList", studentList);
        log.info("+++");
        return "index";
    }
}
