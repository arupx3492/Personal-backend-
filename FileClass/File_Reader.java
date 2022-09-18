package FileClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

    public static void main(String[] args) throws IOException {
        File f1=new File("C:/Users/ARUP MAHATO/Desktop/ABC1.txt");
      FileReader fr=new FileReader(f1);
      // this is the first way to do it
//               int l=fr.read();
//               while(l!=-1){
//                   System.out.print(((char)l));
//                   l=fr.read();
//               }

        char[] arr=new char[(int) f1.length()];
        fr.read(arr);
        for(char c:arr){
            System.out.print(c);
        }
    }
}
