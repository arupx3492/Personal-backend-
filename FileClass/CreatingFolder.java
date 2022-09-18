package FileClass;

import java.io.File;

public class CreatingFolder {

    public static void main(String[] args) {
                File f1=new File("C:/Users/ARUP MAHATO/Desktop/xfolder");

        System.out.println(f1.exists());
        f1.mkdir();
        System.out.println(f1.exists());

    }
}
