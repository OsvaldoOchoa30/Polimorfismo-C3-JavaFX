package org.osvaldoochoa.polimorfismoc3.models;
import java.util.ArrayList;


public class Database3 implements Database {
    private ArrayList<Student> studentsBdd3 = new ArrayList<>();

    @Override
    public void save(Student student) {
        studentsBdd3.add(student);
        System.out.println("Registro guardado en la base de datos 3");
    }

    @Override
    public void update(Student student) {
        for (Student i : studentsBdd3){
            if (i.getId() == student.getId()){
                i.setName(student.getName());
                i.setLname(student.getLname());
                i.setAge(student.getAge());
                return;
            }
        }
    }

    @Override
    public ArrayList<Student> getStudents() {
        return new ArrayList<>(studentsBdd3);
    }
}
