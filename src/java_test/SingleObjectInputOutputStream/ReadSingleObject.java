package java_test.SingleObjectInputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSingleObject {
    public static void main(String[] args) {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("src/java_test/SingleObjectInputOutputStream/product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (obj==null) {
            System.out.println("Nothing");
        } else {
            System.out.println(obj);
        }
    }
}
