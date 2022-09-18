package Serialization;

import java.io.*;

public class Serialize_ {

    public static void main(String[] args) throws IOException {
        Demi d1=new Demi(5);

        FileOutputStream fos = new FileOutputStream("C:/Users/ARUP MAHATO/Desktop/Serialize.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        System.out.println("Completed");
    }
}
