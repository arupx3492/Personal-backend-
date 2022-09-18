package FileClass;

import java.io.*;

public class File_Input_Stream {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:/Users/ARUP MAHATO/Desktop/202-2026612_small.jpg");
        FileOutputStream fos = new FileOutputStream("C:/Users/ARUP MAHATO/Desktop/xfolder/copyImage");
        int i = fis.read();
        while (i != -1) {
        fos.write(i);
        i=fis.read();
        }
        fos.flush();
        fos.close();
    }
}
