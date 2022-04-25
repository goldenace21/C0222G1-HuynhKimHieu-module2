package java_test.SingleObjectInputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteSingleObject {
    public static void main(String[] args) {
        Product product = new Product(1,"hat",12000);
        try {
            FileOutputStream fos = new FileOutputStream("src/java_test/SingleObjectInputOutputStream/product.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(product);

            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
