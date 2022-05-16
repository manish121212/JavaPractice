package custom_comp;

import java.util.Comparator;

import com.app.core.Student;

public class CompareMarks implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
     
     return ((Double)o1.getMarks()).compareTo(o2.getMarks());
    }
    
    
}
