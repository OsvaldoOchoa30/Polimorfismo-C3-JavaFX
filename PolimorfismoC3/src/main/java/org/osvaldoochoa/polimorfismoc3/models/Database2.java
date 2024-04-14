package org.osvaldoochoa.polimorfismoc3.models;

import java.util.ArrayList;

public class Database2 implements Database {
    private ArrayList<Student> studentsBdd2 = new ArrayList<>();

    @Override
    public void save(Student student) {
        studentsBdd2.add(student);
    }

    @Override
    public void update(Student student) {
        for (Student i : studentsBdd2) {
            if (i.getId() == student.getId()) {
                i.setName(student.getName());
                i.setLname(student.getLname());
                i.setAge(student.getAge());

                return;
            }
        }

    }

    @Override
    public ArrayList<Student> getStudents() {
        return new ArrayList<>(studentsBdd2);
    }
}

/*






    @Override
    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students2);
    }
}*/