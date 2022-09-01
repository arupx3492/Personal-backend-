package collection_Framework.collection.IProblems.Sorting_using_compt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> sl=new ArrayList<Student>();
        sl.add(new Student(1, 456, "arup"));
        sl.add(new Student(1, 546, "ankkit"));
        sl.add(new Student(1, 785, "sarup"));
        sl.add(new Student(1, 621, "payel"));
        sl.add(new Student(1, 325, "deep"));
        sl.add(new Student(1, 23, "kartik"));

        Collections.sort(sl, new StudentmarksCom());
        for(Student s:sl){
            System.out.println(s);
        }
    }
}
