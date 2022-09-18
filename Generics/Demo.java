package Generics;

public class Demo {
    public static void main(String[] args) {
        My_genrics<String> mygen = new My_genrics("Arup");
        String ans1=mygen.get();
        System.out.println(ans1);


        My_genrics<Integer> mygen1 = new My_genrics(5);
        int ans2= mygen1.get();
        System.out.println(ans2);
    }
}
