package bayezid;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher Sakib = new Teacher(1,"Sakib",30000);
        Teacher Rakib = new Teacher(2,"Rakib",35000);
        Teacher Sreya = new Teacher(3,"Sreya",40000);

        List<Teacher> teacherlist =new ArrayList<>();
        teacherlist.add(Sakib);
        teacherlist.add(Rakib);
        teacherlist.add(Sreya);


        Student redowan=new Student(1,"Redowan",7);
        Student bayezid=new Student(2,"Bayezid",8);
        Student sathi=new Student(3,"Sathi",9);
        Student boishakhi=new Student(4,"Boishakhi",10);

        List<Student> studentList=new ArrayList<>();
        studentList.add(redowan);
        studentList.add(bayezid);
        studentList.add(sathi);
        studentList.add(boishakhi);



        School lhs = new School(teacherlist,studentList);

        redowan.payFees(5000);
        bayezid.payFees(5000);
        sathi.payFees(5000);
        boishakhi.payFees(5000);




    }
}
