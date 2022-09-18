package FileClass;

import java.io.*;

public class File_Writer {

    public static void main(String[] args) throws IOException {
        File f1=new File("C:/Users/ARUP MAHATO/Desktop/ABC1.txt");

       FileWriter fw =new FileWriter(f1);
       fw.write("Arup mahato just for check bhd");
       fw.write("\n");
       fw.write("Arup mahato 2nd just for check bhd");


       fw.flush();
       fw.close();
   }
}
