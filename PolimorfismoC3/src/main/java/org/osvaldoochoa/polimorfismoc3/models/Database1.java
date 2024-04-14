package org.osvaldoochoa.polimorfismoc3.models;

import java.util.ArrayList;

public class Database1 implements Database {
    private ArrayList<Student> studentsBdd1 = new ArrayList<>();



    @Override
    public void save(Student student) {
        studentsBdd1.add(student);
    }

    @Override
    public void update(Student student) {
        for (Student buscador : studentsBdd1){
            if (buscador.getId()==student.getId()){
                buscador.setName(student.getName());
                buscador.setAge(student.getAge());
                return;
            }
        }
    }


    public ArrayList<Student> getStudents() {
        return new ArrayList<>(studentsBdd1);
    }
}

