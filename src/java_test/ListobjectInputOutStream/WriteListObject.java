package java_test.ListobjectInputOutStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteListObject {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        Product product = new Product(1,"cat",12300);
        Product product1 = new Product(2,"bird",14900);
        Product product2 = new Product(3,"rat",1650);
        list.add(product);
        list.add(product1);
        list.add(product2);
        try {
            FileOutputStream fos = new FileOutputStream("src/java_test/ListobjectInputOutStream/product.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("src/java_test/ListobjectInputOutStream/product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available()>0) {
                obj = ois.readObject();
                System.out.println(obj);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
