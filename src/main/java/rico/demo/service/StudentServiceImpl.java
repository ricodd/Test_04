package rico.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rico.demo.domain.Student;
import rico.demo.repository.StudentMapper;

import java.util.List;

@Service
public class StudentServiceImpl implements  StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudents() {
        return this.studentMapper.selectStudents();
    }
}
