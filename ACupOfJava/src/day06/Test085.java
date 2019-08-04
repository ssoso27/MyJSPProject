package day06;

import java.io.*;

public class Test085 {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("d.dat") );
        out.writeInt(10101);
        out.writeInt(10102);
        out.writeInt(10103);
        out.writeUTF("치킨");
        out.close();

        ObjectInputStream in = new ObjectInputStream( new FileInputStream("d.dat") );
        int a = in.readInt();
        int b = in.readInt();
        int c = in.readInt();
        String d = in.readUTF();
        in.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
