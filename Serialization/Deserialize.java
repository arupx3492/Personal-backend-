package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("C:/Users/ARUP MAHATO/Desktop/Serialize.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
      Object ans=ois.readObject();
        Demi d1=(Demi)ans;
        d1.fun1();


    }
}
