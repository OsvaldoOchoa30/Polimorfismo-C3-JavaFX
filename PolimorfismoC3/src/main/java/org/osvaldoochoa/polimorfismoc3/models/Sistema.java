package org.osvaldoochoa.polimorfismoc3.models;
import java.util.ArrayList;

public class Sistema{

    private Database1 database1;
    private Database2 database2;
    private Database3 database3;

    private ArrayList<Database> datab = new ArrayList<>();

    public Sistema() {
        database1 = new Database1();
        database2 = new Database2();
        database3 = new Database3();
        datab.add(database1);
        datab.add(database2);
        datab.add(database3);
    }

    public void save(Student student) {
        for (Database i : datab) {
            i.save(student);

        }
    }

    public void update(Student modificarEstudiante, Student estudianteOriginal) {
        for (Database j : datab) {
            j.update(modificarEstudiante);

        }
    }

    public void printStudents() {
        System.out.println("Estudiantes en la Escuela:");

        for (Database k : datab) {
            System.out.println("Base de Datos: " + k.getClass().getSimpleName());
            for (Student student : k.getStudents()) {
                System.out.println(student);
            }
            System.out.println();
        }


    }
}

