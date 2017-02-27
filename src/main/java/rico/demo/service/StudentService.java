package rico.demo.service;

import org.springframework.stereotype.Service;
import rico.demo.domain.Student;
import rico.demo.repository.StudentMapper;

import java.util.List;

/**
 * Created by Rico.Chen on 2017/2/15.
 */
@Service
public interface StudentService {

    public List<Student> getStudents();
}
