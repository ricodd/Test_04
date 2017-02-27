package rico.demo.domain;

import java.io.Serializable;

/**
 * Created by Rico.Chen on 2017/2/15.
 */
public class Student implements Serializable {

    private Long id;
    private String name;
    private int age;
    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
