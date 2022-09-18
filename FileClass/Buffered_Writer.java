package FileClass;

import java.io.*;

public class Buffered_Writer {

    public static void main(String[] args) throws IOException {
        File f1=new File("C:/Users/ARUP MAHATO/Desktop/ABC1.txt");
        FileWriter fw=new FileWriter(f1);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("This is from BufferedWriter1");
        bw.newLine();
        bw.write("This is from BufferedWriter2");

        bw.flush();
        bw.close();
    }
}
