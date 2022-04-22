package _17_io_binary_file_serialization.exercise.ManegeProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRun {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> listProduct = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "santafe", "hyundai", 10000);
        Product product1 = new Product(2, "k5", "kiA", 14000);
        Product product2 = new Product(3, "luxA", "vinfast", 12000);
        listProduct.add(product);
        listProduct.add(product1);
        listProduct.add(product2);
        write("src/_17_io_binary_file_serialization/exercise/ManegeProduct/Text.txt", listProduct);
        boolean flag = true;
        while (flag) {
            System.out.println("1: Display");
            System.out.println("2: Add");
            System.out.println("3: Search");
            System.out.println("4: Exit");
            System.out.println("Enter choise:");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    display();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    findById();
                    break;
                case 4:
                    flag = false;
            }
        }
    }

    public static void display() {
        read();
    }

    public static void add() {
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, brand, price);
        listProduct.add(product);
        write("src/_17_io_binary_file_serialization/exercise/ManegeProduct/Text.txt", listProduct);
    }

    public static void findById() {
        System.out.println("Enter id: ");
        int id = scanner.nextInt();

        for (Product item : listProduct) {
            if (item.getId() == id) {
                System.out.println(item);
            }
        }
    }

    public static void write(String path, List<Product> list) {
        File file = new File(path);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file, false);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void read() {
        Object obj = null;
        try {
            FileInputStream fis = new FileInputStream("src/_17_io_binary_file_serialization/exercise/ManegeProduct/Text.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (fis.available() > 0) {
                obj = ois.readObject();
                System.out.println(obj);
            }
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
