package org.osvaldoochoa.polimorfismoc3.models;
import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String name;

    private String lname;
    private int age;
    private int id;

    public Student(String name, String lname, int age, int id) {
        this.name = name;
        this.lname = lname;
        this.age = age;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

}
/*


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(nombre, student.nombre) && Objects.equals(apellido, student.apellido);
    }


}*/