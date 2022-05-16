package Utils;

import java.util.*;

import com.app.core.Student;

public class CollectionUtils {
    
    public static ArrayList<Student> populateStudent()
    { 
        ArrayList<Student> student=new ArrayList<>();
        student.add(new Student("123","Manish","man@gmail.com",80.0,"DaC"));
        student.add(new Student("1233","Sachin","sac@gmail.com",70.0,"DaC"));  
         student.add(new Student("13","Kannu","kannu@gmail.com",10.0,"IOT"));
        return student;
    }
}
