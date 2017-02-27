package rico.demo.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import rico.demo.domain.Student;

import java.util.List;

/**
 * Created by Rico.Chen on 2017/2/15.
 */
@Mapper
public interface StudentMapper {

    @Select("select * from student")
    public List<Student> selectStudents();


}
