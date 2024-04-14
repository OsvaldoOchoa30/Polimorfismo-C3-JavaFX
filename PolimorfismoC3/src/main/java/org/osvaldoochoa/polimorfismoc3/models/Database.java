package org.osvaldoochoa.polimorfismoc3.models;

import java.util.ArrayList;

public interface Database {
    void save(Student student);
    void update(Student student);

    ArrayList<Student> getStudents();
}

