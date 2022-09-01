package collection_Framework.collection.IProblems.Sorting_using_compt;

public class Student {
   private int role;
   private int marks;
   private String name;

   public Student(int role, int marks, String name) {
       this.role = role;
       this.marks = marks;
       this.name = name;
   }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "role=" + role +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
