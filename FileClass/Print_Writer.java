package FileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_Writer {

    public static void main(String[] args) throws FileNotFoundException {

                File f1=new File("C:/Users/ARUP MAHATO/Desktop/ABC1.txt");
        PrintWriter pw=new PrintWriter(f1);
        pw.println("This is from print Writer class");

        pw.close();
        System.out.println("Completed");

    }
}
