package collection_Framework.collection.IProblems.Sorting_using_compt;

import java.util.Comparator;

public class StudentmarksCom implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks()<o2.getMarks()){
            return +1;
        }else if(o1.getMarks()>o2.getMarks()){
            return -1;
        }else{
            return 0;
        }
    }
}
