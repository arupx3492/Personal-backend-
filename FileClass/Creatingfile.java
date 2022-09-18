package FileClass;

import java.io.File;
import java.io.IOException;

public class Creatingfile {

    public static void main(String[] args) throws IOException {

        File f1=new File("C:/Users/ARUP MAHATO/Desktop/ABC1.txt");
        f1.createNewFile();
        System.out.println(f1.exists());
    }
}
